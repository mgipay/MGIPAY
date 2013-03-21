$(document).ready(function() {
				
				$(".toggle_container").hide();

				var x=0;
				
				$("h2.expand_heading").click(
						function() {
						if(x==0){
							
								if($(this).hasClass("active")){
									
									$(this).removeClass("active");
									
								}
								else{
									$(this).addClass("active");
									
								}
								$(this).next().slideToggle(500).siblings(".toggle_container").hide(500);
								$(this).siblings().removeClass("active");
							
							}
							else{
								
								if($(this).hasClass("active")){
								
								$(this).removeClass("active");
								
								}
								else{
									$(this).addClass("active");
									
								}
								
								$(this).next().slideToggle(500);
							}
						});

				$(".expandall").click(function() {
					
					x++;
					$(this).addClass("expanded");
					$("h2.expand_heading").addClass("active");
				}); 
				$("collapseall").click(function() {
					x = 0;
					$(this).removeClass("expanded");
					$("h2.expand_heading").removeClass("active");
				});

				$(".expandall").click(function() {
					x++;
					
					if ($(this).hasClass("expanded")) {
						$(".toggle_container").slideDown("slow");
						$("h2.expand_heading").addClass("active");

					} else {
						$(".toggle_container").slideUp("slow");
						$("h2.expand_heading").removeClass("active");

					}
				});
				$(".collapseall").click(function() {
					x = 0;
					if ($(this).hasClass("expanded")) {
						$(".toggle_container").slideDown("slow");
						$("h2.expand_heading").addClass("active");

					} else {
						$(".toggle_container").slideUp("slow");
						$("h2.expand_heading").removeClass("active");

					}
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