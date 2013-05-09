var addCashLinkResponse;
var withdrawLinkResponse;
var feeLimitResponse;
var timer;
var userLoggedIn;
var sessionTimedOut;
$.browser.chrome = /chrome/.test(navigator.userAgent.toLowerCase());
$(document).ready(function(){
	if($.browser.chrome)
		{
			userLoggedIn = localStorage.getItem("userLogin");
		}
		else 
		{
			userLoggedIn = $.cookie("userLogin"); 
		}
		if(userLoggedIn == "yes")
		{
			callTimer();
			$('*').live('click',function(){
				clearTimeout(timer);
				callTimer();
				});
			$('body').live('keydown',function(){
				clearTimeout(timer);
				callTimer();
				});
			$(window).live('scroll',function(){
				clearTimeout(timer);
				callTimer();
				});
		}
	// Following snippet for showing alert in case of session timeout
	if($.browser.chrome)
		{
			if(localStorage.sessionTimedOut == 'true'){
				alert("Your session has expired. Please try again");
			}
		}
		else 
		{
			if($.cookie("sessionTimedOut") == 'true'){
				alert("Your session has expired. Please try again");
			}
		}
});

function callTimer()
{
	timer = setTimeout(function(){
		sessionTimedOut = 'yes'
	logout();
	},1800000);
}

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
	document.body.style.overflow="visible";
	$('#preview').hide();
	addCashLinkResponse = response;
	if(response.transactionSuccess == true)
	{
		$('#fee_tooltip').removeClass('displaynone');
		var addFeeDetails = '';
		addFeeDetails = '<ul class="tablegrid"><li class="thead"><div>Amount</div><div>Fee</div></li><li class="trow"><div>$0.00 - $200.00 USD</div><div>$'+ (parseFloat(response.feeForTwoHundred).toFixed(2)) +' USD</div></li><li class="trow altrow"><div>$200.01 - $500.00 USD</div> <div>$'+ (parseFloat(response.feeForFiveHundred).toFixed(2)) +' USD</div></li></ul><p>There is a limit to how much cash can be added to a PayPal account via MoneyGram:  </p><ul class="historyGrid" id="all_elements"><li class="thead"><div>Transaction Limit</div><div>Time</div></li><li class="trow element"><div>$500 USD</div><div>Per calendar month</div></li></ul>';
		$('#addCashFee').html(addFeeDetails);

	}
	else
	{
		alert(response.errorMessage);
	}
};

var addCashResponseFailureHandler = function(response){
	$('#fee_tooltip').addClass('displaynone');
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
	document.body.style.overflow="visible";
	$('#preview').hide();
	withdrawLinkResponse = response;
	if(response.transactionSuccess == true)
	{
		if(withdrawfeeFlag)
		{
			$('#fee_tooltip_withdrawCash').removeClass('displaynone');
		}
		else
		{
			$('#fee_tooltip_withdrawCash').addClass('displaynone');
		}
		var withdrawFeeDetails = '';
		withdrawFeeDetails = '<ul class="tablegrid"><li class="thead"> <div>Withdrawal Amount</div><div>Fee Amount</div></li><li class="trow"><div>$0.00 - $200.00 USD</div><div>$'+ (parseFloat(response.feeForTwoHundred).toFixed(2)) +' USD</div></li></ul><p>There is a limit to how much cash can be withdrawn:</p><ul class="historyGrid" id="all_elements"><li class="thead"><div>Transaction Limit</div><div>Time</div></li><li class="trow"><div>$200 USD</div><div>Per day</div></li><li class="trow altrow"><div>$500 USD</div><div>Per month</div></li></ul>';
		$('#withdrawCashFee').html(withdrawFeeDetails);
	}
	else 
	{
		alert(response.errorMessage);
	}
};

var withdrawResponseFailureHandler = function(response){
	$('#fee_tooltip_withdrawCash').addClass('displaynone');
	alert(resources.errorMsg);
};
/******** Methods to display fee details on click of Withdraw Cash fee link in Home and FAQS page ---END************/

/***** Method to populate feeLink response in page (in withdraw_cash_authenticated.html) ***/
function callFeeLimitResponse()
{
	if(feeLimitResponse == null || feeLimitResponse == "" || feeLimitResponse == undefined)
	{
		var feeObj = new Object();
		feeObj.fundsIn = "false";
		var feeLinkObj = new Object();
		feeLinkObj.FeeLinkValueInputBean = feeObj;
		callService(methods.GetFeeLinkValue[0], methods.GetFeeLinkValue[1], feeLinkObj, feeLimitSuccessHandler, feeLimitFailureHandler);
	}
	else
	{
		feeLimitSuccessHandler(feeLimitResponse);
	}
}

var feeLimitSuccessHandler = function(response){
	document.body.style.overflow="visible";
	$('#preview').hide();
	feeLimitResponse = response;
	if(response.transactionSuccess == true)
	{
		$("#fee_tooltip_limitFee").removeClass('displaynone');
		var withdrawDetails = '';
		withdrawDetails = '<ul class="tablegrid" id="addCashFee"><li class="thead"><div>Amount</div><div>Fee</div></li><li class="trow"><div>$0.00 - $200.00 USD</div><div>$'+ (parseFloat(response.feeForTwoHundred).toFixed(2)) +' USD</div></li><li class="trow altrow"><div>$200.01 - $500.00 USD</div> <div>$'+ (parseFloat(response.feeForFiveHundred).toFixed(2)) +' USD</div></li></ul><p> There is a limit to how much cash can with withdrawn: </p><ul class="historyGrid"><li class="thead"><div>Transaction Limit</div><div>Time</div></li><li class="trow"><div>$200 USD</div><div>Per day</div></li><li class="trow altrow"><div>$500 USD</div><div>Per month</div></li></ul><p> Note:  The above amounts include fees so you can only receive $195.05 cash.</p>';
		$('#limitFee').html(withdrawDetails);
	}
	else
	{
		alert(response.errorMessage);
	}
};

var feeLimitFailureHandler = function(response){
	$("#fee_tooltip_limitFee").addClass('displaynone');
	alert(resources.errorMsg);
};

function logout()
{
		clearTimeout(timer);
		$.browser.chrome = /chrome/.test(navigator.userAgent.toLowerCase());
		if($.browser.chrome){
			localStorage.clear();
	       	localStorage.setItem("logoutClicked", "true");
			if(sessionTimedOut == 'yes'){
				localStorage.setItem("sessionTimedOut", "true");
			}
			window.location.href = "home.html";
        }
       	else {
			$.removeCookie("userLogin");
			$.removeCookie("addCashActive");
			$.removeCookie("withdrawCashActive");
			$.removeCookie("faqId");
			$.removeCookie("withdrawId");
			$.removeCookie("loginResponse");
			$.removeCookie("referenceNum");
       		$.cookie("logoutClicked", "true");
			if(sessionTimedOut == 'yes'){
				$.cookie("sessionTimedOut", "true");
			}
			window.location.href = "home.html";
       	}
}