
var number;
var message;
var reviewValues = "";
var reviewDetails;
var referenceNum;
var loginResponse = "";

$(document).ready(function() {
	if($.browser.chrome){
		loginResponse = localStorage.loginResponse;
		referenceNum = localStorage.getItem("referenceNumber");
		reviewValues = localStorage.getItem("reviewValues");
		localStorage.setItem("withdrawPageDetails","");
	}
	else{
		loginResponse = $.cookie("loginResponse");
		referenceNum = $.cookie("referenceNumber"); 
		reviewValues = $.cookie("reviewValues"); 
		$.cookie("withdrawPageDetails",""); 
	}
if($.browser.chrome){
		reviewValues = localStorage.getItem("reviewValues");
	}
	else{
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
		alert("Print functionality is not available in this device");
	}
}

function sendSMS()
{
	number = 9998886660;
	if((/iPhone/gi).test(navigator.userAgent)) //iPad
	{
		window.location.href = 'sms:+' + number + '';//sms:+437722735932
	}
	if((/Android/gi).test(navigator.userAgent) || (/HTC/g).test(navigator.userAgent) || (/blackberry/gi).test(navigator.userAgent) || (/windows phone/gi).test(navigator.userAgent))
	{
		messageDetails();
	}
	if((/windows phone/gi).test(navigator.userAgent))
	{
		alert("This feature is not available in your device");
	}
}

function messageDetails()
{
	message = "Your MoneyGram Reference Number is "+ referenceNum;
	window.location.href = 'sms:' + number + '?body=' + message + '';
}


function sendMail()
{
        var sendObj = new Object();
        sendObj.customerEmail = loginResponse.email;
        sendObj.transactionAmount = reviewDetails[4];
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
