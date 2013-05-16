$(document).ready(function() {

	$('#fee_tooltip').hide();
	$('#fee_tooltip2').hide();
	//$("#fee_tooltip").hide();
	$("#fee").click(function() {

		$('#fee_tooltip').slideDown("slow");

	});

	$("#fancybox-close").click(function() {

		$('#fee_tooltip').hide("slow");

	});

	$("#fee2").click(function() {

		$('#fee_tooltip2').slideDown("slow");
		//$('#fee_tooltip').hide("slow");
	});
	$("#fancybox-close2").click(function() {

		$('#fee_tooltip2').hide("slow");
	});

}); 