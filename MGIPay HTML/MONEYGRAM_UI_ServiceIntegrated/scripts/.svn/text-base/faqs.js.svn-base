$(document).ready(
			function() {
				$(".toggle_container").hide();


				var x = 0;
				$("h2.expand_heading").click(
						function() {
							x++;
							$(this).addClass("active");

							$(this).next().slideDown("slow").siblings(
									".toggle_container").hide("fast");
							$(this).siblings().removeClass("active");
							$(this).click(function() {

								if (x == 1) {
									$(this).next().hide();
									$(this).removeClass("active");

								}
								else{
									x=0;
								}
							});

						});

				$(".expandall").click(function() {
					$(this).addClass("expanded");
					$("h2.expand_heading").addClass("active");
				}); 
				$("collapseall").click(function() {
					$(this).removeClass("expanded");
					$("h2.expand_heading").removeClass("active");
				});

				$(".expandall").click(function() {

					if ($(this).hasClass("expanded")) {
						$(".toggle_container").slideDown("slow");
						$("h2.expand_heading").addClass("active");

					} else {
						$(".toggle_container").slideUp("slow");
						$("h2.expand_heading").removeClass("active");

					}
				});
				$(".collapseall").click(function() {

					if ($(this).hasClass("expanded")) {
						$(".toggle_container").slideDown("slow");
						$("h2.expand_heading").addClass("active");

					} else {
						$(".toggle_container").slideUp("slow");
						$("h2.expand_heading").removeClass("active");

					}
				});
				/*
				$("#fee_tooltip").hide();
				$("#fee").click(function() {
					
					$('#fee_tooltip').slideDown("slow");
				});
				$("#fancybox-close").click(function() {
					
					$('#fee_tooltip').hide("slow");
				});
				*/



			});