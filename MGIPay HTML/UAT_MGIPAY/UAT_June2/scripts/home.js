var feeFlag = 0;
var faqAddCash;
var loggedIn;
var faqWithdrawCash;
var isTabClicked = false;
var signUpClickFlag;
var logoutClicked;
var isIE = /*@cc_on!@*/false; 

$(document).ready(function() {
	if(isIE) {
		logoutClicked = decode64($.cookie("logoutClicked"));
		loggedIn = decode64($.cookie("userLogin"));
	} else {
		logoutClicked = decode64(localStorage.getItem("logoutClicked"));
		loggedIn = decode64(localStorage.getItem("userLogin"));
	}
	if(logoutClicked == "true")
	{
		var backlen = history.length;
     	history.go(-backlen);
		$(window).unload(function(){
		window.location.href = "home.html";
		});
	
	}
	if(loggedIn == "yes")
	{
		$("#logoutLink").removeClass("displaynone").addClass("displayinline");
		$("#historyLink").removeClass("displaynone").addClass("displayinline");
		$(".topNav #contactUsLink").attr("border-right","1px solid #333333");
		$("#slides .slider_withdraw").removeClass('displaynone').addClass('displayblock');
		$("#slides .slider_login").removeClass('displayblock').addClass('displaynone');
		$("#paypalLogin").addClass("loginPaypalNone").removeClass('paypal_login');
	}
	else
	{
		$("#logoutLink").addClass("displaynone").removeClass("displayinline");
		$("#historyLink").addClass("displaynone").removeClass("displayinline");
		$(".topNav #contactUsLink").css("border-right",0);
		$("#slides .slider_login").removeClass('displaynone').addClass('displayblock');
		$("#slides .slider_withdraw").removeClass('displayblock').addClass('displaynone');
		$("#paypalLogin").removeClass("loginPaypalNone").addClass('paypal_login');
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
				
				if(isIE) {
					faqAddCash = decode64($.cookie("addCashActive"));
				} else {
					faqAddCash = decode64(localStorage.getItem("addCashActive"));
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
				if(isIE) {
					faqWithdrawCash = decode64($.cookie("withdrawCashActive"));
				} else {
					faqWithdrawCash = decode64(localStorage.getItem("withdrawCashActive"));
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
	
	
	var idFAQ;
	
	if(isIE){
		faqAddCash = decode64($.cookie("addCashActive"));
		faqWithdrawCash = decode64($.cookie("withdrawCashActive")); 
		idFAQ = encode64("no");
		$.cookie("faqId",idFAQ);
	}
	else{
		faqAddCash = decode64(localStorage.getItem("addCashActive"));
		faqWithdrawCash = decode64(localStorage.getItem("withdrawCashActive"));
		idFAQ = encode64("no");
		localStorage.setItem("faqId", idFAQ);
	}
	$("#identity").click(function(){
		
		if(isIE){
			idFAQ = encode64("yes");
			$.cookie("faqId", idFAQ);
		}
		else {
			idFAQ = encode64("yes");
			localStorage.setItem("faqId", idFAQ);
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
	var faqCashAdd;
	var faqCashWithdraw;
	if(faqAddCash == 'yes'){
		$(".tab2 a").trigger('click');
		if(isIE){
			faqCashAdd = encode64("no");
			$.cookie("addCashActive",faqCashAdd);  
		}
		else {
			faqCashAdd = encode64("no");
			localStorage.setItem("addCashActive", faqCashAdd);
		}	
	}
	if(faqWithdrawCash == 'yes'){
		$(".tab3 a").trigger('click');
		if(isIE){
			faqCashWithdraw = encode64("no");
			$.cookie("withdrawCashActive", faqCashWithdraw); 
		}
		else {
			faqCashWithdraw = encode64("no");
			localStorage.setItem("withdrawCashActive", faqCashWithdraw); 
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
	$.popupWindow('https://www.stage2cp07.stage.paypal.com:8443/webapps/auth/protocol/openidconnect/v1/authorize?client_id=mgi_fundsout_qa_env.moneygram.com&response_type=code&scope=profile email address phone https://uri.paypal.com/services/AdaptivePaymentsPayAPI openid&redirect_uri=https://qapaypal.qa.moneygram.com/withdraw-money.html', {
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


$('.logIntoPaypal').live('click', function(event) {  
		document.body.style.overflow="hidden";
		
		$('.black_overlay').css('display','block');
		
		var sheight = (screen.height) * 0.6;
		var swidth = (screen.width) * 0.6;  
	event.preventDefault();
	$.popupWindow('https://www.paypal.com/cgi-bin/webscr?cmd=_cip-verification&flow=CASH&return_url=size="3">http://54.236.96.35/home.html&cancel_url=http://54.236.96.35/home.html', {
		height:sheight,
		width:sheight,
		onUnload: function() {
			$('.black_overlay').css('display','none');
			document.body.style.overflow="visible";
		}
	});
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
		$("#mailerror"+i).html(resources.emailMsg);
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
		$("#ziperror"+i).html(resources.zipcodeMsg);
		signUpFlag = 1;
	}
	if(signUpFlag == 0)
	{
		var signup = new Object();
		signup.customerEmail = $("#signUpMail"+i).val();
		signup.zipCode = $("#signUpZipcode"+i).val();
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
	$('#preview').hide();
	$("#signupForm"+signUpClickFlag).addClass("displaynone");
	$("#signupThankU"+signUpClickFlag).removeClass("displaynone");
};

var signUpFailureHandler = function(){
	alert(resources.errorMsg);
};

function emailFocusIn(i)
{
	if($("#signUpMail"+i).val() == "Email address")
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

