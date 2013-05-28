var logoutbutton;
var IsBackClicked;
$.browser.chrome = /chrome/.test(navigator.userAgent.toLowerCase());

$(document).ready(function() {
	if($.browser.chrome) {
		logoutbutton = localStorage.logoutClicked;
	} else {
		logoutbutton = $.cookie("logoutClicked");
	}
	if(logoutbutton == "true"){
		if($.browser.chrome) {
			IsBackClicked = localStorage.IsBackClicked;
		} else {
			IsBackClicked = $.cookie("IsBackClicked");
		}
		if(IsBackClicked == "true")
		{
			$("#preview").show();
			noBack();
			window.onload=noBack;
			window.onpageshow=function(evt){if(evt.persisted)noBack()}
			window.onunload=function(){void(0)}
		}
		else
		{
			$("#preview").hide();
		}
	}

});

function noBack(){
	window.history.forward();
  	setTimeout(function(){
  	noBack();
	},0);
}
