$(document).ready(
			function() {
				$('#fee_withdrawtooltip').hide();
				$('#fee_withdrawtooltip2').hide();
$("#fee_withdrawtooltip").hide();
				$("#withdrawfee").click(function() {
					
					$('#fee_withdrawtooltip').slideDown(800);
					
				});

				$("#withdrawfancybox-close").click(function() {
					
					$('#fee_withdrawtooltip').hide(800);
					
				});
				
				$("#withdrawfee2").click(function() {
					
					$('#fee_withdrawtooltip2').slideDown(800);
					$('#fee_withdrawtooltip').hide(800);
				});
				$("#withdrawfancybox-close2").click(function() {
					
					$('#fee_withdrawtooltip2').hide(800);
				});
				
				
});