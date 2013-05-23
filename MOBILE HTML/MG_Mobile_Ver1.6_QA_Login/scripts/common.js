var logoutbutton;
$.browser.chrome = /chrome/.test(navigator.userAgent.toLowerCase());

$(document).ready(function() {
	if($.browser.chrome) {
		logoutbutton = localStorage.logoutClicked;
	} else {
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

function noBack(){
	window.history.forward();
  	setTimeout(function(){
  	noBack();
},0);
}
