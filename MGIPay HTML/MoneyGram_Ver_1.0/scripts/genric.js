var feeLinkResponse;
var feeClicked;

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

/**** Method called when we click on  fee link ****/
function callFeeResponse()
{
	if(feeLinkResponse == null || feeLinkResponse == "" || feeLinkResponse == undefined)
	{
		if(feeFlag == 0 || feeFlag == 1)
			callService(methods.GetFeeLinkValue[0], methods.GetFeeLinkValue[1], "", "", null, feeResponseSuccessHandler, feeResponseFailureHandler);
		else
			callService(methods.GetFeeLinkValue[0], methods.GetFeeLinkValue[1], "", "", null, feeWithdrawSuccessHandler, feeWithdrawFailureHandler);
	}
	else
	{
		if(feeFlag == 0 || feeFlag == 1)
			feeResponseSuccessHandler(feeLinkResponse);
		else
			feeWithdrawSuccessHandler(feeLinkResponse);
	}
}

/***** Method to populate feeLink response in page (in home.html & FAQS.html) ***/
var feeResponseSuccessHandler = function(response){
	$('#preview').hide();
	feeLinkResponse = response;
	if(feeFlag == 0)
	{
		if(feeClicked == 0)
			$('#fee_tooltip').removeClass('displaynone');
		else
			$('#fee_tooltip2').removeClass('displaynone');
	}
	else
	{
		if(feeClicked == 0)
			$('#feeTooltipFaq').removeClass('displaynone');
		else
			$('#feeTooltip2Faq').removeClass('displaynone');
	}
	var addFeeDetails = '';
	addFeeDetails = '<ul class="historyGrid"><li class="thead"><div>Amount</div><div>Fee</div></li><li class="trow"><div>$0.00 - $200.00 USD</div><div>$'+ (parseFloat(response.feeForTwoHundred).toFixed(2)) +' USD</div></li><li class="trow altrow"><div>$200.01 - $500.00 USD</div> <div>$'+ (parseFloat(response.feeForFiveHundred).toFixed(2)) +' USD</div></li></ul><p>For business accounts PayPal will charge a 2.9% of face fee, plus 30 cents.  No fee will be imposed if a transaction is rejected by PayPal.</p><p>There is a limit to how much cash can be added to a PayPal account:  </p><ul class="historyGrid" id="all_elements"><li class="thead"><div>Transaction Limit</div><div>Time</div></li><li class="trow element"><div>$500 USD</div><div>Per calendar month</div></li></ul>';
	$('#addCashFee').html(addFeeDetails);
	var withdrawFeeDetails = '';
	withdrawFeeDetails = '<ul class="historyGrid"><li class="thead"> <div>Withdrawal Amount</div><div>Fee Amount</div></li><li class="trow"><div>$0.00 - $200.00 USD</div><div>$'+ (parseFloat(response.feeForTwoHundred).toFixed(2)) +' USD</div></li></ul><p>There is a limit to how much cash can be withdrawn:</p><ul class="historyGrid" id="all_elements"><li class="thead"><div>Transaction Limit</div><div>Time</div></li><li class="trow"><div>$200 USD</div><div>Per day</div></li><li class="trow altrow"><div>$500 USD</div><div>Per month</div></li></ul>';
	$('#withdrawCashFee').html(withdrawFeeDetails);
	
};
	
var feeResponseFailureHandler = function(response){
	
};

/***** Method to populate feeLink response in page (in withdraw_cash_authenticated.html) ***/
var feeWithdrawSuccessHandler = function(response){
	$('#preview').hide();
	feeLinkResponse = response;
	var withdrawDetails = '';
	withdrawDetails = '<ul class="historyGrid" id="addCashFee"><li class="thead"><div>Amount</div><div>Fee</div></li><li class="trow"><div>$0.00 - $200.00 USD</div><div>$'+ (parseFloat(response.feeForTwoHundred).toFixed(2)) +' USD</div></li><li class="trow altrow"><div>$200.01 - $500.00 USD</div> <div>$'+ (parseFloat(response.feeForFiveHundred).toFixed(2)) +' USD</div></li></ul><p> There is a limit to how much cash can with withdrawn: </p><ul class="historyGrid"><li class="thead"><div>Transaction Limit</div><div>Time</div></li><li class="trow"><div>$200 USD</div><div>Per day</div></li><li class="trow altrow"><div>$500 USD</div><div>Per month</div></li></ul><p> Note:  the above amounts include fees so a $200 withdrawal transaction will result in $195.05 in your hand.</p>';
	$('#withdrawFee').html(withdrawDetails);
};

var feeWithdrawFailureHandler = function(response){

};