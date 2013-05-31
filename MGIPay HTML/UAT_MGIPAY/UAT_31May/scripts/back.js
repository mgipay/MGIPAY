var isIE = /*@cc_on!@*/false; 
function noBack(){
	window.history.forward();
  	setTimeout(function(){
  	noBack();
},0);
}

var logoutbutton;

$(document).ready(function() {
	
	if(isIE)
	{
		logoutbutton = decode64($.cookie("logoutClicked"));
	}
	else 
	{
		logoutbutton = decode64(localStorage.logoutClicked);
	}
	if(logoutbutton == "true"){
		$("#preview").hide();
		noBack();
		window.onload=noBack;
		window.onpageshow=function(evt){if(evt.persisted)noBack()}
		window.onunload=function(){void(0)}
	}
});