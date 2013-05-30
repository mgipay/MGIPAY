
var flagClass = false;
var loginResponse = "";
$.browser.chrome = /chrome/.test(navigator.userAgent.toLowerCase());
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
	if($.browser.chrome) {
			loginResponse = localStorage.loginResponse;
		} else {
			loginResponse = $.cookie("loginResponse");
		}
	if(loginResponse == null || loginResponse == "" || loginResponse == undefined)
	{
		
	}
	else
	{
		loginResponse = JSON.parse(loginResponse);
		$("#firstName").val(loginResponse.given_name);
		$("#lastName").val(loginResponse.family_name);
		$("#emailAddress").val(loginResponse.email);
	}
});

function sendMessage()
{
	var emailFlag = 0;
	var referenceNumber = '';
	var textNumValidation = /^[a-zA-Z0-9]+$/; 
	var textValidation = /^[a-zA-Z.' ]+$/; 
	var emailValidation=/^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
	var phoneNumberValidation=/^[0-9-]+$/;
	if (textValidation.test($('#firstName').val()) && ($('#firstName').val() != null || $('#firstName').val() != ""))
	{
		$("#firstName").removeClass("requiredField");
		$(".contact_us_byEmail ul:eq(0) li .lblerror").html("");
	}
	else
	{
		$("#firstName").addClass("requiredField");
		$(".contact_us_byEmail ul:eq(0) li .lblerror").html(resources.firstNameMsg);
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
		$(".contact_us_byEmail ul:eq(1) li .lblerror").html(resources.lastNameMsg);
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
		$(".contact_us_byEmail ul:eq(2) li .lblerror").html(resources.emailMsg);
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
		$(".contact_us_byEmail ul:eq(3) li .lblerror").html(resources.PhoneNumMsg);
		emailFlag = 1;
	}
		
	if ($('#message').val() == null || $('#message').val() == "" || ( $('#message').val() == "<" || ($('#message').val()).indexOf("<") >= 0 || $('#message').val() == ">" || ($('#message').val()).indexOf(">") >= 0))
	{
		$("#message").addClass("requiredField");
		$(".contact_us_byEmail ul:eq(8) li .lblerror").html(resources.msgContactUs);
		emailFlag = 1;
	}
	else
	{
		$("#message").removeClass("requiredField");
		$(".contact_us_byEmail ul:eq(8) li .lblerror").html("");
	}
	if( $('#transactionDate').val() == "<" || ($('#transactionDate').val()).indexOf("<") >= 0 || $('#transactionDate').val() == ">" || ($('#transactionDate').val()).indexOf(">") >= 0)
	{
		$("#transactionDate").addClass("requiredField");
		$(".contact_us_byEmail ul:eq(4) li .lblerror").html(resources.transactionDateMsg);
		emailFlag = 1;
	}
	else
	{
		$("#transactionDate").removeClass("requiredField");
		$(".contact_us_byEmail ul:eq(4) li .lblerror").html("");
	}
	if( $('#transactionAmount').val() == "<" || ($('#transactionAmount').val()).indexOf("<") >= 0 || $('#transactionAmount').val() == ">" || ($('#transactionAmount').val()).indexOf(">") >= 0)
	{
		$("#transactionAmount").addClass("requiredField");
		$(".contact_us_byEmail ul:eq(5) li .lblerror").html(resources.transactionAmtMsg);
		emailFlag = 1;
	}
	else
	{
		$("#transactionAmount").removeClass("requiredField");
		$(".contact_us_byEmail ul:eq(5) li .lblerror").html("");
	}
	if(flagClass == true)
	{
		if(textNumValidation.test($('#referenceNumber').val()) && ($('#referenceNumber').val() != null || $('#referenceNumber').val() != ""))
		{
			$("#referenceNumber").removeClass("requiredField");
			$(".contact_us_byEmail ul:eq(6) li .lblerror").html("");
			
		}
		else
		{
			$("#referenceNumber").addClass("requiredField");
			$(".contact_us_byEmail ul:eq(6) li .lblerror").html(resources.refNumber);
			emailFlag = 1;
		}
	}
	else
	{
		if( $('#referenceNumber').val() == "<" || ($('#referenceNumber').val()).indexOf("<") >= 0 || $('#referenceNumber').val() == ">" || ($('#referenceNumber').val()).indexOf(">") >= 0)
		{
			$("#referenceNumber").addClass("requiredField");
			$(".contact_us_byEmail ul:eq(6) li .lblerror").html(resources.transactionAmtMsg);
			emailFlag = 1;
		}
		else
		{
			$("#referenceNumber").removeClass("requiredField");
			$(".contact_us_byEmail ul:eq(6) li .lblerror").html("");
		}
	}
	if(emailFlag == 0)
	{
		var messageObj = new Object();
		messageObj.firstname = $("#firstName").val();
        messageObj.lastName = $("#lastName").val();
		messageObj.mailSubject = $("#reasonID option:selected").html();
		messageObj.mailText = $('#message').val();
		messageObj.referenceNumber = $("#referenceNumber").val();
		messageObj.customerEmailId = $("#emailAddress").val();
		messageObj.phoneNumber = $("#phoneNumber").val();
		messageObj.amount = $("#transactionAmount").val();
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
		$(".general_message").addClass("displaynone");
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
	$('#reasonID option[value="General"]').attr("selected",true);
}

var emailSuccessHandler = function(response) {
	$("#preview").hide();
	$('.contact_us_byEmail p').css("color","black");
	if(response.transactionSuccess == true)
	{
		$("#emailDiv").addClass("displaynone");
		$("#sendMessage").addClass("displaynone");
		$("#contentDiv").removeClass("displaynone").addClass("displayblock");
		$("#contentDiv").append("<p class='nomargin'><strong>"+response.messageToUser+"</strong></p>");
	}
	else
	{
		alert(resources.errorMsg);
	}
};

var emailFailureHandler = function() {
	alert(resources.errorMsg);
};
