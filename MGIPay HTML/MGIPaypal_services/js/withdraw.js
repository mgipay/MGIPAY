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
		$("#fee").html(feeAmt);
		$("#totalAmount").html(totalAmt);
	}
	
var feeFailureHandler = function(response){
		alert(JSON.stringify(response));
	}
	
var locationSuccessHandler = function(response){
		var locationsDropdown = '';
		for(var i=0;i<response.length;i++){
				locationsDropdown += '<option>' + response[i] + '</option>';
			}
			$(".pickup_location").append(locationsDropdown);
	}
	
var locationFailureHandler = function(response){
		alert(response);
	}
	
var commitSuccessHandler = function(response){
		alert("abc"+response);
	}
	
var commitFailureHandler = function(response){
		alert(response);
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
	
var recieveAmount = document.getElementById('recieveAmount').value;

  if (recieveAmount<0 || isNaN(recieveAmount)) {
  			alert("Please enter valid Receive Amount");
  			document.getElementById('recieveAmount').value='';
			return false;
		} 
		else if(recieveAmount>0)
		{ 
            initialPrice=recieveAmount;
						
		    if (recieveAmount.indexOf('.') == -1) {
				 	
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
								
		               }
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
	 var session = new Object();
	 session.mgiTransactionSessionID = sessionId;
	 var sessionObj = new Object();
	 sessionObj.CommitTransactionInputBean = session;
	callService(methods.CommitTransaction[0], methods.CommitTransaction[1], "", "",sessionObj , commitSuccessHandler, commitFailureHandler);
}			