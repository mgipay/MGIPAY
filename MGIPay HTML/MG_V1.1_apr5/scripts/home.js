var feeFlag = 0;
var faqAddCash;
var faqWithdrawCash;
 /* code for getting lightbox for locations start*/
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

$(document).ready(function() {
	
	/*** script for activating a particular tab, when scroll position in the related div position *****/
	$(window).scroll(function () { 
		var div_content1= $("#content_1").offset().top-0;
		var div_content2=$("#content_2").offset().top-230;
		var div_content3=$("#content_3").offset().top-230.5;
		var div_content4=$("#content_4").offset().top-233;
		var winscroll=$(window).scrollTop();
		//alert(winscroll);
		if(faqAddCash == "yes") {

			if(winscroll <= div_content1) {
				$(".tab1 a").removeClass("active");
			} else if(winscroll >= div_content1 && winscroll <= div_content2) {
				$(".active").removeClass("active");
			} else if(winscroll >= div_content2 && winscroll <= div_content3) {
				$(".active").removeClass("active");
				$(".tab2 a").addClass("active");
				if($.browser.chrome) {
					faqAddCash = localStorage.getItem("addCashActive");
				} else {
					faqAddCash = $.cookie("addCashActive");
				}
			} else if(winscroll >= div_content3 && winscroll <= div_content4) {
				$(".active").removeClass("active");
			} else if(winscroll >= div_content4) {
				$(".active").removeClass("active");
			}
		}
		else if(faqWithdrawCash == "yes") {
			if(winscroll <= div_content1) {
				$(".tab1 a").removeClass("active");
			} else if(winscroll >= div_content1 && winscroll <= div_content2) {
				$(".active").removeClass("active");
			} else if(winscroll >= div_content2 && winscroll <= div_content3) {
				$(".active").removeClass("active");
			} else if(winscroll >= div_content3 && winscroll <= div_content4) {
				$(".active").removeClass("active");
				$(".tab3 a").addClass("active");
				if($.browser.chrome) {
					faqWithdrawCash = localStorage.getItem("withdrawCashActive");
				} else {
					faqWithdrawCash = $.cookie("withdrawCashActive");
				}
			} else if(winscroll >= div_content4) {
				$(".active").removeClass("active");
			}
		}
		 else {
			if(winscroll >= div_content1 && winscroll <= div_content2) {
				$(".active").removeClass("active");
				$(".tab1 a").addClass("active");
			} else if(winscroll >= div_content2 && winscroll <= div_content3) {
				$(".active").removeClass("active");
				$(".tab2 a").addClass("active");
			} else if(winscroll >= div_content3 && winscroll <= div_content4) {
				$(".active").removeClass("active");
				$(".tab3 a").addClass("active");
			} else if(winscroll >= div_content4) {
				$(".active").removeClass("active");
				$(".tab4 a").addClass("active");
			}
		}
    	//You've scrolled this much:
	});

	/**** activating the related tab and scrolling postion end ******/
	
	
	/**** Navigation code from FAQs to home.html ******/
	
	
	$.browser.chrome = /chrome/.test(navigator.userAgent.toLowerCase());
	if($.browser.chrome){
		faqAddCash = localStorage.getItem("addCashActive");
		faqWithdrawCash = localStorage.getItem("withdrawCashActive");
	}
	else{
		faqAddCash = $.cookie("addCashActive");
		faqWithdrawCash = $.cookie("withdrawCashActive"); 
	}
	var btn = $('.fixing');
	var btnPosTop = btn.offset().top;
	var win = $(window);
	$(".tab1 a").click(function(){
		var scrollTop=win.scrollTop();

		if(scrollTop < btnPosTop){
			$(".tabContainer").css("margin-top", "230px");
			$('html,body').animate({ scrollTop: $(this.hash).offset().top-472}, 1000);

		}

		else{
			$(".tabContainer").css("margin-top", "218px");
			$('html,body').animate({ scrollTop: $(this.hash).offset().top-216 }, 1000);

		}

	});





	$(".tab2 a").click(function(){
		var scrollTop=win.scrollTop();

		if(scrollTop < btnPosTop){
			$(".tabContainer").css("margin-top", "240px");
			$('html,body').animate({ scrollTop: $(this.hash).offset().top-476}, 1000);
		}
		else{
			$('html,body').animate({ scrollTop: $(this.hash).offset().top-218 }, 1000);
		}
	});

	$(".tab3 a").click(function(){
		var scrollTop=win.scrollTop();
		if(scrollTop < btnPosTop){
			$(".tabContainer").css("margin-top", "240px");
			$('html,body').animate({ scrollTop: $(this.hash).offset().top-482}, 1000);
		}
		else{
			$('html,body').animate({ scrollTop: $(this.hash).offset().top-218 }, 1000);
		}
	});



$(".tab4 a").click(function(){
		var scrollTop=win.scrollTop();
		if(scrollTop < btnPosTop){
			$(".tabContainer").css("margin-top", "240px");
			$('html,body').animate({ scrollTop: $(this.hash).offset().top-475}, 1000);
		}
		else{
			$('html,body').animate({ scrollTop: $(this.hash).offset().top-214 }, 1000);
		}
	});
	if(faqAddCash == 'yes'){
		$(".tab2 a").trigger('click');
		if($.browser.chrome){
			localStorage.setItem("addCashActive", "no");
		}
		else {
			$.cookie("addCashActive", "no");  
		}	
	}
	if(faqWithdrawCash == 'yes'){
		$(".tab3 a").trigger('click');
		if($.browser.chrome){
			localStorage.setItem("withdrawCashActive", "no");
		}
		else {
			$.cookie("withdrawCashActive", "no");  
		}	
	}

	/****** end of faqs code *****/	
	
	
	$('#slides').slides({
	preload : true,
	preloadImage : 'images/loading.gif',
	play : 5000,
	pause : 2500,
	hoverPause : true
	});
	
	$("#fee").click(function() {
		feeClicked = 0;
		callFeeResponse();
		$('#fee_tooltip').slideDown(55);
	});
	$("#fancybox-close").click(function() {
		$('#fee_tooltip').hide(55);
	});
	
	$("#fee2").click(function() {
		feeClicked = 1;
		callFeeResponse();
		$('#fee_tooltip2').slideDown(55);
	});
	$("#fancybox-close2").click(function() {
		$('#fee_tooltip2').hide(55);
	});
	
	
	/* - script for fixing the tabs position after scrolling to a particular point start*/

	win.scroll(function(e) {
	var scrollTop = win.scrollTop();
	if (scrollTop >= btnPosTop) {
	//we've reached the button
	$(".tabContainer").css("margin-top", "225px");

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
		document.body.style.overflow="hidden";
		
		$('.black_overlay').css('display','block');
		
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

