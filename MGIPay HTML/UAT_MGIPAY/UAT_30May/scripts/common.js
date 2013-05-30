var loggedIn;
var isIE = /*@cc_on!@*/false; 

$(document).ready(function() {
	if(isIE) {
		loggedIn = $.cookie("userLogin");
	} else {
		loggedIn = localStorage.getItem("userLogin");
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