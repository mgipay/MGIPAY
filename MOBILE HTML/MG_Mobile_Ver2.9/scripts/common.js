var logoutbutton;
var IsBackClicked;
var isIE = /*@cc_on!@*/false; 

$(document).ready(function() {
	if(isIE) {
		logoutbutton = $.cookie("logoutClicked");
	} else {
		logoutbutton = localStorage.logoutClicked;
	}
	if(logoutbutton == "true"){
		if(isIE) {
			IsBackClicked = $.cookie("IsBackClicked");
		} else {
			IsBackClicked = localStorage.IsBackClicked;
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
