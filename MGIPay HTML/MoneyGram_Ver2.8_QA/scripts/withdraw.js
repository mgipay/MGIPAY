var initialPrice = '';
var feeResponse = '';
var withdrawAmt;
var feeAmt = '';
var totalAmt = '';
var availableAmt = '';
var sessionId = '';
var ddValue = '';
var feeLinkFlag = false;
var sendValidationResponse = '';
var feeLinkResponse;
$(document).ready(function() {
	$("#fee_value").val("USD");
	$("#receiveAmount").val("USD");
	var url = document.URL;
	var index = url.lastIndexOf("code=");
	var code = url.substr(index + 5, url.length);
	var getUserData = new Object();
	getUserData.code = code;
	var getUserDataObj = new Object();
	getUserDataObj.UserDataInputBean = getUserData;
	//callService(methods.GetUserData[0], methods.GetUserData[1], getUserDataObj, getUserDataSuccessHandler, getUserDataFailureHandler);
	//getUserDataSuccessHandler();
	
	callFeeLinkResponse();
	$("#fee_withdraw").click(function() {
		feeLinkFlag = true;
		callFeeLinkResponse();
		$('#feetooltip_withdraw').slideDown(20);
	});
	$("#fancyboxclose_withdraw").click(function() {
		feeLinkFlag = false;
		$('#feetooltip_withdraw').hide(20);
	});  

	$('#chk_box').click(function(){
		if($('#chk_box').is(':checked')){
   			$("#withdraw_button").removeAttr("disabled");
			$("#withdraw_button").css("opacity","1");
		}
		else{
			$("#withdraw_button").attr("disabled","disabled");
			$("#withdraw_button").css("opacity","0.5")
		}
	});
	$('#termsAndConditionsForWidthdraw').click(function(){
		$("#TAC_iframe").html('<iframe src="terms_and_conditions.html" id="termsAndCondition_iframe"></iframe>');
		document.body.style.overflow="hidden";
		$.fancybox({
    	   autoDimensions: false,
		   'width'             : "90%",
           'height'           : "75%",
    	   content: $('#termsAndCondition_iframe').clone(),
		   'onClosed' : function(){
						   document.body.style.overflow="visible";
    	 				}
		});
   });
   $("#back_enteramt").click(function(){
		$(".enteramount").css("display","block");
		$(".reviewcontainer").css("display","none");
		$("#review").css("display","none");
		$(".step1").css("display","block");
	});	
	var getLimit = new Object();
	getLimit.emailID = "vbalki@ebay.com";
	var getLimitObj = new Object();
	getLimitObj.UserLimitInputBean = getLimit;
    callService(methods.GetUserLimits[0], methods.GetUserLimits[1], getLimitObj, getLimitSuccessHandler, getLimitFailureHandler);
	callService(methods.CodeTable[0], methods.CodeTable[1], "" , locationSuccessHandler, locationFailureHandler);
   
   /*** receive amount text box validations ****/
	$("#receiveAmount").focusin(function() {
		var rAmt = $("#receiveAmount").val();
		var feeAmount = parseFloat(feeLinkResponse.feeForTwoHundred);
		if(isNaN(rAmt))
		{
			$("#receiveAmount").val("");
		}
		var flag=0;
		document.getElementById('receiveAmount').type ="text"; 
		if(initialPrice !='' && rAmt>feeAmount){
			document.getElementById('receiveAmount').value=initialPrice;
		} 
		$("#receiveAmount").keypress(function(e) {
			var numberLength = $(this).val().length;
			var value = $(this).val();
			var indexValue = value.indexOf('.');
			if((e.keyCode != 46 || e.charCode != 46) && indexValue == "-1"){
				document.getElementById('receiveAmount').maxLength = 3;
			}
			if ((e.keyCode == 46 || e.charCode == 46) && indexValue == "-1"){
				document.getElementById('receiveAmount').maxLength = numberLength+3;
			}
			if( indexValue != "-1" )
			{
				var formatReceiveAmount = value.split('.')[0];
				if(e.keyCode == 46 || e.charCode == 46){
					document.getElementById('receiveAmount').maxLength = numberLength;
				}
				else if(e.keyCode != 46 ||  e.charCode != 46)
				{
					switch(formatReceiveAmount.length)
					{
						case 1:	document.getElementById('receiveAmount').maxLength = 4; break;
						case 2: document.getElementById('receiveAmount').maxLength = 5; break;
						case 3:	document.getElementById('receiveAmount').maxLength = 6; break;
					}
				}
			}
		});
	});
});
  /* Focusin method end*/	
var username;  
var locationInfo;
var userLogin;
 /**** method to get user data ****/ 	
var getUserDataSuccessHandler = function(response){
	alert(JSON.stringify(response));
	/*response = {"family_name":"FundsInI","language":"en_US","verified":"true","locale":"en_US","zoneinfo":"America/Los_Angeles","name":"MGI FundsInI","given_name":"MGI","user_id":"https://www.paypal.com/webapps/auth/identity/user/vQX4dhaIPGX_T4yol2oWfsosMANmYLE4yoYMjfVKVMI"};
	if($.browser.chrome)
		localStorage.setItem("userLogin", "yes");
	else 
		$.cookie("userLogin", "yes"); 

	username = response.given_name;
	locationInfo = response.zoneinfo.split("/");
	if(locationInfo[0] == "America")
	{
		$("#location").addClass("displayblock").removeClass("displaynone");
	}
	else
	{
		$("#location").addClass("displaynone").removeClass("displayblock");
	}*/

}
var getUserDataFailureHandler = function(response){
	alert(resources.errorMsg);
};

/**** method to get fee and total amount *****/
var feeSuccessHandler = function(response){
	document.body.style.overflow="visible";
	feeResponse = response;
	$("#preview").hide();
	feeAmt = numberToCurrency(response.feeAmount);
	totalAmt = numberToCurrency(response.totalAmount);
	sessionId = response.mgiTransactionSessionID;
	$("#fee_value").val(feeAmt);
	$("#totalAmount").html("("+totalAmt + ") USD");
}
	
var feeFailureHandler = function(response){
		$("#preview").hide();
}
	
/**** method to get pick up locations *****/	
var locationSuccessHandler = function(response){
	document.body.style.overflow="visible";
	$("#preview").hide();
	var locationsDropdown = '';
	locationsDropdown += '<option value="'+resources.selectState+'">'+resources.selectState+'</option>';
	for(var i=0;i<response.length;i++){
		locationsDropdown += '<option>' + response[i] + '</option>';
	}
	$("#pickup_location").append(locationsDropdown);
}
	
var locationFailureHandler = function(response){
	$("#preview").hide();
	alert(resources.errorMsg);
}

/**** method called on review success *****/	
var commitSuccessHandler = function(response){
	document.body.style.overflow="visible";
	$("#preview").hide();
	$(".tabDisable").removeAttr("tabindex");
	sendValidationResponse = response;
	$(".step1").css("display","none");
	$("#review").css("display","block");
	$(".step3").css("display","none");
	ddValue = $("#pickup_location option:selected").html();
	$(".sender_name").html(resources.user);
	$(".state").html(resources.country);
	$(".availability").html(resources.availableTime);
	$(".enteramount").css("display","none");
	$(".pickup").html(ddValue);
	$(".receive_amt").html($("#receiveAmount").val() + " USD");
	$(".final_fee").html(feeAmt + " USD");
	$(".review_total").html(totalAmt + " USD");
	$(".reviewcontainer").css("display","block");
}
	
var commitFailureHandler = function(response){
		$("#fee_value").val("USD");
		$("#receiveAmount").val("");
		$("#totalAmount").html("");
		$("#preview").hide();
}	
	
/**** method called on withdrawCash success *****/	
var withdrawSuccessHandler = function(response){
	document.body.style.overflow="visible";
	$(".tabDisable").removeAttr("tabindex");
	$("#preview").hide();
	$(".step1").css("display","none");
	$("#review").css("display","none");
	$(".step3").css("display","block");
	$(".sender_name").html("("+resources.user+")");
	$(".state").html("("+resources.country+")");
	$(".availability").html(resources.availableTime);
	$(".pickup").html("("+ddValue+")");
	$(".receive_amt").html("(" + $("#receiveAmount").val() + ") USD");
	$(".final_fee").html("(" +feeAmt + ") USD");
	$(".review_total").html("(" + totalAmt + ") USD");
	$(".ref_num").html(response.referenceNumber);
	if($.browser.chrome)
		localStorage.setItem("referenceNum", response.referenceNumber); 
	else 
		$.cookie("referenceNum", response.referenceNumber); 
	$(".reviewcontainer").css("display","none");
	$("#complete").css("display","block");
}		
	
var withdrawFailureHandler = function(response){
	$("#preview").hide();
}		

/***** method to get user account limit *****/
var getLimitSuccessHandler = function(response){
	document.body.style.overflow="visible";
	$("#preview").hide();
	$(".tabDisable").removeAttr("tabindex");
	if(response.transactionSuccess == false)
	{
		availableAmt = response.currencyType.amount;
		alert(resources.errorMsg);
	}
	else
	{
		$("#avail_amt").html("("+parseFloat(response.currencyType.amount).toFixed(2) + ") " + response.currencyType.code);
		availableAmt = response.currencyType.amount;
	}
}
	
var getLimitFailureHandler = function(response){
	$("#preview").hide();
}
	
/***** method to convert numeric format to currency format *****/		
function numberToCurrency(number) {
	var thousandsSeparator = ',';
	var decimalSymbol = '.';
	var sign;

	number = stripDollarSign(number);
	number = isNaN(number) || number == '' || number == null ? 0.00 : number;
	var numberStr = parseFloat(number).toFixed(2).toString();
	if (numberStr.indexOf('-') != -1) {
		sign = '-';
		numberStr = numberStr.substr(1);
	}
	var numberFormatted = new Array(numberStr.slice(-3));
	// this returns the decimal and cents
	numberStr = numberStr.substring(0, numberStr.length - 3);
	// this removes the decimal and cents
	/*
	 * Why is there an `unshift()` function, but no `shift()`?
	 * Also, a `pop()` function would be handy here.
	 */
	while (numberStr.length > 3) {
		numberFormatted.unshift(numberStr.slice(-3));
		// this prepends the last three digits to `numberFormatted`
		numberFormatted.unshift(thousandsSeparator);
		// this prepends the thousandsSeparator to `numberFormatted`
		numberStr = numberStr.substring(0, numberStr.length - 3);
		// this removes the last three digits
	}
	numberFormatted.unshift(numberStr);
	// there are less than three digits in numberStr, so prepend them
	
		//numberFormatted.unshift(currencySymbol);
		// prepend the currencySymbol
	if (sign == "-")
		numberFormatted.unshift("-");
		
	return changeDecimalSymbol(numberFormatted.join(''), decimalSymbol);
	// put it all together
}

function stripDollarSign(s) {
	if ( typeof s == 'string') {
		s = s.replace(/\$/g, '');
	}
	return s;
}

function changeDecimalSymbol(s, symbol) {
	if ( typeof s == 'string') {
		s = s.replace(/\./g, symbol);
	}
	return s;
}

/*** method to call getFee service call *****/
function callTextBox()
{
	$("#receiveAmount").focus();
}

function currencyfocusout()
{
	var feeAmount = parseFloat(feeLinkResponse.feeForTwoHundred);
	var receiveAmount = $("#receiveAmount").val();
	var stateSelect = resources.selectState;
  	if (receiveAmount<=0 || isNaN(receiveAmount)) {
  		alert(resources.validAmt);
  		document.getElementById('receiveAmount').value='';
		initialPrice='';
		$("#fee_value").val("USD");
		$("#totalAmount").html("");
		return false;
	} 
	else if(receiveAmount>0 && receiveAmount<feeAmount)
	{ 
		alert("Receive amount should not be less than fee amount : " + feeAmount.toFixed(2) + " USD");
		$("#fee_value").val("USD");
		$("#receiveAmount").val("");
		$("#totalAmount").html("");
		return false;
	}
	else if($("#pickup_location option:selected").html() == stateSelect || $("#pickup_location option:selected").html() == undefined)
	{
		document.getElementById('receiveAmount').value = parseFloat(receiveAmount).toFixed(2);
		alert(resources.validLocation);
		return false;
	} 
	else{
		initialPrice=receiveAmount;
		document.getElementById('receiveAmount').value = parseFloat(receiveAmount).toFixed(2);	
		withdrawAmt = $("#receiveAmount").val();
		var sendFee = new Object();
		sendFee.amount = withdrawAmt;
		var sendFeeObj = new Object();
		sendFeeObj.FeeLookupInputBean = sendFee;	 
		callService(methods.GetFees[0], methods.GetFees[1], sendFeeObj , feeSuccessHandler, feeFailureHandler);	   
	}  
}

/*** method to call sendValidations service call *****/	
function reviewTransaction()
{
	$('#chk_box').removeAttr('checked');
	$("#withdraw_button").attr("disabled","disabled");
	$("#withdraw_button").css("opacity","0.5")
	var stateSelect = resources.selectState;
	if($("#location").attr('class') == 'displayblock')
	{
		if($("#pickup_location option:selected").html() == stateSelect || $("#pickup_location option:selected").html() == undefined){
			alert(resources.validLocation);
			return false;
		}
	}
	if(isNaN($("#receiveAmount").val()) || $("#receiveAmount").val() == ""){
		alert(resources.validAmt);
		return false;
	}
	if(totalAmt > availableAmt)
	{
		alert("Total to withdraw from Balance " +totalAmt+ " USD should not exceed Amount Available to Withdraw "+ parseFloat(availableAmt).toFixed(2) + " USD");
		return false;
	}
	var feeValue = $("#fee_value").val();
	var session = new Object();
	session.amount = withdrawAmt;
	session.feeAmount = feeValue;
	session.destinationCountry = "USA";
	session.destinationState = "MN";
	session.receiveCurrency = "USD";
	session.senderFirstName = "SF";
	session.senderLastName = "SL";
	session.senderAddress = "1351 H AVE S";
	session.senderCity = "CHNMPLS";
	session.senderState = "MN";
	session.senderZipCode = "55416";
	session.senderCountry = "USA";
	session.senderHomePhone = "9522320253";
	session.receiverFirstName = "N R F";
	session.receiverLastName = "N R L";
	session.sendCurrency = "USD";
	session.mgiTransactionSessionID = sessionId;
	var sessionObj = new Object();
	sessionObj.SendValidationInputBean = session;
	if(feeResponse.transactionSuccess == false){
		if(totalAmt > 200){
			$("#fee_value").val("USD");
			$("#receiveAmount").val("");
			$("#totalAmount").html("");
			alert(feeResponse.errorMessage);
			return false;
		}
		else{
			$("#fee_value").val("USD");
			$("#receiveAmount").val("");
			$("#totalAmount").html("");
			alert(feeResponse.errorMessage); 
			return false;
		}	
	}
	else
	{
		callService(methods.SendValidation[0], methods.SendValidation[1], sessionObj , commitSuccessHandler, commitFailureHandler);
	}
}		

/*** method to call CommitTransaction service call *****/
function completeTransaction(){
	var commitSessionId = new Object();
	commitSessionId.mgiTransactionSessionID = sessionId;
	commitSessionId.customerEmail = "vbalki@ebay.com";
	commitSessionId.customerName = "VIJAY BALAKRISHNAN";
	commitSessionId.customerPhoneNumber = "6057100363";
	commitSessionId.paypalTransactionID = "58965687";
	commitSessionId.transactionAmount = withdrawAmt;
	commitSessionId.transactionFee = $("#fee_value").val();
	var commitObj = new Object();
	commitObj.CommitTransactionInputBean = commitSessionId;
	callService(methods.CommitTransaction[0], methods.CommitTransaction[1], commitObj , withdrawSuccessHandler, withdrawFailureHandler);
}
	
	 /* code for getting lightbox for locations start*/
 function mapToLocations(){
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

/*** method to call payFromPaypal service call *****/
var payFromPaypalSuccessHandler = function(response){
	alert(JSON.stringify(response));
};

var payFromPaypalFailureHandler = function(response){
	alert(resources.errorMsg);
};

/***** Method to populate feeLink response in page (in withdraw_cash_authenticated.html) ***/
function callFeeLinkResponse()
{
	if(feeLinkResponse == null || feeLinkResponse == "" || feeLinkResponse == undefined)
	{
		var feeObj = new Object();
		feeObj.fundsIn = "false";
		var feeLinkObj = new Object();
		feeLinkObj.feeLinkValueInputBean = feeObj;
		callService(methods.GetFeeLinkValue[0], methods.GetFeeLinkValue[1], feeLinkObj, feeWithdrawSuccessHandler, feeWithdrawFailureHandler);
	}
	else
	{
		feeWithdrawSuccessHandler(feeLinkResponse);
	}
}

var feeWithdrawSuccessHandler = function(response){
	document.body.style.overflow="visible";
	$('#preview').hide();
	feeLinkResponse = response;
	if(response.transactionSuccess == true)
	{
		if(feeLinkFlag)
		{
			$("#feetooltip_withdraw").removeClass('displaynone');
		}
		var withdrawDetails = '';
		withdrawDetails = '<ul class="historyGrid" id="addCashFee"><li class="thead"><div>Amount</div><div>Fee</div></li><li class="trow"><div>$0.00 - $200.00 USD</div><div>$'+ (parseFloat(response.feeForTwoHundred).toFixed(2)) +' USD</div></li><li class="trow altrow"><div>$200.01 - $500.00 USD</div> <div>$'+ (parseFloat(response.feeForFiveHundred).toFixed(2)) +' USD</div></li></ul><p> There is a limit to how much cash can with withdrawn: </p><ul class="historyGrid"><li class="thead"><div>Transaction Limit</div><div>Time</div></li><li class="trow"><div>$200 USD</div><div>Per day</div></li><li class="trow altrow"><div>$500 USD</div><div>Per month</div></li></ul><p> Note:  The above amounts include fees so you can only receive $195.05 cash.</p>';
		$('#withdrawFee').html(withdrawDetails);
	}
	else
	{
		alert(response.errorMessage);
	}
};

var feeWithdrawFailureHandler = function(response){
	$("#feetooltip_withdraw").addClass('displaynone');
	alert(resources.errorMsg);
};
