var feeFlag = 0;
var faqAddCash;
var loggedIn;
var faqWithdrawCash;
var isTabClicked = false;
var signUpClickFlag;

 /* code for getting lightbox for locations start*/
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

$(document).ready(function() {
	
/*	if($.browser.chrome) {
		loggedIn = localStorage.getItem("userLogin");
	} else {
		loggedIn = $.cookie("userLogin");
	}
	
	if(loggedIn == "yes")
	{
		$("#slides .slider_withdraw").removeClass('displaynone').addClass('displayblock');
		$("#slides .slider_login").removeClass('displayblock').addClass('displaynone');
	}
	else
	{
		$("#slides .slider_login").removeClass('displaynone').addClass('displayblock');
		$("#slides .slider_withdraw").removeClass('displayblock').addClass('displaynone');
	}
	/*** script for activating a particular tab, when scroll position in the related div position *****/
	$(window).scroll(function () { 
		if(isTabClicked)
		{
			return;
		}
		var div_content1= $("#content_1").offset().top-0;
		var div_content2=$("#content_2").offset().top-230;
		var div_content3=$("#content_3").offset().top-230.5;
		var div_content4=$("#content_4").offset().top-233;
		var winscroll=$(window).scrollTop();
		
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
			if(winscroll <= div_content2) {
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
		localStorage.setItem("faqId", "no");
		
	}
	else{
		faqAddCash = $.cookie("addCashActive");
		faqWithdrawCash = $.cookie("withdrawCashActive"); 
		localStorage.setItem("faqId", "no");
		
	}
	$("#identity").click(function(){
		
		if($.browser.chrome){
			
			localStorage.setItem("faqId", "yes");
		}
		else {
			
			$.cookie("faqId", "yes");
		}
	});
	var btn = $('.fixing');
	var btnPosTop = btn.offset().top;
	var win = $(window);
	
	$(".tab1 a").click(function(){
		isTabClicked = true;
		var scrollTop=win.scrollTop();

		if(scrollTop < btnPosTop){
			$(".tabContainer").css("margin-top", "230px");
			$('html,body').animate({ scrollTop: $(this.hash).offset().top-472}, 1000);

		}

		else{
			$(".tabContainer").css("margin-top", "218px");
			$('html,body').animate({ scrollTop: $(this.hash).offset().top-216 }, 1000);

		}
		$(".active").removeClass("active");
		$(".tab1 a").addClass("active");
		setTimeout(function()
		{
			isTabClicked = false;
		}, 1000);
	});





	$(".tab2 a").click(function(){
		isTabClicked = true;
		var scrollTop=win.scrollTop();
		if(scrollTop < btnPosTop){
			$(".tabContainer").css("margin-top", "240px");
			$('html,body').animate({ scrollTop: $(this.hash).offset().top-476}, 1000);
		}
		else{
			$('html,body').animate({ scrollTop: $(this.hash).offset().top-218 }, 1000);
		}
		$(".active").removeClass("active");
		$(".tab2 a").addClass("active");
		setTimeout(function()
		{
			isTabClicked = false;
		}, 1000);
	});

	$(".tab3 a").click(function(){
		isTabClicked = true;
		var scrollTop=win.scrollTop();
		if(scrollTop < btnPosTop){
			$(".tabContainer").css("margin-top", "240px");
			$('html,body').animate({ scrollTop: $(this.hash).offset().top-482}, 1000);
		}
		else{
			$('html,body').animate({ scrollTop: $(this.hash).offset().top-218 }, 1000);
		}
		$(".active").removeClass("active");
		$(".tab3 a").addClass("active");
		setTimeout(function()
		{
			isTabClicked = false;
		}, 1000);
	});



$(".tab4 a").click(function(){
		isTabClicked = true;
		var scrollTop=win.scrollTop();
		if(scrollTop < btnPosTop){
			$(".tabContainer").css("margin-top", "240px");
			$('html,body').animate({ scrollTop: $(this.hash).offset().top-475}, 1000);
		}
		else{
			$('html,body').animate({ scrollTop: $(this.hash).offset().top-214 }, 1000);
		}
		$(".active").removeClass("active");
		$(".tab4 a").addClass("active");
		setTimeout(function()
		{
			isTabClicked = false;
		}, 1000);
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
		callWithdrawCashResponse();
		$('#fee_tooltip').slideDown(55);
	});
	$("#fancybox-close").click(function() {
		$('#fee_tooltip').hide(55);
	});
	
	$("#fee2").click(function() {
		callAddCashResponse();
		$('#fee_tooltip2').slideDown(55);
	});
	$("#fancybox-close2").click(function() {
		$('#fee_tooltip2').hide(55);
	});
	
	$("#signUpMail1").focusin(function() {
		emailFocusIn("1");
	});
	$("#signUpZipcode1").focusin(function() {
		zipcodeFocusIn("1");
	});
	$("#signUpMail2").focusin(function() {
		emailFocusIn("2");
	});
	$("#signUpZipcode2").focusin(function() {
		zipcodeFocusIn("2");
	});
	$("#signUpMail3").focusin(function() {
		emailFocusIn("3");
	});
	$("#signUpZipcode3").focusin(function() {
		zipcodeFocusIn("3");
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
	$.popupWindow('https://www.stage2cp07.stage.paypal.com:8443/webapps/auth/protocol/openidconnect/v1/authorize?client_id=mgi_funds_out.moneygram.com&response_type=code&scope=profilehttps%3A%2F%2Furi.paypal.com%2Fservices%2FAdaptivePaymentsPayAPIopenid&redirect_uri=http://http://54.236.98.103/CXFRest/withdraw_cash_authenticated.html', {
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

function userSignUp(i)
{
	var signUpFlag = 0;
	signUpClickFlag = i;
	var emailValidation=/^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
	var numberValidation=/^[0-9]{5,}$/;
	var zipCodeLength = $("#signUpZipcode"+i).val().length;
	if(emailValidation.test($('#signUpMail'+i).val()) && ($('#signUpMail'+i).val() != null || $('#signUpMail'+i).val() != ""))
	{
		$("#signUpMail"+i).removeClass("requiredField");
		$("#mailerror"+i).html("");
	}
	else
	{
		$("#signUpMail"+i).addClass("requiredField");
		$("#mailerror"+i).html("Please enter email address properly");
		signUpFlag = 1;
	}
	if(numberValidation.test($('#signUpZipcode'+i).val()) && ($('#signUpZipcode'+i).val() != null || $('#signUpZipcode'+i).val() != ""))
	{
		$("#signUpZipcode"+i).removeClass("requiredField");
		$("#ziperror"+i).html("");
	}
	else
	{
		$("#signUpZipcode"+i).addClass("requiredField");
		$("#ziperror"+i).html("Zipcode length should be greater than 4");
		signUpFlag = 1;
	}
	if(signUpFlag == 0)
	{
		//{SendProofInputBean:{"customerEmail":"ndubey@moneygram.com","zipCode":"01568"}}
		var signup = new Object();
		signup.customerEmail = "ndubey@moneygram.com";//$("#signUpMail"+i).val();
		signup.zipCode = "01568";//$("#signUpZipcode"+i).val();
		var signupObj = new Object();
		signupObj.SendProofInputBean = signup;
		callService(methods.SendProofMessage[0], methods.SendProofMessage[1], signupObj, signUpSuccessHandler, signUpFailureHandler);
	}
	else
	{
		return false;
	}
}

var signUpSuccessHandler = function(response){
	document.body.style.overflow="visible";
	$('#preview').hide();
	$("#signupForm"+signUpClickFlag).addClass("displaynone");
	$("#signupThankU"+signUpClickFlag).removeClass("displaynone");
};

var signUpFailureHandler = function(response){
	alert(resources.errorMsg);
};

function emailFocusIn(i)
{
	if($("#signUpMail"+i).val() == "Email Address*")
	{
		$("#signUpMail"+i).val("");
		$("#signUpMail"+i).addClass("txt_signup");
	}
}

function zipcodeFocusIn(i)
{
	if($("#signUpZipcode"+i).val() == "Zip code")
	{
		$("#signUpZipcode"+i).val("");
		$("#signUpZipcode"+i).addClass("txt_signup");
	}
}