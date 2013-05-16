
$(document).ready(
			function() {
				$('#fee_tooltip').hide();
				$('#fee_tooltip2').hide();
$("#fee_tooltip").hide();
				$("#fee").click(function() {
					
					$('#fee_tooltip').slideDown(800);
					
				});

				$("#fancybox-close").click(function() {
					
					$('#fee_tooltip').hide(800);
					
				});
				
				$("#fee2").click(function() {
					
					$('#fee_tooltip2').slideDown(800);
					$('#fee_tooltip').hide(800);
				});
				$("#fancybox-close2").click(function() {
					
					$('#fee_tooltip2').hide(800);
				});
				
});
