
var reviewResp = "";
var reviewValues = "";
var reviewDetails;
var orientationVar;
var loginResponse = "";
var referenceNum;
$.browser.chrome = /chrome/.test(navigator.userAgent.toLowerCase());
$(document).ready(function() {
	orientationVar = 0;
	if($.browser.chrome){
		loginResponse = localStorage.loginResponse;
		reviewResp = localStorage.getItem("commitResponse");
		reviewValues = localStorage.getItem("reviewValues");
	}
	else{
		loginResponse = $.cookie("loginResponse");
		reviewResp = $.cookie("commitResponse");
		reviewValues = $.cookie("reviewValues");
	}
	loginResponse = JSON.parse(loginResponse);
	if(loginResponse == "" || loginResponse == undefined || loginResponse == null)
	{
	}
	else
	{
		reviewDetails = reviewValues.split(",");
		$(".sender_name").html(reviewDetails[0]);
		$(".state").html(reviewDetails[1]);
		$(".pickup").html(reviewDetails[2]);
		$(".availability").html(reviewDetails[3]);
		$(".review_total").html(reviewDetails[4]+" USD");
		$(".final_fee").html(reviewDetails[5]+" USD");
		$(".receive_amt").html(reviewDetails[6]+" USD");
	}
	$('#chk_box').click(function(){
		if($('#chk_box').is(':checked')){
   			$("#withdraw_button").removeAttr("disabled");
			$("#withdraw_button").css("opacity","1");
		}
		else{
			$("#withdraw_button").attr("disabled","disabled");
			$("#withdraw_button").css("opacity","0.5")
		}
	});
	
});

$(window).resize(function(){
 	if(orientationVar==1)
 	{
 		openTermsAndConditions();
 	}
 	if(orientationVar==2)
 	{
 		openFraudMessage();
 	}
 	
 	});

function openTermsAndConditions()
{
	orientationVar=1;
	var sheight = (screen.height) ;
	 var swidth = (screen.width);   
	 document.body.style.position="fixed";
 $.fancybox({
    	  autoDimensions: false,
    	'width'             :"90%",
       'height'            : "90%",
        content: $('#termsAndConditions').html(),
    	
    	'onClosed' : function(){
						   document.body.style.position="relative";
 location.reload(true);
				 orientationVar=0;
    	 				}
  });
}

function openFraudMessage()
{
  orientationVar=2;
	var sheight = (screen.height) ;
	 var swidth = (screen.width);   
	 document.body.style.position="fixed";
 $.fancybox({
    	  autoDimensions: false,
    	'width'             :"90%",
       'height'            : "90%",
        	content: $('#fraudMessageContent').html(),
    	 
    	'onClosed' : function(){
						   document.body.style.position="relative";
 location.reload(true);
						 orientationVar=0;
    	 				}
  });
}

function goToConfirmation()
{
	var sessionId;
	if($.browser.chrome){
			sessionId = localStorage.getItem("sessionID");
		}
		else {
			sessionId = $.cookie("sessionID");
		}
	var commitSessionId = new Object();
	commitSessionId.mgiTransactionSessionID = sessionId;
	commitSessionId.customerEmail = loginResponse.email;
	commitSessionId.customerName = loginResponse.given_name;
	commitSessionId.customerPhoneNumber = loginResponse.phone_number;
	commitSessionId.paypalTransactionID = "58965687";
	commitSessionId.transactionAmount =reviewDetails[6];
	commitSessionId.transactionFee = reviewDetails[5];
	commitSessionId.token = loginResponse.token;
	var commitObj = new Object();
	commitObj.CommitTransactionInputBean = commitSessionId;
	callService(methods.CommitTransaction[0], methods.CommitTransaction[1], commitObj , withdrawSuccessHandler, withdrawFailureHandler);
}

/**** method called on withdrawCash success *****/	
var withdrawSuccessHandler = function(response){
	$("#preview").hide();
	if(response.transactionSuccess == true)
	{
		openFraudMessage();
		if($.browser.chrome)
			localStorage.setItem("referenceNumber", response.referenceNumber); 
		else 
			$.cookie("referenceNumber", response.referenceNumber); 
		referenceNum = response.referenceNumber;
	}
	else
	{
		alert(response.errorMessage);
	}
}		
	
var withdrawFailureHandler = function(response){
	$("#preview").hide();
	alert(resources.errorMsg);
}		

function checkBoxClick()
{
	window.location.href = "withdraw-money-confirmation.html";
}

function setFlag()
{
	if($.browser.chrome){
		localStorage.setItem("reviewFlag","true");
	}
	else {
		$.cookie("reviewFlag","true");
	}
}

function callFAQ()
{
	setFlag();
	window.location.href = "frequently-asked-questions.html";
}
function callContactUs()
{
	setFlag();
	window.location.href = "contact-us.html";
}
function callHistory()
{
	setFlag();
	window.location.href = "AutherticatedHome.html";
}
function callPrivacy()
{
	setFlag();
	window.location.href = "privacypolicy.html";
}
function callTOU()
{
	setFlag();
	window.location.href = "termsofuse.html";
}
function callTAC()
{
	setFlag();
	window.location.href = "terms_and_conditions.html";
}
function callAboutMG()
{
	setFlag();
	window.location.href = "about-moneygram-paypal.html";
}
function callHome()
{
	setFlag();
	window.location.href = "home.html";
}