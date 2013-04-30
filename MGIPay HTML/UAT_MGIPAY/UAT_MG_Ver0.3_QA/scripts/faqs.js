var feeFlag = 1;
var isTabClicked = false;
var homeId;
var withdrawIdActive;
$(document).ready(function() {
	
	
	$("#feeFaq").click(function() {
		callAddCashResponse();
		$('#feeTooltipFaq').slideDown(55);
	});
	$("#fancyboxCloseFaq").click(function() {
		$('#feeTooltipFaq').hide(55);
	});
	$("#fee2Faq").click(function() {
		callWithdrawCashResponse();
		$('#feeTooltip2Faq').slideDown(55);
	});
	$("#fancyboxClose2Faq").click(function() {
		$('#feeTooltip2Faq').hide(55);
	});
	
		/****** FAQs to home.html navigation code *****/
	$.browser.chrome = /chrome/.test(navigator.userAgent.toLowerCase());
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
	});

	/****** END FAQs to home.html navigation code *****/
	
	/***** navigation from withdraw page and home page**********/
	var x=0;
	$(".toggle_container").hide();
	if($.browser.chrome){
		withdrawIdActive = localStorage.getItem("withdrawId");
		homeId=localStorage.getItem("faqId");
	}
	else{
		withdrawIdActive = $.cookie("withdrawId");
		homeId = $.cookie("faqId");
	}
	
	var win=$(window);
	$("#h2Active").click(function(){
		if(isTabClicked == false){
			var scrollTop=win.scrollTop();
			$('html,body').animate({ scrollTop: $(this).offset().top-200 }, 1000);
			$("#tabActive").slideDown();
			$(this).parent().addClass("active");
		}
		
	});
	if(homeId == 'yes'){
		$("#h2Active").trigger('click');
		if($.browser.chrome){
			localStorage.setItem("faqId", "no");
		}
		else {
			$.cookie("faqId", "no");  
		}	
	}
	
	if(withdrawIdActive == 'yes'){
		$("#h2Active").trigger('click');
		if($.browser.chrome){
			localStorage.setItem("withdrawId", "no");
		}
		else {
			$.cookie("withdrawId", "no");
		}
	}

/*****navigation end *****/

	
		
		$("h2.expand_heading").click(function() {
			isTabClicked = true;
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
	$("#light").html('<iframe src="https://hosted.where2getit.com/moneygram/en.html" id="location_iframe"></iframe>');
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
