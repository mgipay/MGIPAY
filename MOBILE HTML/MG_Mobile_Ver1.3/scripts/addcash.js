
$(document).ready(
			function() {
				/*$('#fee_tooltip').hide();
				$('#fee_tooltip2').hide();*/
				
				$("#fee").click(function() {
					callAddCashResponse();
					$('#fee_tooltip').slideDown(800);
				});
				$("#fancybox-close").click(function() {
					$('#fee_tooltip').hide(800);
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
