
var initialPrice='';
var feeLinkFlag = false;
var withdrawAmt;
var feeAmt = '';
var totalAmt = '';
var availableAmt = 0;
var sessionId ='';
var withdrawfeeFlag = false;
var loginResponse = "";
var flag;
var dailyLimitValue;
var feeLimitFlag = false;
var feeResponse = '';
var stateSelect = resources.selectState;
var reviewFlag;
var previousValues;
var isIE = /*@cc_on!@*/false; 

$(document).ready(function() {
	
	if(isIE){
		loginResponse = $.cookie("loginResponse");
		reviewFlag = $.cookie("reviewFlag"); 
		$.cookie("withdrawValues",""); 
	}
	else{
		loginResponse = localStorage.loginResponse;
		reviewFlag = localStorage.getItem("reviewFlag");
		localStorage.setItem("withdrawValues","");
	}
	if(reviewFlag == "true")
	{
		if(isIE){
			$.cookie("reviewValues",""); 
			$.cookie("reviewFlag","false"); 
		}
		else
		{
			localStorage.setItem("reviewValues","");
			localStorage.setItem("reviewFlag","false");
		}
		
	}else
	{
		if(isIE){
			previousValues = $.cookie("reviewValues"); 
		}
		else
		{
			previousValues = localStorage.getItem("reviewValues");
		}
	}
	if(loginResponse == "" || loginResponse == undefined || loginResponse == null)
	{
		
	}
	else
	{
		loginResponse = JSON.parse(loginResponse);
		callFeeLimitResponse();
		var getLimit = new Object();
		getLimit.emailID = loginResponse.email;
		getLimit.phoneNumber = loginResponse.phone_number;
		var getLimitObj = new Object();
		getLimitObj.UserLimitInputBean = getLimit;
		callService(methods.GetUserLimits[0], methods.GetUserLimits[1], getLimitObj, getLimitSuccessHandler, getLimitFailureHandler);
		callService(methods.CodeTable[0], methods.CodeTable[1], "" , locationSuccessHandler, locationFailureHandler);
		if(previousValues == "" || previousValues == null || previousValues == undefined) 
		{
		}else
		{
			var populateValues = previousValues.split(",");
			$("#receiveAmount").val(populateValues[6]);
			$("#pickup_location option:selected").html(populateValues[2]);
			$("#fee_value").html(populateValues[5]);
			$("#totalAmount").html(populateValues[4]);
			$("#clearBtn").removeAttr("disabled").removeClass("disbutton");
			currencyfocusout();
		}
		
	}
	$("#fee_limitFee").click(function() {
		feeLimitFlag = true;
		callFeeLimitResponse();
		$('#fee_tooltip_limitFee').slideDown("slow");
	});
	
	$("#fancybox-close_limitFee").click(function() {
		feeLimitFlag = false;
		$('#fee_tooltip_limitFee').hide("slow");
	});
	
	
	
	
	$("#receiveAmount").focusin(function() {
		var rAmt = $("#receiveAmount").val();
		var feeAmount = parseFloat(feeLimitResponse.feeForTwoHundred);
		if(rAmt == "Max:")
		{
			$("#receiveAmount").val("");
		}
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
			var numberLength = $(this).val().toString().length;
						var value = $(this).val();
			if(numberLength != null || numberLength != "")
			{
				$("#clearBtn").removeAttr("disabled").removeClass("disbutton");
			}
			else
			{
				$("#clearBtn").attr("disabled", "disabled").addClass("disbutton");
			}
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

var getLimitSuccessHandler = function(response){
	$("#preview").hide();
	if(response.transactionSuccess == true)
	{
		$("#avail_amt").html(parseFloat(response.currencyType.amount).toFixed(2) + " " + response.currencyType.code);
		availableAmt = response.currencyType.amount;
	}
	else
	{
		availableAmt = response.currencyType.amount;
		alert(resources.errorMsg);
	}
}
	
var getLimitFailureHandler = function(response){
	$("#preview").hide();
		if(flag == true)
		{
		}
		else
		{
			alert(resources.errorMsg);
			flag = true;
		}
};


/*** method to call getFee service call *****/
function currencyfocusout()
{
	var feeAmount = parseFloat(feeLimitResponse.feeForTwoHundred);
	var receiveAmount = $("#receiveAmount").val();
	var stateSelect = resources.selectState;
		 initialPrice=receiveAmount;
		 document.getElementById('receiveAmount').value = parseFloat(receiveAmount).toFixed(2);	
		totalAmt =  parseFloat(receiveAmount)+parseFloat(feeAmount);
	if($.trim($('#receiveAmount').val()) == "" || $('#receiveAmount').val() == "")
	{
		$("#amountError").show();
		$("#amountError").html("<sup>*</sup>"+resources.validAmt);
	}
  	else if (receiveAmount<=0 || isNaN(receiveAmount)) {
  		$("#amountError").show();
		$("#amountError").html("<sup>*</sup>"+resources.validAmt);
  		document.getElementById('receiveAmount').value='';
		initialPrice='';
		$("#fee_value").val("USD");
		$("#totalAmount").html("");
		return false;
	}
	else if($("#pickup_location option:selected").html() == stateSelect || $("#pickup_location option:selected").html() == undefined)
	{
		document.getElementById('receiveAmount').value = parseFloat(receiveAmount).toFixed(2);
		$("#pickupError").html("<sup>*</sup>"+resources.validLocation);
		$("#pickupError").show();
		return false;
	} 
	else{
		$("#amountError").hide();
		$("#pickupError").hide();
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

/**** method to get fee and total amount *****/
var feeSuccessHandler = function(response){
	feeResponse = response;
	$("#preview").hide();
	feeAmt = numberToCurrency(response.feeAmount);
	totalAmt = numberToCurrency(response.totalAmount);
	sessionId = response.mgiTransactionSessionID;
	if(isIE){
			$.cookie("sessionID", sessionId);
		}
		else {
			localStorage.setItem("sessionID", sessionId);
		}
	$("#fee_value").html(feeAmt+ " USD");
	$("#totalAmount").html(totalAmt + " USD");
}
	
var feeFailureHandler = function(response){
		$("#preview").hide();
		alert(resources.errorMsg);
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


/**** method to get pick up locations *****/	
var locationSuccessHandler = function(response){
	$("#preview").hide();
	var senderValue = loginResponse.address.senderState;
	var locationsDropdown = '';
	locationsDropdown += '<option value="'+resources.selectState+'">'+resources.selectState+'</option>';
	for(var i=0;i<response.length;i++){
		locationsDropdown += '<option value="'+response[i]+'">' + response[i] + '</option>';
		if(response[i] == loginResponse.address.senderState)
		{
			senderValue = response[i];
			$("#clearBtn").removeAttr("disabled").removeClass("disbutton");
		}
	}
	
	$("#pickup_location").append(locationsDropdown);
	var x=document.getElementById("pickup_location");
	setSelectedValue(x,senderValue);
}

function setSelectedValue(selectObj, valueToSet) {
    for (var i = 0; i < selectObj.options.length; i++) {
        if (selectObj.options[i].text== valueToSet) {
            selectObj.options[i].selected = true;
            return;
        }
    }
}
	
var locationFailureHandler = function(response){
	$("#preview").hide();
	if(flag == true)
	{
	}
	else
	{
		alert(resources.errorMsg);
		flag = true;
	}
}

/**** method called on review success *****/	

/*** method to call sendValidations service call *****/	
function reviewTransaction()
{
	if($("#pickup_location option:selected").html() == stateSelect || $("#pickup_location option:selected").html() == undefined){
		$("#pickupError").html("<sup>*</sup>"+resources.validLocation);
		$("#pickupError").show();
		return false;
	}
	else
	{
		$("#pickupError").hide();
	}
	if(isNaN($("#receiveAmount").val()) || $("#receiveAmount").val() == "" || $.trim($('#receiveAmount').val()) == ""){
		$("#amountError").html("<sup>*</sup>"+resources.validAmt);
		$("#amountError").show();
		return false;
	}
	else
	{
		$("#amountError").hide();
	}
	if(totalAmt > availableAmt && availableAmt >= 200)
	{
		alert("Withdraw amount including fee is : " +totalAmt+ " USD. You can only withdraw 200 dollars including fee, per transaction. ");
		return false;
	}
	else if(totalAmt > availableAmt && availableAmt < 200){
			alert("Withdraw amount including fee is : " +totalAmt+ " USD. You can only withdraw "+ availableAmt + " dollars including fee.");
		return false;
	}
	var feeValue = feeAmt;
	var session = new Object();
	session.amount = withdrawAmt;
	session.feeAmount = feeValue;
	session.destinationCountry = "USA";
	session.destinationState = $("#pickup_location option:selected").val();
	session.receiveCurrency = "USD";
	session.senderFirstName = loginResponse.given_name;
	session.senderLastName = loginResponse.family_name;
	session.senderAddress = loginResponse.address.street_address;
	session.senderCity = loginResponse.address.locality;
	session.senderState = loginResponse.address.region;
	session.senderZipCode = loginResponse.address.postal_code;
	session.senderCountry = "USA";
	session.senderHomePhone = loginResponse.phone_number;
	session.receiverFirstName = loginResponse.given_name;
	session.receiverLastName = loginResponse.family_name;
	session.sendCurrency = "USD";
	session.consumerId = "0";
	session.mgiTransactionSessionID = sessionId;
	session.senderEmail = loginResponse.email;
	var sessionObj = new Object();
	sessionObj.SendValidationInputBean = session;
	if(feeResponse.transactionSuccess == false){
		if(totalAmt == 0)
		{
			$("#fee_value").val("USD");
			$("#receiveAmount").val("");
			$("#totalAmount").html("");
			alert("Withdraw amount including fee is : " +totalAmt+ " USD. You can only withdraw 200 dollars including fee.");
			return false;
		}
		if(totalAmt > 200){
			$("#fee_value").val("USD");
			$("#receiveAmount").val("");
			$("#totalAmount").html("");
			alert("Withdraw amount including fee is : " +totalAmt+ " USD. You can only withdraw 200 dollars including fee.");
			return false;
		}
		else{
			$("#fee_value").val("USD");
			$("#receiveAmount").val("");
			$("#totalAmount").html("");
			alert("Withdraw amount including fee is : " +totalAmt+ " USD. You can only withdraw "+ availableAmt + " dollars including fee.");
			return false;
		}	
	}
	else
	{
		callService(methods.SendValidation[0], methods.SendValidation[1], sessionObj , commitSuccessHandler, commitFailureHandler);
	}
}		

function removeErrorMsg()
{
	$("#receiveAmount").focus();
	$("#pickupError").hide();
	$("#clearBtn").removeAttr("disabled").removeClass("disbutton");
}

/**** method called on review success *****/	
var commitSuccessHandler = function(response){
	$("#preview").hide();
	ddValue = $("#pickup_location option:selected").html();
	if(response.transactionSuccess == true)
	{
		var username = loginResponse.given_name  + " " + loginResponse.family_name;
		var reviewDetails=new Array();
		reviewDetails.push(username,resources.country,ddValue,resources.availableTime,totalAmt,feeAmt,$("#receiveAmount").val());
		if(isIE){
				$.cookie("commitResponse", response);
				$.cookie("reviewValues", reviewDetails);
				$.cookie("withdrawValues", reviewDetails);
			}
			else {
				localStorage.setItem("commitResponse",response);
				localStorage.reviewValues = reviewDetails;
				localStorage.withdrawValues = reviewDetails;
			}
		window.location.href = "withdraw-money-review.html";
	}
	else
	{
		alert(response.errorMessage);
		
	}
}
	
var commitFailureHandler = function(response){
		$("#receiveAmount").val("");
		$("#totalAmount").html("");
		$("#preview").hide();
		alert(resources.errorMsg);
		
}	

function clearFields()
{
	$("#receiveAmount").val("");
	$("#pickup_location option:first").attr('selected','selected');
	$("#totalAmount").html("");
	$("#fee_value").html("");
	$("#clearBtn").attr("disabled", "disabled").addClass("disbutton");
}