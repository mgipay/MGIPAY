
var withdrawfeeFlag = false;
var feeLimitFlag = false;
var loggedIn;
$.browser.chrome = /chrome/.test(navigator.userAgent.toLowerCase());
$(document).ready(function() {
	
				$("#fee_withdrawCash").click(function() {
					withdrawfeeFlag = true;
					callWithdrawCashResponse();
					$('#fee_tooltip_withdrawCash').slideDown(800);
				});
				$("#fancybox-close_withdrawCash").click(function() {
					withdrawfeeFlag = false;
					$('#fee_tooltip_withdrawCash').hide(800);
				});
				
				$("#fee_limitFee").click(function() {
					feeLimitFlag = true;
					callFeeLimitResponse();
					$('#fee_tooltip_limitFee').slideDown(800);
				});
				
				$("#fancybox-close_limitFee").click(function() {
					feeLimitFlag = false;
					$('#fee_tooltip_limitFee').hide(800);
				});
				if($.browser.chrome)
				{
					loggedIn = localStorage.getItem("userLogin");
				}
				else 
				{
					loggedIn = $.cookie("userLogin"); 
				}
				if(loggedIn == "yes")
				{
					$("#loginDisable").removeClass("paypal_login").addClass("loginPaypalNone");
				}
				else
				{
					$("#loginDisable").addClass("paypal_login").removeClass("loginPaypalNone");
				}
				$('.paypal_login').click(function () {
					//window.location.href = "blank.html";
						
					window.location.href = "https://www.stage2cp07.stage.paypal.com:8443/webapps/auth/protocol/openidconnect/v1/authorize?client_id=mgi_fundsout_qa_env.moneygram.com&response_type=code&scope=profile email address phone https://uri.paypal.com/services/AdaptivePaymentsPayAPI openid&redirect_uri=https://qapaypal.qa.moneygram.com/mobile/blank.html";
							
});
				
});

