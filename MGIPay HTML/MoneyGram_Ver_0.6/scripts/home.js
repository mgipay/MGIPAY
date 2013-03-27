
 /* code for getting lightbox for locations start*/
 function openLocation(){
 	
		 document.body.style.overflow="hidden";
 	
 	      $.fancybox({
    	  autoDimensions: false,
    	 'width'             : "90%",
         'height'            : "75%",
    	 content: $('#location_iframe').clone(),
    	 'onClosed' : function()
    	               {
						   document.body.style.overflow="visible";
    	 				}
     	 
    });
   
}

var feeFlag = 0;

$(document).ready(function() {
	
	/*** script for activating a particular tab, when scroll position in the related div position *****/
	var div_content1= $("#content_1").position().top-0;
	var div_content2=$("#content_2").position().top-290;
	var div_content3=$("#content_3").position().top-500;
	var div_content4=$("#content_4").position().top-620;
	$(window).scroll(function () { 
		var winscroll=$(window).scrollTop();
		//alert(winscroll);
		if( winscroll <= div_content2){
			//alert("tab");
			$(".active").removeClass("active");
			$(".tab1 a").addClass("active");
		}

		else if( winscroll <= div_content3){
			//alert("tab2");
			$(".active").removeClass("active");
			$(".tab2 a").addClass("active");
		}
		else if( winscroll <= div_content4){
			//alert("tab3");
			$(".active").removeClass("active");
			$(".tab3 a").addClass("active");
		}
		else if(winscroll >= div_content4){
			//alert("tab4");
			$(".active").removeClass("active");
			$(".tab4 a").addClass("active");
		}
    //You've scrolled this much:
       //alert("You've scrolled " + $(window).scrollTop() + " pixels");

	});

	/**** activating the related tab and scrolling postion end ******/
	
	
	/**** Navigation code from FAQs to home.html ******/
	
	var faqAddCash;
	var faqWithdrawCash;
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
	$(".tab2 a").click(function(){
		
		var scrollTop=win.scrollTop();
		if(scrollTop < btnPosTop){
			$(".tabContainer").css("margin-top", "240px");
			$('html,body').animate({ scrollTop: $(this.hash).offset().top-500}, 200);
		}
		else{
			$('html,body').animate({ scrollTop: $(this.hash).offset().top-210 }, 200);
		}
	});
	$(".tab3 a").click(function(){
		
		var scrollTop=win.scrollTop();
		if(scrollTop < btnPosTop){
			$(".tabContainer").css("margin-top", "240px");
			$('html,body').animate({ scrollTop: $(this.hash).offset().top-500}, 200);
		}
		else{
			$('html,body').animate({ scrollTop: $(this.hash).offset().top-210 }, 200);
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
	$(function() {
	var btn = $('.fixing');
	var btnPosTop = btn.offset().top;
	var win = $(window);
	$(".tab").click(function(event) {
	var scrollTop=win.scrollTop();
	if(scrollTop < btnPosTop){
	
	$(".tabContainer").css("margin-top", "240px");
	$('html,body').animate({ scrollTop: $(this.hash).offset().top-500}, 200);
	}
	else{
	
	$('html,body').animate({ scrollTop: $(this.hash).offset().top-210 }, 200);
	
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
	 document.body.style.overflow="hidden";
	
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
	document.body.style.overflow="visible";
	}
	});
});
/*** Navigate to login page  end***/

		
	});

