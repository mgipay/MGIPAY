
$(function() {
$(".backtotop").show();

	// fade in #back-top
	
		$(window).scroll(function () {
			if ($(this).scrollTop() > 100) {
				$('.backtotop').fadeIn();
			} else {
				$('.backtotop').fadeOut();
			}
		});

		// scroll body to 0px on click
		$('.backtotop').click(function () {
						$('body,html').animate({

				scrollTop: 0
			},800);
			return false;
		});
	});
			