
var initialPrice='';
var feeLinkFlag = false;
var withdrawAmt;
var feeAmt = '';
var totalAmt = '';
var availableAmt = '';
var sessionId ='';
var withdrawfeeFlag = false;
var stateSelect = resources.selectState;
$(document).ready(function() {
	$("#receiveAmount").val("");
	var previousValues;
	if($.browser.chrome){
		previousValues = localStorage.getItem("withdrawPageDetails");
	}
	else{
		previousValues = $.cookie("withdrawPageDetails"); 
	}
	
	if(previousValues == "" || previousValues == undefined || previousValues == null)
	{
		callWithdrawCashResponse();
		var getLimit = new Object();
		getLimit.emailID = "vbalki@ebay.com";
		var getLimitObj = new Object();
		getLimitObj.UserLimitInputBean = getLimit;
		callService(methods.GetUserLimits[0], methods.GetUserLimits[1], getLimitObj, getLimitSuccessHandler, getLimitFailureHandler);
		callService(methods.CodeTable[0], methods.CodeTable[1], "" , locationSuccessHandler, locationFailureHandler);
	}
	else
	{
		callWithdrawCashResponse();
		var getLimit = new Object();
		getLimit.emailID = "vbalki@ebay.com";
		var getLimitObj = new Object();
		getLimitObj.UserLimitInputBean = getLimit;
		callService(methods.GetUserLimits[0], methods.GetUserLimits[1], getLimitObj, getLimitSuccessHandler, getLimitFailureHandler);
		callService(methods.CodeTable[0], methods.CodeTable[1], "" , locationSuccessHandler, locationFailureHandler);
		var populateValues = previousValues.split(",");
		$("#receiveAmount").val(populateValues[0]);
		$("#pickup_location option:selected").html(populateValues[1]);
		$("#fee_value").html(populateValues[2]);
		$("#totalAmount").html(populateValues[3]);
		$("#clearBtn").removeAttr("disabled").removeClass("disbutton");
		
	}
	$("#fee_withdrawCash").click(function() {
		withdrawfeeFlag = true;
		callWithdrawCashResponse();
		$('#fee_tooltip_withdrawCash').slideDown("slow");
	});
	
	$("#fancybox-close_withdrawCash").click(function() {
		withdrawfeeFlag = false;
		$('#fee_tooltip_withdrawCash').hide("slow");
	});
	
	
	
	$("#receiveAmount").focusin(function() {
		var rAmt = $("#receiveAmount").val();
		var feeAmount = parseFloat(withdrawLinkResponse.feeForTwoHundred);
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
			if(numberLength != null || numberLength != "")
			{
				$("#clearBtn").removeAttr("disabled").removeClass("disbutton");
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
	if(response.transactionSuccess == false)
	{
		availableAmt = response.currencyType.amount;
		alert(resources.errorMsg);
	}
	else
	{
		$("#avail_amt").html(parseFloat(response.currencyType.amount).toFixed(2) + " " + response.currencyType.code);
		availableAmt = response.currencyType.amount;
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
	var feeAmount = parseFloat(withdrawLinkResponse.feeForTwoHundred);
	var receiveAmount = $("#receiveAmount").val();
		 initialPrice=receiveAmount;
		 document.getElementById('receiveAmount').value = parseFloat(receiveAmount).toFixed(2);	
		 //$("#pickup_location").focus();
		// var feeAmount = parseFloat(withdrawLinkResponse.feeForTwoHundred);
  	if (receiveAmount<=0 || isNaN(receiveAmount)) {
  		$("#amountError").html("<sup>*</sup>"+resources.validAmt);
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
	else{
		$("#amountError").hide();
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
	if($.browser.chrome){
			localStorage.setItem("sessionID", sessionId);
		}
		else {
			$.cookie("sessionID", sessionId);
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
	var locationsDropdown = '';
	locationsDropdown += '<option value="'+resources.selectState+'">'+resources.selectState+'</option>';
	for(var i=0;i<response.length;i++){
		locationsDropdown += '<option>' + response[i] + '</option>';
	}
	$("#pickup_location").append(locationsDropdown);
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
		return false;
	}
	else
	{
		$("#pickupError").hide();
	}
	if(isNaN($("#receiveAmount").val()) || $("#receiveAmount").val() == ""){
		$("#amountError").html("<sup>*</sup>"+resources.validAmt);
		return false;
	}
	else
	{
		$("#amountError").hide();
	}
	if(totalAmt > availableAmt)
	{
		alert("Total to withdraw from Balance " +totalAmt+ " USD should not exceed Amount Available to Withdraw "+ parseFloat(availableAmt).toFixed(2) + " USD");
		return false;
	}
	var feeValue = $("#fee_value").html();
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
			$("#fee_value").html("");
			$("#receiveAmount").val("");
			$("#totalAmount").html("");
			alert(feeResponse.errorMessage);
			return false;
		}
		else{
			$("#fee_value").html("");
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

function removeErrorMsg()
{
	$("#pickupError").hide();
}

/**** method called on review success *****/	
var commitSuccessHandler = function(response){
	$("#preview").hide();
	ddValue = $("#pickup_location option:selected").html();
	if(response.transactionSuccess == true)
	{
		var reviewDetails=new Array();
		reviewDetails.push(resources.user,resources.country,ddValue,resources.availableTime,totalAmt,feeAmt,$("#receiveAmount").val());
		var pageDetails = new Array();
		pageDetails.push($("#receiveAmount").val(), ddValue, $("#fee_value").html(), $("#totalAmount").html());
		if($.browser.chrome){
				localStorage.setItem("withdrawPageDetails",pageDetails);
				localStorage.setItem("commitResponse",response);
				localStorage.reviewValues = reviewDetails;
			}
			else {
				$.cookie("withdrawPageDetails", pageDetails);
				$.cookie("commitResponse", response);
				$.cookie("reviewValues", reviewDetails);
			}
		window.location.href = "review.html";
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
}