var isIE = /*@cc_on!@*/false; 
var loginResponse;
$(document).ready(function() {
	$(".footer_year").text((new Date).getFullYear() + " - " + (parseInt((new Date).getFullYear()) + 1));
	if(isIE) {
		loginResponse = $.cookie("loginResponse");
	} else {
		loginResponse = localStorage.getItem("loginResponse");
	}
	if(loginResponse == null || loginResponse == "" || loginResponse == undefined)
	{
		$("#homeText").removeClass("displaynone").addClass("displayblock");
		$("#paypalHomeLink").removeClass("withdrawbutton");
		$("#withdrawText").removeClass("displayblock").addClass("displaynone");
	}
	else
	{
		$("#homeText").removeClass("displayblock").addClass("displaynone");
		$("#paypalHomeLink").addClass("withdrawbutton");
		$("#withdrawText").removeClass("displaynone").addClass("displayblock");
	
	}
	$('#navfootermenuHome > a').click(function(){
		if(loginResponse == null || loginResponse == "" || loginResponse == undefined)
		{
					if(isIE){
						$.cookie("IsBackClicked", "false");
					}
					else
					{
						localStorage.IsBackClicked = "false";
					}
		}
		else
		{
					if(isIE){
						$.cookie("IsBackClicked", "true");
					}
					else
					{
						localStorage.IsBackClicked = "true";
					}
		}
		});
});

function goTopaypalWithdraw()

{
		if($('#paypalHomeLink').hasClass("withdrawbutton"))
		{
			window.location.href = "withdraw-money.html";
		}
		else
		{
			//window.location.href = "blank.html";
			
			window.location.href = "https://www.stage2cp07.stage.paypal.com:8443/webapps/auth/protocol/openidconnect/v1/authorize?client_id=mgi_fundsout_qa_env.moneygram.com&response_type=code&scope=profile email address phone https://uri.paypal.com/services/AdaptivePaymentsPayAPI openid&redirect_uri=https://devpaypal.qa.moneygram.com/mobile/blank.html";
			
		}
}

