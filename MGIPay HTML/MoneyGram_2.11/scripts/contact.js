$("document").ready(function() {
	$("#contact_us_byEmail").hide();
	emptyAllFields();
	
	$("#contact_us_tab li ").click(function() {
		//  First remove class "active" from currently active tab
		if ($(this).index() != 2)
			displayCoverageBalanceAlert = false;
		var selected_tab = $(this).find("a").attr("href");

		if (selected_tab != "#") {
			$("#contact_us_tab li").removeClass('active');
			//  Now add class "active" to the selected/clicked tab
			$(this).addClass("active");
			//  Hide all tab content
			$(".contact_us_content").hide();
			//  Here we get the href value of the selected tab

			//  Show the selected tab content
			$(selected_tab).fadeIn();
		}
		//  At the end, we add return false so that the click on the link is not executed
		return false;
	});
	$(".tab3blank").unbind("click");
});

function sendMessage()
{
	var emailFlag = 0;
	var referenceNumber = '';
	var textValidation = /^[a-zA-Z.'-]+$/; 
	var emailValidation=/^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
	var phoneNumberValidation=/^[0-9]$/;
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
	$(".tabDisable").removeAttr("tabindex");
	$("#preview").hide();
	document.body.style.overflow="visible";
	$('.contact_us_byEmail p').css("color","black");
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
