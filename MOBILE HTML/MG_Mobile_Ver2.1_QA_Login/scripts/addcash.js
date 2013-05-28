var feeLimitFlag = false;

$(document).ready(
			function() {
				
				$("#fee").click(function() {
					callAddCashResponse();
					$('#fee_tooltip').slideDown(800);
				});
				$("#fancybox-close").click(function() {
					$('#fee_tooltip').hide(800);
				});
				
				$("#fee_limitFee").click(function() {
					feeLimitFlag = true;
					feeLimitAddCashFlag = true;
					callAddCashResponse();
					$('#fee_tooltip_limitFee').slideDown(800);
					//$('#fee_tooltip').hide(800);
				});
				
				$("#fancybox-close_limitFee").click(function() {
					feeLimitFlag = false;
					feeLimitAddCashFlag = false;
					$('#fee_tooltip_limitFee').hide(800);
				});
				
});
