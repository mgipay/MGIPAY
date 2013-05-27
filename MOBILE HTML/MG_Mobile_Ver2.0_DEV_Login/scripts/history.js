var sortFlag = true;
var historyResponse;
var currentPage = 1;
var totalamount;
var historyResponse;
var loginResponse = "";
$.browser.chrome = /chrome/.test(navigator.userAgent.toLowerCase());
$(document).ready(function() {
	if($.browser.chrome) {
		loginResponse = localStorage.loginResponse;
	} else {
		loginResponse = $.cookie("loginResponse");
	}
	loginResponse = JSON.parse(loginResponse);
	var historyObj = new Object();
	historyObj.customerEmailId = loginResponse.email;
	var historyPostObj = new Object();
	historyPostObj.HistroyLookupInputBean = historyObj;
	callService(methods.GetHistoryDetails[0], methods.GetHistoryDetails[1], historyPostObj, historySuccessHandler, historyFailureHandler);
});



var historySuccessHandler = function(response){
		document.body.style.overflow="visible";	
	 historyResponse = response;
		$('#preview').hide();
	var historyDetails = '';
	var pageLength;
	var endPage;
	
	var className = '';
	 historyDetails += ' <li class="thead"><div> Recent History </div></li> ';
	if(response.transactionSuccess == true)
	{
		
		if(response.historyDetailsList == undefined || response.historyDetailsList == null || response.historyDetailsList == "" || response.historyDetailsList.length == 0)
		{
			$(".staticcontainer p:eq(0)").addClass("displayblock").removeClass("displaynone");
			$('.thead').addClass('displaynone').removeClass('displayblock');
		}
		else
		{
			$(".staticcontainer p:eq(1)").addClass("displayblock").removeClass("displaynone");
			$('.thead').removeClass('displaynone').addClass('displayblock');
			var numberOfItems = response.historyDetailsList.length;
			var numberOfPages = Math.ceil(numberOfItems / 10);
            	endPage = currentPage * 10;
				if(numberOfItems <= endPage)
				{
					pageLength = numberOfItems;
				}
					else
				{
					pageLength = endPage;
				}
				for(var j=0;j<pageLength;j++)
				{
					if((j%2) == 0)
						className = "";
					else 
						className = "altrow";
						totalamount=historyResponse.historyDetailsList[j].transactionAmount+historyResponse.historyDetailsList[j].transactionFee;
					historyDetails += '<li class="trow '+ className +'" onClick="openHistoryDetails(\''+j+'\')"><div class="year"><h2>'+ historyResponse.historyDetailsList[j].transactionDate +'</h2><h4>To: '+ historyResponse.historyDetailsList[j].customerName +' #'+ historyResponse.historyDetailsList[j].mgiReferenceNumber +'</h4></div><div class="amount"><h5>$'+ (parseFloat(totalamount).toFixed(2)) +' USD</h5><h1>Sent: $'+ (parseFloat(historyResponse.historyDetailsList[j].transactionAmount).toFixed(2)) +' USD</h1></div></li>';
					
				}
				$('#historyTable').append(historyDetails);
				
		}
	}
	else
	{
		$('.thead').addClass('displaynone').removeClass('displayblock');
		alert(response.errorMessage);
	}
};

var historyFailureHandler = function(response){
	$(".staticcontainer p:eq(0)").addClass("displaynone").removeClass("displayblock");
	$(".staticcontainer p:eq(1)").addClass("displaynone").removeClass("displayblock");
	alert(resources.errorMsg);
};


function openHistoryDetails(index)
{
	var listValue = parseFloat(index)+1;
	$("#historyTable li:eq("+listValue+")").addClass('selectedrow');
	for(var i=0; i<11 ; i++)
	{
		if(i != listValue)
		$("#historyTable li:eq("+i+")").removeClass('selectedrow');
	}
	$("#historyTable li:eq("+listValue+")").addClass('selectedrow');
	var details = historyResponse.historyDetailsList[index];
	var amountWithdrawn = details.transactionAmount+details.transactionFee;
	var historyDetails=new Array();
	historyDetails.push(details.transactionDate,details.customerName,resources.country,details.transactionAmount,details.transactionFee,amountWithdrawn,details.mgiReferenceNumber);
	if($.browser.chrome) {
		localStorage.setItem('withdrawHistory',historyDetails);
	} else {
		$.cookie("withdrawHistory",historyDetails);
	}
	
	window.location.href="history.html";
}
