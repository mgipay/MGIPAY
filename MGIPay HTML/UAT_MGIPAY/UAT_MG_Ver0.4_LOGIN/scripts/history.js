var sortFlag = true;
var historyResponse;
var currentPage = 1;

$(document).ready(function() {
	var historyObj = new Object();
	historyObj.customerEmailId = "abc@mgimail.com";
	var historyPostObj = new Object();
	historyPostObj.HistroyLookupInputBean = historyObj;
	callService(methods.GetHistoryDetails[0], methods.GetHistoryDetails[1], historyPostObj, historySuccessHandler, historyFailureHandler);
	/*** Navigate to login page  start***/
	$('.paypal_login').live('click', function(event) {  
		$('.black_overlay').css('display','block');
		document.body.style.overflow="hidden";
		var sheight = (screen.height) * 0.6;
        var swidth = (screen.width) * 0.6;  
		event.preventDefault();
       	$.popupWindow('https://www.paypal.com/in/cgi-bin/webscr?cmd=_login-submit', {
        height:sheight,
        width:sheight,
        toolbar:'yes',
        onUnload: function() {
		document.body.style.overflow="visible";
        $('.black_overlay').css('display','none');
       	}
       	});});
	/*** Navigate to login page  end***/
});

function dateSorting()
{
	if(sortFlag)
	{
		$("#sortDate").addClass("sortup").removeClass('sortdown');
		$('#all_elements .trow').sort(sortAscending).appendTo('#all_elements');
		sortFlag = false;
	}
	else 
	{
		$("#sortDate").addClass("sortdown").removeClass('sortup');
		$('#all_elements .trow').sort(sortDescending).appendTo('#all_elements');
		sortFlag = true;
	}
}
	

var historySuccessHandler = function(response){
	historyResponse = response;
	$('#preview').hide();
	var historyDetails = '';
	var pageLength;
	var endPage;
	historyDetails += ' <li class="thead"><div id="dateSort"><a onClick="dateSorting()" class="sortdown" id="sortDate">Date</a></div><div>Sender/Receiver</div><div>Total to Withdraw </div><div>Fee</div><div>Status/Reference Number</div></li>';
	var className = '';
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
					historyDetails += '<li class="trow '+ className +'"><div class="year">'+ historyResponse.historyDetailsList[j].transactionDate +'</div><div>'+ historyResponse.historyDetailsList[j].customerName +'</div><div class="txtright">'+ (parseFloat(historyResponse.historyDetailsList[j].transactionAmount).toFixed(2)) +' USD</div><div class="txtright">'+ (parseFloat(historyResponse.historyDetailsList[j].transactionFee).toFixed(2)) +' USD</div><div><span id="collected">' + historyResponse.historyDetailsList[j].transactionStatus + ':</span> '+ historyResponse.historyDetailsList[j].mgiReferenceNumber +'</div></li>';
				}
				$('#all_elements').append(historyDetails);
		}
	}
	else
	{
		$('.thead').addClass('displaynone').removeClass('displayblock');
		alert(response.errorMessage);
	}
};

var historyFailureHandler = function(){
	$(".staticcontainer p:eq(0)").addClass("displaynone").removeClass("displayblock");
	$(".staticcontainer p:eq(1)").addClass("displaynone").removeClass("displayblock");
	alert(resources.errorMsg);
};

function sortDescending(a, b) {
	var date_first  = $(a).find(".year").text();
	date_first = date_first.split('/');
	date_first = new Date(date_first[2], date_first[0] -1, date_first[1]);
	var date_second  = $(b).find(".year").text();
	date_second= date_second.split('/');
	date_second= new Date(date_second[2], date_second[0] -1, date_second[1]);
	
	return date_first < date_second ? 1 : -1;
};
	
function sortAscending(a, b) {
	var date_first  = $(a).find(".year").text();
	date_first = date_first.split('/');
	date_first = new Date(date_first[2], date_first[0] -1, date_first[1]);
	var date_second  = $(b).find(".year").text();
	date_second= date_second.split('/');
	date_second= new Date(date_second[2], date_second[0] -1, date_second[1]);
	
	return date_first > date_second ? 1 : -1;
};
