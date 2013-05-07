$(document).ready(function() {
	// Adding year dynamically in footer
	//$(".footer_year").text( (new Date).getFullYear() );
	$(".footer_year").text((new Date).getFullYear() + " - " + (parseInt((new Date).getFullYear()) + 1));

	var Active = "no";
	$("#menuexpandId").click(function() {
		if (Active == "no") {

			$('#navfootermenu').slideDown();
			document.getElementById("menuexpandId").style.backgroundImage = "url(images/footer_collapsed_icon.png)";
			Active = "yes";
		} else {
			$('#navfootermenu').slideUp();
			document.getElementById("menuexpandId").style.backgroundImage = "url(images/footer_expand_icon.png)";
			Active = "no";
		}

	});
	var menu3 = $('#menuexpandId');
	$(document).click(function(e) {

		if (e.target != menu3.get(0) && menu3.find($(e.target)).length == 0) {

			$('#navfootermenu').hide();
		
			document.getElementById("menuexpandId").style.backgroundImage = "url(images/footer_expand_icon.png)";
			Active = "no";

			console.log(e.target);

			console.log(menu.get(0));

			console.log(menu.get(0) !== e.target);

		}

	});

});

function goTowithdrawPage() {
	window.location.href = "withdrawcash.html";
}

function openHistoryDetails() {
	window.location.href = "history.html";
}