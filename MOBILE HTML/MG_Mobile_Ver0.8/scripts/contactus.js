$(document).ready(function() {
	emptyAllFields();
	$(".toggle_container").hide();
		$("h2.expand_heading").click(function() {
				if($(this).hasClass("active")){
				$(this).removeClass("active");
				}
				else{
					$(this).addClass("active");
				}
				$(this).next().slideToggle(500).siblings(".toggle_container").hide(500);
				$(this).siblings().removeClass("active");
		});

});

var flagClass = false;
function sendMessage()
{
	var emailFlag = 0;
	var referenceNumber = '';
	var textValidation = /^[a-zA-Z.'-]+$/; 
	var emailValidation=/^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
	var phoneNumberValidation=/^[0-9]+$/;
	if (textValidation.test($('#firstName').val()) && ($('#firstName').val() != null || $('#firstName').val() != ""))
	{
		$("#firstName").removeClass("requiredField");
		$(".contact_us_byEmail ul:eq(0) li .lblerror").html("");
	}
	else
	{
		$("#firstName").addClass("requiredField");
		$(".contact_us_byEmail ul:eq(0) li .lblerror").html("Plese enter first name properly");
		emailFlag = 1;
	}
		
	if (textValidation.test($('#lastName').val()) && ($('#lastName').val() != null || $('#lastName').val() != ""))
	{
		$("#lastName").removeClass("requiredField");
		$(".contact_us_byEmail ul:eq(1) li .lblerror").html("");
	}
	else
	{
		$("#lastName").addClass("requiredField");
		$(".contact_us_byEmail ul:eq(1) li .lblerror").html("Please enter last name properly");
		emailFlag = 1;
	}
		
	if (emailValidation.test($('#emailAddress').val()) && ($('#emailAddress').val() != null || $('#emailAddress').val() != ""))
	{
		$("#emailAddress").removeClass("requiredField");
		$(".contact_us_byEmail ul:eq(2) li .lblerror").html("");
	}
	else
	{
		$("#emailAddress").addClass("requiredField");
		$(".contact_us_byEmail ul:eq(2) li .lblerror").html("Please enter email address properly");
		emailFlag = 1;
	}
		
	if (phoneNumberValidation.test($('#phoneNumber').val()) && ($('#phoneNumber').val() != null || $('#phoneNumber').val() != ""))
	{
		$("#phoneNumber").removeClass("requiredField");
		$(".contact_us_byEmail ul:eq(3) li .lblerror").html("");
	}
	else
	{
		$("#phoneNumber").addClass("requiredField");
		$(".contact_us_byEmail ul:eq(3) li .lblerror").html("Please enter phone number properly");
		emailFlag = 1;
	}
		
	if ($('#message').val() == null || $('#message').val() == "")
	{
		$("#message").addClass("requiredField");
		$(".contact_us_byEmail ul:eq(8) li .lblerror").html("Please enter Message");
		emailFlag = 1;
	}
	else
	{
		$("#message").removeClass("requiredField");
		$(".contact_us_byEmail ul:eq(8) li .lblerror").html("");
	}
	if(flagClass == true && ($('#referenceNumber').val() == null || $('#referenceNumber').val() == ""))
	{
		$("#referenceNumber").addClass("requiredField");
		$(".contact_us_byEmail ul:eq(6) li .lblerror").html("Please enter Reference Number");
		emailFlag = 1;
	}
	else
	{
		$("#referenceNumber").removeClass("requiredField");
		$(".contact_us_byEmail ul:eq(6) li .lblerror").html("");
	}
	if(emailFlag == 0)
	{
		var messageObj = new Object();
		messageObj.mailSubject = "subject of the mail";
		messageObj.mailText = $('#message').val();
		messageObj.referenceNumber = $("#referenceNumber").val();
		messageObj.customerEmailId = $("#emailAddress").val();
		messageObj.phoneNumber = $("#phoneNumber").val();
		var sendMsgObj = new Object();
		sendMsgObj.SendMailInputBean = messageObj;
		callService(methods.SendMail[0], methods.SendMail[1], sendMsgObj, emailSuccessHandler, emailFailureHandler);
	}
	else
	{
		return false;
	}
}

function selectedValue()
{
	if($("#reasonID option:selected").html() == "Refund")
	{
		$("#referenceNumber").addClass("impFields");
		$("#refnum").addClass("txtbold");
		flagClass = true;
	}
	else
	{
		$("#referenceNumber").removeClass("impFields");
		$("#refnum").removeClass("txtbold");
		flagClass = false;
	}
}

function emptyAllFields()
{
	$("#firstName").val("");
	$("#lastName").val("");
	$("#emailAddress").val("");
	$("#phoneNumber").val("");
	$("#transactionDate").val("");
	$("#transactionAmount").val("");
	$("#referenceNumber").val("");
	$("#message").val("");
}


var emailSuccessHandler = function(response) {
	$("#preview").hide();
	document.body.style.overflow="visible";
	if(response.transactionSuccess == true)
	{
		$("#emailDiv").addClass("displaynone");
		$("#sendMessage").addClass("displaynone");
		$("#contentDiv").removeClass("displaynone").addClass("displayblock");
		$("#contentDiv").html("<p class='nomargin'>"+response.messageToUser+"</p>");
	}
	else
	{
		alert(resources.errorMsg);
	}
};

var emailFailureHandler = function(response) {
	alert(resources.errorMsg);
};
