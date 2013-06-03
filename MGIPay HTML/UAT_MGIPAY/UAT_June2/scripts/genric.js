var addCashLinkResponse;
var withdrawLinkResponse;
var userLoggedIn;
var sessionTimedOut;
var sessionTime;
var keyStr = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=";
var isIE = /*@cc_on!@*/false; 
$(document).ready(function(){
	
	if(isIE)
		{
			userLoggedIn = decode64($.cookie("userLogin")); 
			sessionTime = decode64($.cookie("sessionDate")); 
		}
		else 
		{
			userLoggedIn = decode64(localStorage.getItem("userLogin"));
			sessionTime = decode64(localStorage.getItem("sessionDate"));
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
			if(decode64($.cookie("sessionTimedOut")) == 'true'){
				alert(resources.sessionError);
				var sessTime = encode64('false');
				$.cookie("sessionTimedOut",sessTime);
			}
		}
		else 
		{
			if(decode64(localStorage.sessionTimedOut) == 'true'){
				alert(resources.sessionError);
				var sessTime = encode64('false');
				localStorage.sessionTimedOut = sessTime;
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
	$(".footer_year").text( (new Date).getFullYear()  );
});

//encryption
function encode64(input) {
	if(input == "" || input == null || input == undefined)
	{
		return input;
	}
	else
	{
    		input = escape(input);
    		var output = "";
    		var chr1, chr2, chr3 = "";
    		var enc1, enc2, enc3, enc4 = "";
    		var i = 0;
    		do {
    	    		chr1 = input.charCodeAt(i++);
    	    		chr2 = input.charCodeAt(i++);
    	    		chr3 = input.charCodeAt(i++);
    	    		enc1 = chr1 >> 2;
    	    		enc2 = ((chr1 & 3) << 4) | (chr2 >> 4);
    	    		enc3 = ((chr2 & 15) << 2) | (chr3 >> 6);
    	    		enc4 = chr3 & 63;
    	    		if (isNaN(chr2)) {
    	    	    		enc3 = enc4 = 64;
    	    		} else if (isNaN(chr3)) {
    	    	    		enc4 = 64;
    	    		}
    	    		output = output +
    	    		keyStr.charAt(enc1) +
    	    		keyStr.charAt(enc2) +
    	    		keyStr.charAt(enc3) +
    	    		keyStr.charAt(enc4);
    	    		chr1 = chr2 = chr3 = "";
    	    		enc1 = enc2 = enc3 = enc4 = "";
    		} while (i < input.length);
    		return output;
	}
}

//decryption
function decode64(input) {
	if(input == "" || input == null || input == undefined)
	{
		return input;
	}
	else
	{
    	var output = "";
    	var chr1, chr2, chr3 = "";
    	var enc1, enc2, enc3, enc4 = "";
    	var i = 0;
    	// remove all characters that are not A-Z, a-z, 0-9, +, /, or =
    	var base64test = /[^A-Za-z0-9\+\/\=]/g;
    	if (base64test.exec(input)) {
    	    	alert("There were invalid base64 characters in the input text.\n" +
    	    	    	    	"Valid base64 characters are A-Z, a-z, 0-9, '+', '/',and '='\n" +
    	    	"Expect errors in decoding.");
    	}
    	input = input.replace(/[^A-Za-z0-9\+\/\=]/g, "");
    	do {
    	    	enc1 = keyStr.indexOf(input.charAt(i++));
    	    	enc2 = keyStr.indexOf(input.charAt(i++));
    	    	enc3 = keyStr.indexOf(input.charAt(i++));
    	    	enc4 = keyStr.indexOf(input.charAt(i++));
    	    	chr1 = (enc1 << 2) | (enc2 >> 4);
    	    	chr2 = ((enc2 & 15) << 4) | (enc3 >> 2);
    	    	chr3 = ((enc3 & 3) << 6) | enc4;
    	    	output = output + String.fromCharCode(chr1);
    	    	if (enc3 != 64) {
    	    	    	output = output + String.fromCharCode(chr2);
    	    	}
    	    	if (enc4 != 64) {
    	    	    	output = output + String.fromCharCode(chr3);
    	    	}
    	    	chr1 = chr2 = chr3 = "";
    	    	enc1 = enc2 = enc3 = enc4 = "";
    	} while (i < input.length);
    	return  unescape(output);
	}
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
		var loggedout;
		var sessiontrue;
		var sessionfalse;
		if(isIE){
			$.removeCookie("userLogin");
			$.removeCookie("addCashActive");
			$.removeCookie("withdrawCashActive");
			$.removeCookie("faqId");
			$.removeCookie("withdrawId");
			$.removeCookie("loginResponse");
			$.removeCookie("referenceNum");
			$.removeCookie("sessionDate");
			loggedout = encode64("true");
       		$.cookie("logoutClicked", loggedout);
			if(sessionTimedOut == 'yes'){
				sessiontrue = encode64("true");
				$.cookie("sessionTimedOut", sessiontrue);
			}else{
				sessionfalse = encode64("false");
				$.cookie("sessionTimedOut", sessionfalse);
			}
			window.location.href = "home.html";
        }
       	else {
			localStorage.clear();
			loggedout = encode64("true");
	       	localStorage.setItem("logoutClicked", loggedout);
			if(sessionTimedOut == 'yes'){
				sessiontrue = encode64("true");
				localStorage.setItem("sessionTimedOut", sessiontrue);
			}else{
				sessionfalse = encode64("false");
				localStorage.setItem("sessionTimedOut", sessionfalse);
			}
			window.location.href = "home.html";
       	}
}
