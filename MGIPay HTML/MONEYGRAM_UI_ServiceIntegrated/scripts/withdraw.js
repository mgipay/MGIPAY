$(document).ready(function() {
   callService(methods.CodeTable[0], methods.CodeTable[1], "", "","" , locationSuccessHandler, locationFailureHandler);
});
var withdrawAmt;
var feeAmt = '';
var totalAmt = '';
var sessionId = '';
var feeSuccessHandler = function(response){
	//alert(JSON.stringify(response));
	 feeAmt = numberToCurrency(response.feeInfo[0].sendAmounts.totalSendFees);
	 totalAmt = numberToCurrency(response.feeInfo[0].sendAmounts.totalAmountToCollect);
	 sessionId = response.mgiTransactionSessionID;
		$("#fee_value").val(feeAmt);
		$("#totalAmount").html(totalAmt);
	}
	
var feeFailureHandler = function(response){
		alert(JSON.stringify(response));
	}
	
var locationSuccessHandler = function(response){
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
	
var commitSuccessHandler = function(response){
		//alert(JSON.stringify(response));
		var ddValue = $("#pickup_location option:selected").html();
		$(".enteramount").css("display","none");
		$("#pickup").html(ddValue);
		$("#receive_amt").html(response.sendAmounts.sendAmount);
		$("#final_fee").html(response.sendAmounts.totalSendFees);
		$("#review_total").html(response.sendAmounts.review_total);
		$(".review_content").css("display","block");
	}
	
var commitFailureHandler = function(response){
		alert(response);
	}	
	
var withdrawSuccessHandler = function(response){
		alert(JSON.stringify(response));
		$("#ref_num").html(response.referenceNumber);
		$(".review_content").css("display","none");
		$("#complete").css("display","block");
	}		
	
var withdrawFailureHandler = function(response){
		alert("error"+JSON.stringify(response));
	}		

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

function currencyfocusout()
{
	
//var recieveAmount = document.getElementById('recieveAmount').value;
var recieveAmount = $("#recieveAmount").val();
//alert(parseFloat(recieveAmount).toFixed(2));
  if (recieveAmount<0 || isNaN(recieveAmount)) {
  			alert("Please enter valid Receive Amount");
  			document.getElementById('recieveAmount').value='';
			return false;
		} 
		else if(recieveAmount>0)
		{ 
            initialPrice=recieveAmount;
			document.getElementById('recieveAmount').value = parseFloat(recieveAmount).toFixed(2);	
		    /*if (recieveAmount.indexOf('.') == -1) {
				 	
			           document.getElementById('recieveAmount').value  = recieveAmount+ '.00';
					   
		           } 
		            else {
			              var formatReceiveAmount = recieveAmount.split('.')[1];
			                   if (formatReceiveAmount.length == 1) 
			                   {
				                 document.getElementById('recieveAmount').value= recieveAmount + '0';
			                    } 
			                  else if (formatReceiveAmount.length == 0) 
			                  {
				                document.getElementById('recieveAmount').value= recieveAmount + '00';
			                    }
								
		               }*/
					  withdrawAmt = $("#recieveAmount").val();
					  var sendFee = new Object();
						  sendFee.amount = withdrawAmt;
					  var sendFeeObj = new Object();
					      sendFeeObj.FeeLookupInputBean = sendFee;	 
					callService(methods.GetFees[0], methods.GetFees[1], "", "",sendFeeObj , feeSuccessHandler, feeFailureHandler);	   

			
             }    
}
function currencyfocusin()
	{
		
		document.getElementById('recieveAmount').type ="text"; 
		
		if(initialPrice!='')
		{document.getElementById('recieveAmount').value=initialPrice;
		}
		
			
	}
		
function reviewTransaction()
{
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
	 
	 /*var sessionObj = new Object();
	 sessionObj.CommitTransactionInputBean = session;*/
	 
	 var sessionObj = new Object();
	 sessionObj.SendValidationInputBean = session;
	 //alert(JSON.stringify(sessionObj));
	callService(methods.SendValidation[0], methods.SendValidation[1], "", "",sessionObj , commitSuccessHandler, commitFailureHandler);
	//{"SendValidationInputBean":
//{"amount":100,"feeAmount":12.00,"destinationCountry":"USA","destinationState":"MN","receiveCurrency":"USD","senderFirstName":"SF","senderLastName":"SL","senderAddress":"1351 H AVE S","senderCity":"CHNMPLS","senderState":"MN","senderZipCode":"55416","senderCountry":"USA","senderHomePhone":"9522320253","receiverFirstName":"N R F","receiverLastName":"N R L","sendCurrency":"USD","mgiTransactionSessionID":"9708729E1572561362572017411"}}
}		

function completeTransaction(){
		//$(".review_content").css("display","none");
		var commitSessionId = new Object();
		commitSessionId.mgiTransactionSessionID = sessionId;
		var commitObj = new Object();
	    commitObj.CommitTransactionInputBean = commitSessionId;
		callService(methods.CommitTransaction[0], methods.CommitTransaction[1], "", "",commitObj , withdrawSuccessHandler, withdrawFailureHandler);
	}