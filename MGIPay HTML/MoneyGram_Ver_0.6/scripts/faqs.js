var feeFlag = 1;

$(document).ready(function() {
		//callService(methods.GetFeeLinkValue[0], methods.GetFeeLinkValue[1], "", "", null, faqFeeSuccessHandler, faqFeeFailureHandler);
	
	$("#feeFaq").click(function() {
		feeClicked = 0;
		callFeeResponse();
	$('#feeTooltipFaq').slideDown(55);
	});
	$("#fancyboxCloseFaq").click(function() {
			$('#feeTooltipFaq').hide(55);
	});
	
	$("#fee2Faq").click(function() {
		feeClicked = 1;
		callFeeResponse();
			$('#feeTooltip2Faq').slideDown(55);
	});
	$("#fancyboxClose2Faq").click(function() {
	$('#feeTooltip2Faq').hide(55);
	});
	
	

	
	/****** FAQs to home.html navigation code *****/
$.browser.chrome = /chrome/.test(navigator.userAgent.toLowerCase());
if($.browser.chrome){
	localStorage.setItem("addCashActive", "no");
	localStorage.setItem("withdrawCashActive", "no"); 
}
else {
	$.cookie("addCashActive", "no"); 
	$.cookie("withdrawCashActive", "no"); 
}
$(".add_cash").click(function(){
	
		if($.browser.chrome){
			
       		localStorage.setItem("addCashActive", "yes");
       }
       else {
       	$.cookie("addCashActive", "yes");
       }
});
$(".withdraw_cash").click(function(){
	
		if($.browser.chrome){
			
       		localStorage.setItem("withdrawCashActive", "yes");
       }
       else {
       	$.cookie("withdrawCashActive", "yes");
       }
});

/****** END FAQs to home.html navigation code *****/

				$(".toggle_container").hide();

				var x=0;
				
				$("h2.expand_heading").click(
						function() {
						if(x==0){
							
								if($(this).hasClass("active")){
									
									$(this).removeClass("active");
									
								}
								else{
									$(this).addClass("active");
									
								}
								$(this).next().slideToggle(500).siblings(".toggle_container").hide(500);
								$(this).siblings().removeClass("active");
							
							}
							else{
								
								if($(this).hasClass("active")){
								
								$(this).removeClass("active");
								
								}
								else{
									$(this).addClass("active");
									
								}
								
								$(this).next().slideToggle(500);
							}
						});

				$(".expandall").click(function() {
					
					x++;
					$(this).addClass("expanded");
					$("h2.expand_heading").addClass("active");
				}); 
				$("collapseall").click(function() {
					x = 0;
					$(this).removeClass("expanded");
					$("h2.expand_heading").removeClass("active");
				});

				$(".expandall").click(function() {
					x++;
					
					if ($(this).hasClass("expanded")) {
						$(".toggle_container").slideDown("slow");
						$("h2.expand_heading").addClass("active");

					} else {
						$(".toggle_container").slideUp("slow");
						$("h2.expand_heading").removeClass("active");

					}
				});
				$(".collapseall").click(function() {
					x = 0;
					if ($(this).hasClass("expanded")) {
						$(".toggle_container").slideDown("slow");
						$("h2.expand_heading").addClass("active");

					} else {
						$(".toggle_container").slideUp("slow");
						$("h2.expand_heading").removeClass("active");

					}
				});
				/*** Navigate to login page  start***/
		$('.paypal_login').live('click', function(event) {  

			$('.black_overlay').css('display','block');
			 document.body.style.overflow="hidden";

			var sheight = (screen.height) * 0.6;
        var swidth = (screen.width) * 0.6;  
	event.preventDefault();
          $.popupWindow('https://www.paypal.com/in/cgi-bin/webscr?cmd=_login-submit', {
          	height:sheight,
          	width:sheight,
          	toolbar:'yes',
            onUnload: function() {
            $('.black_overlay').css('display','none');
			 document.body.style.overflow="visible";
            }
          });});
		/*** Navigate to login page  end***/
		
});
/*
function callFeeResponse()
{
		if(feeLinkResponse == null || feeLinkResponse == "" || feeLinkResponse == undefined)
		{
			alert("chrome");
			callService(methods.GetFeeLinkValue[0], methods.GetFeeLinkValue[1], "", "", null, faqFeeSuccessHandler, faqFeeFailureHandler);
		}
		else
		{
			alert("else chrome");
			faqFeeSuccessHandler(feeLinkResponse);
		}

}
var feeLinkResponse = "";

var faqFeeSuccessHandler = function(response){
	
	if($.browser.chrome){
		localStorage.feeResponse = response;
		feeLinkResponse = localStorage.feeResponse;
	}
	else
	{
		$.cookie("feeResponse", response);
	 	feeLinkResponse = $.cookie("feeResponse");
	}
	alert(JSON.stringify(JSON.parse(feeLinkResponse)));
	$('#preview').hide();
	var addFeeDetails = '';
	addFeeDetails = '<ul class="historyGrid" id="addCashFee"><li class="thead"><div>Amount</div><div>Fee</div></li><li class="trow"><div>$0.00 - $200.00 USD</div><div>$'+ feeLinkResponse.feeForTwoHundred +' USD</div></li><li class="trow altrow"><div>$200.01 - $500.00 USD</div> <div>$'+ feeLinkResponse.feeForFiveHundred +' USD</div></li></ul><p>For business accounts PayPal will charge a 2.9% of face fee, plus 30 cents.  No fee will be imposed if a transaction is rejected by PayPal.</p><p>There is a limit to how much cash can be added to a PayPal account:  </p><ul class="historyGrid" id="all_elements"><li class="thead"><div>Transaction Limit</div><div>Time</div></li><li class="trow element"><div>$500 USD</div><div>Per calendar month</div></li></ul>';
	$('#addCashFee').html(addFeeDetails);
	var withdrawFeeDetails = '';
	withdrawFeeDetails = '<ul class="historyGrid" id="withdrawCashFee"><li class="thead"> <div>Withdrawal Amount</div><div>Fee Amount</div></li><li class="trow"><div>$0.00 - $200.00 USD</div><div>$'+ feeLinkResponse.feeForTwoHundred +' USD</div></li></ul><p>There is a limit to how much cash can be withdrawn:</p><ul class="historyGrid" id="all_elements"><li class="thead"><div>Transaction Limit</div><div>Time</div></li><li class="trow"><div>$200 USD</div><div>Per day</div></li><li class="trow altrow"><div>$500 USD</div><div>Per month</div></li></ul>';
	$('#withdrawCashFee').html(withdrawFeeDetails);
	
	};
	
	var faqFeeFailureHandler = function(response){
	alert(response);
	};
*/	
 function openLocation(){
 	 	 document.body.style.overflow="hidden";
 	          $.fancybox({
    	   autoDimensions: false,
    	 'width'             : "90%",
          'height'            : "75%",
         
    	  content: $('#location_iframe').clone(),
		   'onClosed' : function()
    	               {
						   document.body.style.overflow="visible";
    	 				}
     	 

     	 
    });
   
}
