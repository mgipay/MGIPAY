/*function isWindowsPhone(){
	return navigator.userAgent.match(/windows phone/i);
}*/
var number;
var message;
var reviewValues = "";
var reviewDetails;

$(document).ready(function() {
	alert("jfj");
	//$.browser.chrome = /chrome/.test(navigator.userAgent.toLowerCase());
if($.browser.chrome){
		reviewValues = localStorage.getItem("reviewValues");
	}
	else{
		reviewValues = $.cookie("reviewValues"); 
	}
	alert("xbchgfc"+reviewValues);
	reviewDetails = reviewValues.split(",");
	$(".sender_name").html(reviewDetails[0]);
	$(".state").html(reviewDetails[1]);
	$(".pickup").html(reviewDetails[2]);
	$(".availability").html(reviewDetails[3]);
	$(".review_total").html(reviewDetails[4]);
	$(".final_fee").html(reviewDetails[5]);
	$(".receive_amt").html(reviewDetails[6]);
});

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
	message = "MoneyGram Message Details";
	window.location.href = 'sms:' + number + '?body=' + message + '';
}

