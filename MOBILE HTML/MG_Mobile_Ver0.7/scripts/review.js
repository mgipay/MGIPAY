
var reviewResp = "";
var reviewValues = "";
var reviewDetails;
var orientationVar;
$(document).ready(function() {
	orientationVar = 0;
	if($.browser.chrome){
		reviewResp = localStorage.getItem("commitResponse");
		reviewValues = localStorage.getItem("reviewValues");
	}
	else{
		reviewResp = $.cookie("commitResponse");
		reviewValues = $.cookie("reviewValues"); 
	}
	reviewDetails = reviewValues.split(",");
	$(".sender_name").html(reviewDetails[0]);
	$(".state").html(reviewDetails[1]);
	$(".pickup").html(reviewDetails[2]);
	$(".availability").html(reviewDetails[3]);
	$(".review_total").html(reviewDetails[4]);
	$(".final_fee").html(reviewDetails[5]);
	$(".receive_amt").html(reviewDetails[6]);
	
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
	// orientationVar=1;
	// var sheight = (screen.height) * 0.9;
		// var swidth = (screen.width) * 0.94;   
	// document.body.style.position="fixed";
 	// $.fancybox({
    	 // autoDimensions: false,
    	 // 'width'             :swidth,
         // 'height'            : sheight,
        	 // content: $('#termsAndConditions').html(),
//     	 
    	 // 'onClosed' : function(){
						   // document.body.style.position="relative";
						   // orientationVar=0;
    	 				// }
    // });
    
    $("#termsAndConditions").html('<iframe src="termsAndConditions.html" id="termsIframe"></iframe>');
	document.body.style.overflow="hidden";
	document.body.style.position="fixed";
 	$.fancybox({
    	 autoDimensions: false,
    	 'width'             : "90%",
         'height'            : "75%",
    	 content: $('#termsIframe').clone(),
    	 'onClosed' : function(){
						   document.body.style.position="relative";
    	 				}
    });
}

function openFraudMessage()
{
// orientationVar=2;
 // var sheight = (screen.height);
		// var swidth = (screen.width);  
	// document.body.style.position="fixed";
 	// $.fancybox({
    	 // autoDimensions: false,
    	 // 'width'             : swidth,
         // 'height'            : sheight,
        	 // content: $('#fraudMessageContent').html(),
//     	 
    	 // 'onClosed' : function(){
						   // document.body.style.position="relative";
						   // orientationVar=0;
    	 				// }
    // });
    $("#fraudMessageContent").html('<iframe src="fraudMessage.html" id="fraudIframe"></iframe>');
	document.body.style.overflow="hidden";
 	$.fancybox({
    	 autoDimensions: false,
    	 'width'             : "90%",
         'height'            : "75%",
    	 content: $('#fraudIframe').clone(),
    	 'onClosed' : function(){
						   document.body.style.overflow="visible";
    	 				}
    });
}

function goToConfirmation()
{
	openFraudMessage();
	var sessionId;
	if($.browser.chrome){
			sessionId = localStorage.getItem("sessionID");
		}
		else {
			sessionId = $.cookie("sessionID");
		}
	var commitSessionId = new Object();
	commitSessionId.mgiTransactionSessionID = sessionId;
	commitSessionId.customerEmail = "vbalki@ebay.com";
	commitSessionId.customerName = "VIJAY BALAKRISHNAN";
	commitSessionId.customerPhoneNumber = "6057100363";
	commitSessionId.paypalTransactionID = "58965687";
	commitSessionId.transactionAmount =reviewDetails[6];
	commitSessionId.transactionFee = reviewDetails[5];
	var commitObj = new Object();
	commitObj.CommitTransactionInputBean = commitSessionId;
	callService(methods.CommitTransaction[0], methods.CommitTransaction[1], commitObj , withdrawSuccessHandler, withdrawFailureHandler);
	
}

/**** method called on withdrawCash success *****/	
var withdrawSuccessHandler = function(response){
	$("#preview").hide();
	if(response.transactionSuccess == true)
	{
		if($.browser.chrome)
			localStorage.setItem("referenceNumber", response.referenceNumber); 
		else 
			$.cookie("referenceNumber", response.referenceNumber); 
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
	window.location.href = "confirmation.html";
}
