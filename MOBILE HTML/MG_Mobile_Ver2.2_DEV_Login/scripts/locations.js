$(document).ready(function() {
				
				$("#fee").click(function() {
					callAddCashResponse();
					$('#fee_tooltip').slideDown(800);
				});
				$("#fancybox-close").click(function() {
					$('#fee_tooltip').hide(800);
				});
});
