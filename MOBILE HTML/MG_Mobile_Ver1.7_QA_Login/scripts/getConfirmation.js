
var message;
var withdrawValues;
var reviewDetails;
var referenceNum;
var loginResponse = "";
var phoneNumber;
$.browser.chrome = /chrome/.test(navigator.userAgent.toLowerCase());

$(document).ready(function() {
	
	if($.browser.chrome){
		loginResponse = localStorage.loginResponse;
		referenceNum = localStorage.getItem("referenceNumber");
		withdrawValues = localStorage.getItem("withdrawValues");
		localStorage.setItem("reviewValues","");
	}
	else{
		loginResponse = $.cookie("loginResponse");
		referenceNum = $.cookie("referenceNumber"); 
		withdrawValues = $.cookie("withdrawValues"); 
		$.cookie("reviewValues",""); 
	}
	loginResponse = JSON.parse(loginResponse);
	if(loginResponse == "" || loginResponse == undefined || loginResponse == null)
	{
	}
	else
	{
		reviewDetails = withdrawValues.split(",");
		console.log(reviewDetails);
		$(".sender_name").html(reviewDetails[0]);
		$(".state").html(reviewDetails[1]);
		$(".pickup").html(reviewDetails[2]);
		$(".availability").html(reviewDetails[3]);
		$(".review_total").html(reviewDetails[4]+" USD");
		$(".final_fee").html(reviewDetails[5]+" USD");
		$(".receive_amt").html(reviewDetails[6]+" USD");
		phoneNumber = loginResponse.phone_number;
		$(".ref_num").html(referenceNum);
		sendMailFlag = true;
		sendMailReview();
	}
});

function printPage()
{
	if((/iPhone/gi).test(navigator.userAgent))
	{
		window.print(); 
		return false;
	}
	else
	{
		alert(resources.printError);
	}
}

function sendSMS()
{
	var conf = confirm("Do you want to send SMS to "+phoneNumber+"?");
    if(conf == true){
        if((/iPhone/gi).test(navigator.userAgent)) //iPad
		{
			window.location.href = 'sms:+' + phoneNumber + '';//sms:+437722735932
		}
		if((/Android/gi).test(navigator.userAgent) || (/HTC/g).test(navigator.userAgent) || (/blackberry/gi).test(navigator.userAgent))
		{
			messageDetails();
		}
		if((/windows phone/gi).test(navigator.userAgent))
		{
			alert(resources.SMSError);
		}
    }
}

function messageDetails()
{
	message = "Your MoneyGram Reference Number is "+ referenceNum;
	window.location.href = 'sms:' + phoneNumber + '?body=' + message + '';
}


function sendMail()
{
        var sendObj = new Object();
        sendObj.customerEmail = loginResponse.email;
        sendObj.transactionAmount = reviewDetails[6];
        sendObj.referenceNumber = referenceNum;
        sendObj.customerName = loginResponse.given_name;
        sendObj.stateName = reviewDetails[2];
        sendObj.fee = reviewDetails[5];
        var sendMailObj = new Object();
        sendMailObj.TransactionInformationMailInputBean = sendObj;
        callService(methods.SendTransactionInformationMail[0], methods.SendTransactionInformationMail[1], sendMailObj, sendMailSuccessHandler, sendMailFailureHandler);
}


var sendMailSuccessHandler = function(response){
	$('#preview').hide();
	if(response.transactionSuccess == true)
	{
		alert(response.messageToUser);
	}
	else
	{
		alert(response.messageToUser);
	}
}		

var sendMailFailureHandler = function(response){
	$("#preview").hide();
	alert(resources.errorMsg);
}		

function changeHashOnLoad() {
     window.location.href += "#";
     setTimeout("changeHashAgain()", "50");
}

function changeHashAgain() {
  window.location.href += "1";
}

var storedHash = window.location.hash;
window.setInterval(function () {
    if (window.location.hash != storedHash) {
         window.location.hash = storedHash;
    }
}, 50);

/**** sendMail on review ****/

function sendMailReview()
{
        var sendObj = new Object();
        sendObj.customerEmail = loginResponse.email;
        sendObj.transactionAmount = reviewDetails[6];
        sendObj.referenceNumber = referenceNum;
        sendObj.customerName = loginResponse.given_name;
        sendObj.stateName = reviewDetails[2];
        sendObj.fee = reviewDetails[5];
        var sendMailObj = new Object();
        sendMailObj.TransactionInformationMailInputBean = sendObj;
        callService(methods.SendTransactionInformationMail[0], methods.SendTransactionInformationMail[1], sendMailObj, sendMailReviewSuccessHandler, sendMailReviewFailureHandler);
}

var sendMailReviewSuccessHandler = function(response){
}		

var sendMailReviewFailureHandler = function(){
}	