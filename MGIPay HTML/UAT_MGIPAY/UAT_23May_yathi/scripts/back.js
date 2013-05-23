function noBack(){
	window.history.forward();
  	setTimeout(function(){
  	noBack();
},0);
}

var logoutbutton;

$(document).ready(function() {
	$.browser.chrome = /chrome/.test(navigator.userAgent.toLowerCase());
	if($.browser.chrome)
	{
		logoutbutton = localStorage.logoutClicked;
	}
	else 
	{
		logoutbutton = $.cookie("logoutClicked");
	}
	if(logoutbutton == "true"){
		$("#preview").hide();
		noBack();
		window.onload=noBack;
		window.onpageshow=function(evt){if(evt.persisted)noBack()}
		window.onunload=function(){void(0)}
	}
});