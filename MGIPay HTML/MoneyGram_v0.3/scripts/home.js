
 /* code for getting lightbox for locations start*/
 function openLocation(){
 	
 	
 	          $.fancybox({
    	   autoDimensions: false,
    	 'width'             : "60%",
          'height'            : "60%",
    	  content: $('#location_iframe').clone(),
     	 
    });
   
}

$(function() {
				$('#slides').slides({
					preload : true,
					preloadImage : 'images/loading.gif',
					play : 5000,
					pause : 2500,
					hoverPause : true
				});
				
				$("#fee_tooltip").hide();
				$("#fee").click(function() {
					$('#fee_tooltip').slideDown("slow");
				});
				$("#fancybox-close").click(function() {
					$('#fee_tooltip').hide("slow");
				});
				
				$("#fee_tooltip2").hide();
				$("#fee2").click(function() {
					$('#fee_tooltip2').slideDown("slow");
				});
				$("#fancybox-close2").click(function() {
					$('#fee_tooltip2').hide("slow");
				});
				
				// When a link is clicked
				$("a.tab").click(function() {
					// switch all tabs off
					$(".active").removeClass("active");
					// switch this tab on
					$(this).addClass("active");
				});
				
				/* - script for fixing the tabs position after scrolling to a particular point start*/
				$(function() {
				var btn = $('.fixing');
				var btnPosTop = btn.offset().top;
				var win = $(window);
				$(".tab").click(function(event) {
				var scrollTop=win.scrollTop();
				if(scrollTop < btnPosTop){

$(".tabContainer").css("margin-top", "240px");
				 $('html,body').animate({ scrollTop: $(this.hash).offset().top-500}, 1000);
				}
				else{
					
					 $('html,body').animate({ scrollTop: $(this.hash).offset().top-210 }, 1000);
					 
				}
				});
				win.scroll(function(e) {
					var scrollTop = win.scrollTop();
					if (scrollTop >= btnPosTop) {
						//we've reached the button
						$(".tabContainer").css("margin-top", "210px");
						btn.css({
							position : 'fixed',
							top : 0
						});

					} else if (btn.css('position') == 'fixed') {
						//if we scroll back up past the button's original position, and the button had previously been changed to its fixed position, we change it back
						$(".tabContainer").css("margin-top", "0px");
						btn.css({
							position : 'relative',
							top : ''
						});
					}

				});

			});
			// - script for fixing the tabs position after scrolling to a particular point start end*/
			// hide #back-top first
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
		
	/*** Navigate to login page  start***/
		$('.paypal_login').live('click', function(event) {  

			$('.black_overlay').css('display','block');

			var sheight = (screen.height) * 0.6;
        var swidth = (screen.width) * 0.6;  
	event.preventDefault();
          $.popupWindow('https://www.paypal.com/in/cgi-bin/webscr?cmd=_login-submit', {
          	height:sheight,
          	width:sheight,
          	toolbar:'yes',
            onUnload: function() {
            $('.black_overlay').css('display','none');
            }
          });});
		/*** Navigate to login page  end***/

		
	});
				
		