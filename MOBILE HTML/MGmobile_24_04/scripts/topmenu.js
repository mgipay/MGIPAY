// JavaScript Document

$(document).ready(function() {

	$(".topmenu").hide();

	$("#menu_active").click(function() {

		$(".topmenu").slideToggle("slow");

		if($(".menu").hasClass("bgcolor")) {

			$(".menu").removeClass("bgcolor");

			$("#menuActive").attr("src", "images/icon_menu.png");

		} else {

			$(".menu").addClass("bgcolor");

			$("#menuActive").attr("src", "images/icon_menu_active.png");

		}

	});

	var menu = $('#menu_active');
	var menu1= $(".topmenulink");
	var menu2= $("#menuActive");
	$(document).click(function(e) {

		if(e.target != menu.get(0) && menu.find($(e.target)).length == 0 && e.target != menu1.get(0) && menu1.find($(e.target)).length == 0 && e.target != menu2.get(0) && menu2.find($(e.target)).length == 0) {

			$(".topmenu").slideUp("slow");


			$(".menu").removeClass("bgcolor");

			$("#menuActive").attr("src", "images/icon_menu.png");


			console.log(e.target);

			console.log(menu.get(0));

			console.log(menu.get(0) !== e.target);

		}

	});

});