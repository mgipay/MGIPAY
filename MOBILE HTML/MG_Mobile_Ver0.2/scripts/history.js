var sortFlag = true;
var historyResponse;
var currentPage = 1;
var totalamount='';

var historyResponse;


$(document).ready(function() {
	var historyObj = new Object();
	historyObj.customerEmailId = "abc@MgiMail.com";
	var historyPostObj = new Object();
	historyPostObj.HistroyLookupInputBean = historyObj;
	historySuccessHandler();
	//callService(methods.GetHistoryDetails[0], methods.GetHistoryDetails[1], historyPostObj, historySuccessHandler, historyFailureHandler);
});


var historySuccessHandler = function(response){
	
		document.body.style.overflow="visible";
//;
 response = '{"historyDetailsList":[{"transactionDate":"19-09-2012","transactionID":987456321,"customerEmail":"abcdsdd@MgiMail.com","customerName":"AAAAAA","customerPhone":12346789,"paypalTransactionID":"456456456","mgiReferenceNumber":"987987987","transactionAmount":100,"transactionFee":12,"transactionStatus":"S"},{"transactionDate":"19-12-2013","transactionID":987456321,"customerEmail":"abc@MgiMail.com","customerName":"AAAAAA","customerPhone":12346789,"paypalTransactionID":"456456456","mgiReferenceNumber":"987987987","transactionAmount":100,"transactionFee":12,"transactionStatus":"S"},{"transactionDate":"10-02-2012","transactionID":987456321,"customerEmail":"abcdsdd@MgiMail.com","customerName":"turtu","customerPhone":12346789,"paypalTransactionID":"456456456","mgiReferenceNumber":"987987987","transactionAmount":100,"transactionFee":12,"transactionStatus":"S"},{"transactionDate":"01-03-2012","transactionID":987456321,"customerEmail":"abcdsdd@MgiMail.com","customerName":"fffff","customerPhone":12346789,"paypalTransactionID":"456456456","mgiReferenceNumber":"987987987","transactionAmount":100,"transactionFee":12,"transactionStatus":"S"}],"transactionSuccess":true}';
	 response=eval("("+response+")");
	
	 historyResponse = response;
		$('#preview').hide();
	var historyDetails = '';
	var pageLength;
	var endPage;
	// historyDetails += ' <li class="thead" '+ className +'><div> Recent History </div></li> ';
	$('#historyTable').append(historyDetails);
	var className = '';
	 historyDetails += ' <li class="thead" '+ className +'><div> Recent History </div></li> ';
	if(response.transactionSuccess == true)
	{
		
		if(response.historyDetailsList == undefined || response.historyDetailsList == null || response.historyDetailsList == "" || response.historyDetailsList.length == 0)
		{
			$(".staticcontainer p:eq(0)").addClass("displayblock").removeClass("displaynone");
			$('.thead').addClass('displaynone').removeClass('displayblock');
		}
		else
		{
			
			
			//$(".staticcontainer p:eq(1)").addClass("displayblock").removeClass("displaynone");
			//$('.thead').removeClass('displaynone').addClass('displayblock');
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
						
				//	historyDetails += '<li class="trow '+ className +'"><div class="year">'+ historyResponse.historyDetailsList[j].transactionDate +'</div><div>'+ historyResponse.historyDetailsList[j].customerName +'</div><div class="txtright">'+ (parseFloat(historyResponse.historyDetailsList[j].transactionAmount).toFixed(2)) +' USD</div><div class="txtright">'+ (parseFloat(historyResponse.historyDetailsList[j].transactionFee).toFixed(2)) +' USD</div><div><span id="collected">' + historyResponse.historyDetailsList[j].transactionStatus + ':</span> '+ historyResponse.historyDetailsList[j].mgiReferenceNumber +'</div></li>';
					historyDetails += '<li class="trow '+ className +'" onClick="openHistoryDetails(\''+j+'\')"><div class="year"><h2>'+ historyResponse.historyDetailsList[j].transactionDate +'</h2><h4>$'+ (parseFloat(totalamount).toFixed(2)) +' USD</h4></div><div class="amount"><h5>To: '+ historyResponse.historyDetailsList[j].customerName +' #'+ historyResponse.historyDetailsList[j].mgiReferenceNumber +'</h5><h1>Sent: $'+ (parseFloat(historyResponse.historyDetailsList[j].transactionAmount).toFixed(2)) +' USD</h1></div></li>';
					
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
	var details = historyResponse.historyDetailsList[index];
	var historyDetails=new Array();
	historyDetails.push(details.transactionDate,details.customerName,totalamount,details.transactionFee,details.mgiReferenceNumber);
	localStorage.setItem('withdrawHistory',historyDetails);
	window.location.href="history.html";
}
