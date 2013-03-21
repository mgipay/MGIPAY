var initialPrice = '';
var feeResponse = '';
$(document).ready(function() {
	
	
	$("#fee_tooltip").hide();
				$("#fee").click(function() {
					$('#fee_tooltip').slideDown("slow");
				});
				$("#fancybox-close").click(function() {
					$('#fee_tooltip').hide("slow");
				});
	$('#chk_box').click(function(){
		if($('#chk_box').is(':checked')){
   			$("#withdraw_button").removeAttr("disabled");
			$("#withdraw_button").css("opacity","1")
		}
	});
	$('#termsAndConditionsForWidthdraw').click(function(){
	  $.fancybox({
    	   autoDimensions: false,
    	 'width'             : "60%",
          'height'           : "60%",
    	  content: $('#termsAndCondition_iframe').clone()


});

   });
    	
	var getLimit = new Object();
	getLimit.emailID = "vbalki@ebay.com";
	var getLimitObj = new Object();
	getLimitObj.UserLimitInputBean = getLimit;	
    callService(methods.GetUserLimits[0], methods.GetUserLimits[1], "", "", getLimitObj, getLimitSuccessHandler, getLimitFailureHandler);
	callService(methods.CodeTable[0], methods.CodeTable[1], "", "","" , locationSuccessHandler, locationFailureHandler);
	callService(methods.GetFeeLinkValue[0], methods.GetFeeLinkValue[1], "", "", null, withdrawFeeSuccessHandler, withdrawFeeFailureHandler);
   
   /*** receive amount text box validations ****/
$("#recieveAmount").focusin(function() {
	var rAmt = $("#recieveAmount").val();
	if(isNaN(rAmt)){
			$("#recieveAmount").val("");
		}
	var flag=0;
	document.getElementById('recieveAmount').type ="text"; 
	if(initialPrice !=''){
		document.getElementById('recieveAmount').value=initialPrice;
	} 
	$("#recieveAmount").keypress(function(e) {
	var numberLength = $(this).val().length;
	var value = $(this).val();
	var indexValue = value.indexOf('.');
	if((e.keyCode != 46 || e.charCode != 46) && indexValue == "-1"){
		document.getElementById('recieveAmount').maxLength = 3;
		}
	if ((e.keyCode == 46 || e.charCode == 46) && indexValue == "-1"){
		document.getElementById('recieveAmount').maxLength = numberLength+3;
		}
	if( indexValue != "-1" ){
		var formatReceiveAmount = value.split('.')[0];
		if(e.keyCode == 46 || e.charCode == 46){
			document.getElementById('recieveAmount').maxLength = numberLength;
		}
	else if(e.keyCode != 46 ||  e.charCode != 46){
		switch(formatReceiveAmount.length){
			case 1:	document.getElementById('recieveAmount').maxLength = 4; break;
			case 2: document.getElementById('recieveAmount').maxLength = 5; break;
			case 3:	document.getElementById('recieveAmount').maxLength = 6; break;
				}
			}
		}
	});
	});
});
  /* Focusin method end*/		

var withdrawAmt;
var feeAmt = '';
var totalAmt = '';
var sessionId = '';
var ddValue = '';
var sendValidationResponse = '';

var withdrawFeeSuccessHandler = function(response){
	$("#preview").hide();
	var feeDetails = '';
	feeDetails = '<li class="thead"><div>Amount</div><div>Fee</div></li><li class="trow"><div>$0.00 - $200.00 USD</div><div>$'+ response.feeForTwoHundred +' USD</div></li><li class="trow altrow"><div>$200.01 - $500.00 USD</div> <div>$'+ response.feeForFiveHundred +' USD</div></li><li> There is a limit to how much cash can with withdrawn: </li>';
	$('#feeWithdraw').append(feeDetails);
};
	
var withdrawFeeFailureHandler = function(response){
	alert(response);
};

/**** method to get fee and total amount *****/
var feeSuccessHandler = function(response){
	feeResponse = response;
	 $("#preview").hide();
	 feeAmt = numberToCurrency(response.feeAmount);
	 totalAmt = numberToCurrency(response.totalAmount);
	 sessionId = response.mgiTransactionSessionID;
		$("#fee_value").val(feeAmt);
		$("#totalAmount").html(totalAmt + " USD");
	}
	
var feeFailureHandler = function(response){
		$("#preview").hide();
		alert(JSON.stringify(response));
	}
	
/**** method to get pick up locations *****/	
var locationSuccessHandler = function(response){
	$("#preview").hide();
		var locationsDropdown = '';
		locationsDropdown += '<option value="Select your state">Select your state</option>';
		for(var i=0;i<response.length;i++){
				locationsDropdown += '<option>' + response[i] + '</option>';
			}
			$("#pickup_location").append(locationsDropdown);
	}
	
var locationFailureHandler = function(response){
		alert(response);
	}

/**** method called on review success *****/	
var commitSuccessHandler = function(response){
		$("#preview").hide();
		sendValidationResponse = response;
		$(".step1").css("display","none");
		$(".step2").css("display","block");
		$(".step3").css("display","none");
		ddValue = $("#pickup_location option:selected").html();
		$(".enteramount").css("display","none");
		$(".pickup").html(ddValue);
		$(".receive_amt").html("(" + $("#recieveAmount").val() + ") USD");
		$(".final_fee").html(feeAmt + " USD");
		$(".review_total").html("(" + totalAmt + ") USD");
		$(".reviewcontainer").css("display","block");
	}
	
var commitFailureHandler = function(response){
		$("#preview").hide();
		alert(response);
	}	
	
/**** method called on withdrawCash success *****/	
var withdrawSuccessHandler = function(response){
		$("#preview").hide();
		$(".step1").css("display","none");
		$(".step2").css("display","none");
		$(".step3").css("display","block");
		$(".pickup").html(ddValue);
		$(".receive_amt").html("(" + $("#recieveAmount").val() + ") USD");
		$(".final_fee").html(feeAmt + " USD");
		$(".review_total").html("(" + totalAmt + ") USD");
		$(".ref_num").html(response.referenceNumber);
		$(".reviewcontainer").css("display","none");
		$("#complete").css("display","block");
	}		
	
var withdrawFailureHandler = function(response){
		$("#preview").hide();
		alert("error"+JSON.stringify(response));
	}		

/***** method to get user account limit *****/
var getLimitSuccessHandler = function(response){
		$("#preview").hide();
		$("#avail_amt").html(parseFloat(response.currencyType.amount).toFixed(2) + " " + response.currencyType.code);
	}
	
var getLimitFailureHandler = function(response){
		$("#preview").hide();
		alert(JSON.stringify(response));
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
function currencyfocusout()
{
var recieveAmount = $("#recieveAmount").val();
  if (recieveAmount<0 || isNaN(recieveAmount)) {
  			alert("Please enter valid Receive Amount");
  			document.getElementById('recieveAmount').value='';
			return false;
		} 
		else if(recieveAmount>0)
		{ 
            initialPrice=recieveAmount;
            
			document.getElementById('recieveAmount').value = parseFloat(recieveAmount).toFixed(2);	
					  withdrawAmt = $("#recieveAmount").val();
					  var sendFee = new Object();
						  sendFee.amount = withdrawAmt;
					  var sendFeeObj = new Object();
					      sendFeeObj.FeeLookupInputBean = sendFee;	 
					callService(methods.GetFees[0], methods.GetFees[1], "", "",sendFeeObj , feeSuccessHandler, feeFailureHandler);	   
             }    
}

/*** method to call sendValidations service call *****/	
function reviewTransaction()
{
	if($("#pickup_location option:selected").html() == "Select your state" || $("#pickup_location option:selected").html() == undefined){
			alert("Please select Pick Up Location");
			return false;
		}
	else if($("#recieveAmount").val() == ""){
		alert("Please enter valid receive amount");
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
	callService(methods.SendValidation[0], methods.SendValidation[1], "", "",sessionObj , commitSuccessHandler, commitFailureHandler);
}		

/*** method to call CommitTransaction service call *****/
function completeTransaction(){
		var commitSessionId = new Object();
		commitSessionId.mgiTransactionSessionID = sessionId;
		var commitObj = new Object();
	    commitObj.CommitTransactionInputBean = commitSessionId;
		callService(methods.CommitTransaction[0], methods.CommitTransaction[1], "", "",commitObj , withdrawSuccessHandler, withdrawFailureHandler);
	}
	
	 /* code for getting lightbox for locations start*/
 function mapToLocations(){
 	
 	
 	          $.fancybox({
    	   autoDimensions: false,
    	 'width'             : "60%",
          'height'            : "60%",
    	  content: $('#location_iframe').clone(),
     	 
    });
   
}
