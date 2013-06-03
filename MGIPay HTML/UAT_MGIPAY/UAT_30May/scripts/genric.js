var addCashLinkResponse;
var withdrawLinkResponse;
var userLoggedIn;
var sessionTimedOut;
var sessionTime;
var isIE = /*@cc_on!@*/false; 
$(document).ready(function(){
	
	if(isIE)
		{
			userLoggedIn = $.cookie("userLogin"); 
			sessionTime = $.cookie("sessionDate"); 
		}
		else 
		{
			userLoggedIn = localStorage.getItem("userLogin");
			sessionTime = localStorage.getItem("sessionDate");
		}
		if(userLoggedIn == "yes")
		{
				var sessionExpirationTime =  Date.parse(sessionTime) - Date.now();
				if(sessionExpirationTime < 0){
					sessionTimedOut = 'yes'
					logout();
				} else{
					setTimeout(function(){
						sessionTimedOut = 'yes'
						logout();
					},sessionExpirationTime);
				}
		}

	// Following snippet for showing alert in case of session timeout
	if(isIE)
		{
			if($.cookie("sessionTimedOut") == 'true'){
				alert(resources.sessionError);
				$.cookie("sessionTimedOut",'false');
			}
		}
		else 
		{
			if(localStorage.sessionTimedOut == 'true'){
				alert(resources.sessionError);
				localStorage.sessionTimedOut = 'false';
			}
		}
	
	
	// scroll body to 0px on click
	$('.backtotop').click(function () {
		$('body,html').animate({
			scrollTop: 0
		},800);
		return false;
	});
	// Adding year dynamically in footer
	$(".footer_year").text( (new Date).getFullYear() + " - " + (parseInt((new Date).getFullYear())+1)  );
});



/******** Methods to display fee details on click of addCash fee link in Home and FAQS page ---START************/
function callAddCashResponse()
{
	if(addCashLinkResponse == null || addCashLinkResponse == "" || addCashLinkResponse == undefined)
	{
		var feeObj = new Object();
		feeObj.fundsIn = "true";
		var feeLinkObj = new Object();
		feeLinkObj.FeeLinkValueInputBean = feeObj;
		callService(methods.GetFeeLinkValue[0], methods.GetFeeLinkValue[1], feeLinkObj, addCashResponseSuccessHandler, addCashResponseFailureHandler);
	}
	else
	{
		addCashResponseSuccessHandler(addCashLinkResponse);
	}
}

var addCashResponseSuccessHandler = function(response){
	$('#preview').hide();
	addCashLinkResponse = response;
	if(response.transactionSuccess == true)
	{
		if(feeFlag == 0)
			$('#fee_tooltip2').removeClass('displaynone');
		else
			$('#feeTooltipFaq').removeClass('displaynone');
		var addFeeDetails = '';
		addFeeDetails = '<ul class="historyGrid"><li class="thead"><div>Amount</div><div>Fee</div></li><li class="trow"><div>$0.00 - $200.00 USD</div><div>$'+ (parseFloat(response.feeForTwoHundred).toFixed(2)) +' USD</div></li><li class="trow altrow"><div>$200.01 - $500.00 USD</div> <div>$'+ (parseFloat(response.feeForFiveHundred).toFixed(2)) +' USD</div></li></ul><p>There is a limit to how much cash can be added to a PayPal account via MoneyGram:  </p><ul class="historyGrid" id="all_elements"><li class="thead"><div>Transaction Limit</div><div>Time</div></li><li class="trow element"><div>$500 USD</div><div>Per calendar month</div></li></ul>';
		$('#addCashFee').html(addFeeDetails);

	}
	else
	{
		alert(response.errorMessage);
	}
};

var addCashResponseFailureHandler = function(){
	alert(resources.errorMsg);
};
/******** Methods to display fee details on click of addCash fee link in Home and FAQS page ---END************/

/******** Methods to display fee details on click of Withdraw Cash fee link in Home and FAQS page ---START************/
function callWithdrawCashResponse()
{
	if(withdrawLinkResponse == null || withdrawLinkResponse == "" || withdrawLinkResponse == undefined)
	{
		var feeObj = new Object();
		feeObj.fundsIn = "false";
		var feeLinkObj = new Object();
		feeLinkObj.FeeLinkValueInputBean = feeObj;
		callService(methods.GetFeeLinkValue[0], methods.GetFeeLinkValue[1], feeLinkObj, withdrawResponseSuccessHandler, withdrawResponseFailureHandler);
	}
	else
	{
		withdrawResponseSuccessHandler(withdrawLinkResponse);
	}
}

var withdrawResponseSuccessHandler = function(response){
	$('#preview').hide();
	withdrawLinkResponse = response;
	if(response.transactionSuccess == true)
	{
		if(feeFlag == 0)
			$('#fee_tooltip').removeClass('displaynone');
		else
			$('#feeTooltip2Faq').removeClass('displaynone');
		var withdrawFeeDetails = '';
		withdrawFeeDetails = '<ul class="historyGrid"><li class="thead"> <div>Withdrawal Amount</div><div>Fee Amount</div></li><li class="trow"><div>$0.00 - $200.00 USD</div><div>$'+ (parseFloat(response.feeForTwoHundred).toFixed(2)) +' USD</div></li></ul><p>There is a limit to how much cash can be withdrawn:</p><ul class="historyGrid" id="all_elements"><li class="thead"><div>Transaction Limit</div><div>Time</div></li><li class="trow"><div>$200 USD</div><div>Per day</div></li><li class="trow altrow"><div>$500 USD</div><div>Per month</div></li></ul>';
		$('#withdrawCashFee').html(withdrawFeeDetails);
	}
	else 
	{
		alert(response.errorMessage);
	}
};

var withdrawResponseFailureHandler = function(){
	alert(resources.errorMsg);
};
/******** Methods to display fee details on click of Withdraw Cash fee link in Home and FAQS page ---END************/

 /* code for getting lightbox for locations start*/
function openLocation(){
	$("#light").html('<iframe src="https://hosted.where2getit.com/moneygram/en.html" id="location_iframe"></iframe>');
	document.body.style.overflow="hidden";
 	$.fancybox({
    	 autoDimensions: false,
    	 'width'             : "90%",
         'height'            : "75%",
    	 content: $('#location_iframe').clone(),
    	 'onClosed' : function(){
						   document.body.style.overflow="visible";
    	 				}
    });
}

function openAddLocation(){
	$("#light").html('<iframe src="http://hosted.where2stageit.com/moneygram/en.html" id="location_iframe"></iframe>');
	document.body.style.overflow="hidden";
 	$.fancybox({
    	 autoDimensions: false,
    	 'width'             : "90%",
         'height'            : "75%",
    	 content: $('#location_iframe').clone(),
    	 'onClosed' : function(){
						   document.body.style.overflow="visible";
    	 				}
    });
}

function logout()
{
		if(isIE){
			$.removeCookie("userLogin");
			$.removeCookie("addCashActive");
			$.removeCookie("withdrawCashActive");
			$.removeCookie("faqId");
			$.removeCookie("withdrawId");
			$.removeCookie("loginResponse");
			$.removeCookie("referenceNum");
			$.removeCookie("sessionDate");
       		$.cookie("logoutClicked", "true");
			if(sessionTimedOut == 'yes'){
				$.cookie("sessionTimedOut", "true");
			}else{
				$.cookie("sessionTimedOut", "false");
			}
			window.location.href = "home.html";
        }
       	else {
			localStorage.clear();
	       	localStorage.setItem("logoutClicked", "true");
			if(sessionTimedOut == 'yes'){
				localStorage.setItem("sessionTimedOut", "true");
			}else{
				localStorage.setItem("sessionTimedOut", "false");
			}
			window.location.href = "home.html";
       	}
}