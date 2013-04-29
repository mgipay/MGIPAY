$(document).ready(function() {
	
	callWithdrawCashResponse();
	$("#fee_withdrawCash").click(function() {
		callWithdrawCashResponse();
		$('#fee_tooltip_withdrawCash').slideDown("slow");
	});
	
	$("#fancybox-close_withdrawCash").click(function() {
		$('#fee_tooltip_withdrawCash').hide("slow");
	});
	var getLimit = new Object();
	getLimit.emailID = "vbalki@ebay.com";
	var getLimitObj = new Object();
	getLimitObj.UserLimitInputBean = getLimit;
    callService(methods.GetUserLimits[0], methods.GetUserLimits[1], getLimitObj, getLimitSuccessHandler, getLimitFailureHandler);
	callService(methods.CodeTable[0], methods.CodeTable[1], "" , locationSuccessHandler, locationFailureHandler);
	
});
function openFraudMessage()
{

 var sheight = (screen.height);
		var swidth = (screen.width);  
	document.body.style.position="fixed";
 	$.fancybox({
    	 autoDimensions: false,
    	 'width'             : swidth,
         'height'            : sheight,
        	 content: $('#fraudMessageContent').html(),
    	 
    	 'onClosed' : function(){
						   document.body.style.position="relative";
    	 				}
    });
}

function openTermsAndConditions()
{
	var sheight = (screen.height) * 0.9;
		var swidth = (screen.width) * 0.94;  
	document.body.style.position="fixed";
 	$.fancybox({
    	 autoDimensions: false,
    	 'width'             :swidth,
         'height'            : sheight,
        	 content: $('#termsAndConditions').html(),
    	 
    	 'onClosed' : function(){
						   document.body.style.position="relative";
    	 				}
    });
}
