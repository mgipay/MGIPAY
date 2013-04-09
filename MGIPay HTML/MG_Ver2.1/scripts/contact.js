$("document").ready(function() {
	$("#contact_us_byEmail").hide();
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
	 $("#sendMessage").click(function(){
	 	
	});	
});

function sendMessage()
{
	var referenceNumber = '';
	var textValidation = /^[a-zA-Z]*$/; 
	var emailValidation=/^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/;
	var phoneNumberValidation=/^[0-9]{10}$/;
	if($('#firstName').val()=='' || $('#lastName').val()=='' ||  $('#emailAddress').val()=='' ||  $('#phoneNumber').val()=='' || $('#message').val()=='' )
	{
		alert('Please enter all mandatory fields');
		return false;
	}
	else if (!textValidation.test($('#firstName').val()))
	{
		alert('Plese enter first name properly');
		return false;
	}
	else if (!textValidation.test($('#lastName').val()))
	{
		alert('Plese enter last name properly');
		return false;
	}
	else if (!emailValidation.test($('#emailAddress').val()))
	{
		alert('Plese enter email address properly');
		return false;
	}
	else if (!phoneNumberValidation.test($('#phoneNumber').val()))
	{
		alert('Plese enter phone number properly');
		return false;
	}
	if($.browser.chrome) {
		referenceNumber = localStorage.getItem("referenceNum");
	} else {
		referenceNumber = $.cookie("referenceNum");
	}
	var messageObj = new Object();
	messageObj.firstname = $("#firstName").val();
	messageObj.lastName = $("#lastName").val();
	messageObj.mailSubject = "SUbjetc_Of_Mail";
	messageObj.mailText = $('#message').val();
	messageObj.referenceNumber = $("#referenceNumber").val();
	messageObj.customerEmailId = $("#emailAddress").val();
	messageObj.phoneNumber = $("#phoneNumber").val();
	var sendMsgObj = new Object();
	sendMsgObj.SendMailInputBean = messageObj;
	alert(JSON.stringify(sendMsgObj));
	callService(methods.SendMail[0], methods.SendMail[1], "", "", sendMsgObj, emailSuccessHandler, emailFailureHandler);
}

var emailSuccessHandler = function(response) {
	$("#preview").hide();
	alert(JSON.stringify(response));
};

var emailFailureHandler = function(response) {
alert("error");
};
