var feeFlag = 1;

$(document).ready(function() {
		//callService(methods.GetFeeLinkValue[0], methods.GetFeeLinkValue[1], "", "", null, faqFeeSuccessHandler, faqFeeFailureHandler);
	
	$("#fee").click(function() {
		callAddCashResponse();
		$('#fee_tooltip').slideDown("slow");
	});
	$("#fancybox-close").click(function() {
		$('#fee_tooltip').hide("slow");
	});

	$("#fee_withdrawCash").click(function() {
		callWithdrawCashResponse();
		$('#fee_tooltip_withdrawCash').slideDown("slow");
	});
	$("#fancybox-close_withdrawCash").click(function() {
		$('#fee_tooltip_withdrawCash').hide("slow");
	});

	
		/****** FAQs to home.html navigation code *****/
	/*$.browser.chrome = /chrome/.test(navigator.userAgent.toLowerCase());
	if($.browser.chrome){
		localStorage.setItem("addCashActive", "no");
		localStorage.setItem("withdrawCashActive", "no"); 
	}
	else {
		$.cookie("addCashActive", "no"); 
		$.cookie("withdrawCashActive", "no"); 
	}
	$(".add_cash").click(function(){
		if($.browser.chrome){
			localStorage.setItem("addCashActive", "yes");
		}
		else {
			$.cookie("addCashActive", "yes");
		}
	});
	$(".withdraw_cash").click(function(){
		if($.browser.chrome){
       		localStorage.setItem("withdrawCashActive", "yes");
       }
       else {
       	$.cookie("withdrawCashActive", "yes");
       }
	});*/

	/****** END FAQs to home.html navigation code *****/

	$(".toggle_container").hide();
		var x=0;
		$("h2.expand_heading").click(function() {
			
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
			document.body.style.overflow="hidden";
			var sheight = (screen.height) * 0.6;
			var swidth = (screen.width) * 0.6;  
			event.preventDefault();
          	$.popupWindow('https://www.paypal.com/in/cgi-bin/webscr?cmd=_login-submit', {
          	height:sheight,
          	width:sheight,
            onUnload: function() {
            $('.black_overlay').css('display','none');
			 document.body.style.overflow="visible";
            }
          	});
		});
		/*** Navigate to login page  end***/
});

function openLocation(){
	document.body.style.overflow="hidden";
 	$.fancybox({
    	 autoDimensions: false,
    	 'width'             : "90%",
         'height'            : "75%",
    	 content: $('#location_iframe').clone(),
		 'onClosed' : function(){
						   document.body.style.overflow="visible";
    	 }
    });
}
