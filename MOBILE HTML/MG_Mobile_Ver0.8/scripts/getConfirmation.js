/*function isWindowsPhone(){
	return navigator.userAgent.match(/windows phone/i);
}*/
var number;
var message;
var reviewValues = "";
var reviewDetails;
var referenceNum;
var loginResponse = "";

$(document).ready(function() {
	//window.onbeforeunload = function() { alert("you cannot press back button");};
	if($.browser.chrome){
		loginResponse = localStorage.loginResponse;
		referenceNum = localStorage.getItem("reviewValues");
		localStorage.setItem("withdrawPageDetails","");
	}
	else{
		loginResponse = $.cookie("loginResponse");
		referenceNum = $.cookie("reviewValues"); 
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
		$(".review_total").html(reviewDetails[4]);
		$(".final_fee").html(reviewDetails[5]);
		$(".receive_amt").html(reviewDetails[6]);
	}
});

function printPage()
{
	window.print(); 
	return false;
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
}

function messageDetails()
{
	message = "Your MoneyGram Reference Number is "+ referenceNum;
	window.location.href = 'sms:' + number + '?body=' + message + '';
}

function sendMail()
{
	

	var sendObj = new Object();
	sendObj.CustomerEmail = loginResponse.email;
	sendObj.TransactionAmount = reviewDetails[4];
	sendObj.ReferenceNumber = referenceNum;
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
