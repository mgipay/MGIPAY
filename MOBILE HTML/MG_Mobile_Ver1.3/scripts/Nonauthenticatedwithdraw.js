
var withdrawfeeFlag = false;
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
					callFeeLimitResponse();
					$('#fee_tooltip_limitFee').slideDown(800);
					//$('#fee_tooltip').hide(800);
				});
				
				$("#fancybox-close_limitFee").click(function() {
					$('#fee_tooltip_limitFee').hide(800);
				});
				
				
});