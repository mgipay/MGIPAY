var loggedIn;
var logoutbutton;
$.browser.chrome = /chrome/.test(navigator.userAgent.toLowerCase());

$(document).ready(function() {
	if($.browser.chrome) {
		loggedIn = localStorage.getItem("userLogin");
		logoutbutton = localStorage.logoutClicked;
	} else {
		loggedIn = $.cookie("userLogin");
		logoutbutton = $.cookie("logoutClicked");
	}

	if(logoutbutton == "true"){
		$("#preview").hide();
		noBack();
		window.onload=noBack;
		window.onpageshow=function(evt){if(evt.persisted)noBack()}
		window.onunload=function(){void(0)}
	}
	
	if(loggedIn == "yes")
	{
		$("#historyLink").addClass("displayblock").removeClass("displaynone");
		$("#loginLink").removeClass("displayblock").addClass("displaynone");
		$("#logoutLink").addClass("displayblock").removeClass("displaynone");
	}
	else
	{
		$("#loginLink").addClass("displayblock").removeClass("displaynone");
		$("#logoutLink").addClass("displaynone").removeClass("displayblock");
		$("#historyLink").removeClass("displayblock").addClass("displaynone");
	}
});

function noBack(){
	window.history.forward();
  	setTimeout(function(){
  	noBack();
},0);
}
