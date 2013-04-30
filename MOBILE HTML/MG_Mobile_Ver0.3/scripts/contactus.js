$(document).ready(function() {
	$(".toggle_container").hide();
		var x=0;
		$("h2.expand_heading").click(function() {
			if(x==0){
				if($(this).hasClass("active")){
				$(this).removeClass("active");
				}
				else{
					$(this).addClass("active");
				}
				$(this).next().slideToggle(500).siblings(".toggle_container").hide(500);
				$(this).siblings().removeClass("active");
			}
			else{
				if($(this).hasClass("active")){
					$(this).removeClass("active");
				}
				else{
					$(this).addClass("active");
				}
					$(this).next().slideToggle(500);
			}
		});

		$(".expandall").click(function() {
			x++;
			$(this).addClass("expanded");
			$("h2.expand_heading").addClass("active");
		}); 
		$("collapseall").click(function() {
			x = 0;
			$(this).removeClass("expanded");
			$("h2.expand_heading").removeClass("active");
		});
		$(".expandall").click(function() {
			x++;
			if ($(this).hasClass("expanded")) {
				$(".toggle_container").slideDown("slow");
				$("h2.expand_heading").addClass("active");
			} else {
				$(".toggle_container").slideUp("slow");
				$("h2.expand_heading").removeClass("active");
			}
		});
		$(".collapseall").click(function() {
			x = 0;
			if ($(this).hasClass("expanded")) {
				$(".toggle_container").slideDown("slow");
				$("h2.expand_heading").addClass("active");
			} else {
				$(".toggle_container").slideUp("slow");
				$("h2.expand_heading").removeClass("active");
			}
		});
				/*** Navigate to login page  start***/
		$('.paypal_login').live('click', function(event) {  
			$('.black_overlay').css('display','block');
			document.body.style.overflow="hidden";
			var sheight = (screen.height) * 0.6;
			var swidth = (screen.width) * 0.6;  
			event.preventDefault();
          	$.popupWindow('https://www.paypal.com/in/cgi-bin/webscr?cmd=_login-submit', {
          	height:sheight,
          	width:sheight,
            onUnload: function() {
            $('.black_overlay').css('display','none');
			 document.body.style.overflow="visible";
            }
          	});
		});
		/*** Navigate to login page  end***/
});

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
