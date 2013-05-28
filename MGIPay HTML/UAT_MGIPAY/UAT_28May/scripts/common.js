var loggedIn;
$.browser.chrome = /chrome/.test(navigator.userAgent.toLowerCase());

$(document).ready(function() {
	if($.browser.chrome) {
		loggedIn = localStorage.getItem("userLogin");
	} else {
		loggedIn = $.cookie("userLogin");
	}
	
	if(loggedIn == "yes")
	{
		$(".topNav").addClass("loginNav");
		$("#logoutLink").removeClass("displaynone").addClass("displayinline");
		$("#historyLink").removeClass("displaynone").addClass("displayinline");
		$(".topNav #contactUsLink").attr("border-right","1px solid #333333");
	}
	else
	{
		$("#logoutLink").addClass("displaynone").removeClass("displayinline");
		$("#historyLink").addClass("displaynone").removeClass("displayinline");
		$(".topNav #contactUsLink").css("border-right","0px none");
	}
});