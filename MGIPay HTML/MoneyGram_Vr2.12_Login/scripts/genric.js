var addCashLinkResponse;
var withdrawLinkResponse;
$(document).ready(function(){
	// scroll body to 0px on click
	$('.backtotop').click(function () {
		$('body,html').animate({
			scrollTop: 0
		},800);
		return false;
	});
	// Adding year dynamically in footer
	$(".footer_year").text( (new Date).getFullYear() );
});

/******** Methods to display fee details on click of addCash fee link in Home and FAQS page ---START************/
function callAddCashResponse()
{
	if(addCashLinkResponse == null || addCashLinkResponse == "" || addCashLinkResponse == undefined)
	{
		var feeObj = new Object();
		feeObj.fundsIn = "true";
		var feeLinkObj = new Object();
		feeLinkObj.FeeLinkValueInputBean = feeObj;
		callService(methods.GetFeeLinkValue[0], methods.GetFeeLinkValue[1], feeLinkObj, addCashResponseSuccessHandler, addCashResponseFailureHandler);
	}
	else
	{
		addCashResponseSuccessHandler(addCashLinkResponse);
	}
}

var addCashResponseSuccessHandler = function(response){
	document.body.style.overflow="visible";
	$('#preview').hide();
	$(".tabDisable").removeAttr("tabindex");
	addCashLinkResponse = response;
	if(response.transactionSuccess == true)
	{
		if(feeFlag == 0)
			$('#fee_tooltip2').removeClass('displaynone');
		else
			$('#feeTooltipFaq').removeClass('displaynone');
		var addFeeDetails = '';
		addFeeDetails = '<ul class="historyGrid"><li class="thead"><div>Amount</div><div>Fee</div></li><li class="trow"><div>$0.00 - $200.00 USD</div><div>$'+ (parseFloat(response.feeForTwoHundred).toFixed(2)) +' USD</div></li><li class="trow altrow"><div>$200.01 - $500.00 USD</div> <div>$'+ (parseFloat(response.feeForFiveHundred).toFixed(2)) +' USD</div></li></ul><p>There is a limit to how much cash can be added to a PayPal account via MoneyGram:  </p><ul class="historyGrid" id="all_elements"><li class="thead"><div>Transaction Limit</div><div>Time</div></li><li class="trow element"><div>$500 USD</div><div>Per calendar month</div></li></ul>';
		$('#addCashFee').html(addFeeDetails);

	}
	else
	{
		alert(response.errorMessage);
	}
};

var addCashResponseFailureHandler = function(response){
	alert(resources.errorMsg);
};
/******** Methods to display fee details on click of addCash fee link in Home and FAQS page ---END************/

/******** Methods to display fee details on click of Withdraw Cash fee link in Home and FAQS page ---START************/
function callWithdrawCashResponse()
{
	if(withdrawLinkResponse == null || withdrawLinkResponse == "" || withdrawLinkResponse == undefined)
	{
		var feeObj = new Object();
		feeObj.fundsIn = "false";
		var feeLinkObj = new Object();
		feeLinkObj.FeeLinkValueInputBean = feeObj;
		callService(methods.GetFeeLinkValue[0], methods.GetFeeLinkValue[1], feeLinkObj, withdrawResponseSuccessHandler, withdrawResponseFailureHandler);
	}
	else
	{
		withdrawResponseSuccessHandler(withdrawLinkResponse);
	}
}

var withdrawResponseSuccessHandler = function(response){
	document.body.style.overflow="visible";
	$('#preview').hide();
	$(".tabDisable").removeAttr("tabindex");
	withdrawLinkResponse = response;
	if(response.transactionSuccess == true)
	{
		if(feeFlag == 0)
			$('#fee_tooltip').removeClass('displaynone');
		else
			$('#feeTooltip2Faq').removeClass('displaynone');
		var withdrawFeeDetails = '';
		withdrawFeeDetails = '<ul class="historyGrid"><li class="thead"> <div>Withdrawal Amount</div><div>Fee Amount</div></li><li class="trow"><div>$0.00 - $200.00 USD</div><div>$'+ (parseFloat(response.feeForTwoHundred).toFixed(2)) +' USD</div></li></ul><p>There is a limit to how much cash can be withdrawn:</p><ul class="historyGrid" id="all_elements"><li class="thead"><div>Transaction Limit</div><div>Time</div></li><li class="trow"><div>$200 USD</div><div>Per day</div></li><li class="trow altrow"><div>$500 USD</div><div>Per month</div></li></ul>';
		$('#withdrawCashFee').html(withdrawFeeDetails);
	}
	else 
	{
		alert(response.errorMessage);
	}
};

var withdrawResponseFailureHandler = function(response){
	alert(resources.errorMsg);
};
/******** Methods to display fee details on click of Withdraw Cash fee link in Home and FAQS page ---END************/
