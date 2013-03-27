// JavaScript Document
var sortFlag = true;
$(document).ready(function() {
	
	//{"HistroyLookupInputBean":{"customerEmailId":"abc@MgiMail.com"}}
	var historyObj = new Object();
	historyObj.customerEmailId = "abc@MgiMail.com";
	var historyPostObj = new Object();
	historyPostObj.HistroyLookupInputBean = historyObj;
	callService(methods.GetHistoryDetails[0], methods.GetHistoryDetails[1], "", "", historyPostObj, historySuccessHandler, historyFailureHandler);
	
	
	$("#dateSort").click(function(){
		if(sortFlag)
		{
			$('#all_elements .trow').sort(sortDescending).appendTo('#all_elements');
			sortFlag = false;
		}
		else 
		{
			$('#all_elements .trow').sort(sortAscending).appendTo('#all_elements');
			sortFlag = true;
		}
	});
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

var historySuccessHandler = function(response){
	$('#preview').hide();
	var historyDetails = '';
	var className = '';
	if(response.transactionSuccess == true)
	{
		$('.thead').removeClass('displaynone').addClass('displayblock');
		for(var i=0;i<response.historyDetailsList.length;i++)
		{
			if((i%2) == 0)
				className = "";
			else 
				className = "altrow";

			historyDetails = '<li class="trow '+ className +'"><div class="year">'+ response.historyDetailsList[i].transactionDate +'</div><div>'+ response.historyDetailsList[i].customerName +'</div><div>'+ response.historyDetailsList[i].transactionAmount +'</div><div>'+ response.historyDetailsList[i].transactionFee +'</div><div><span>Collected:</span>'+ response.historyDetailsList[i].mgiReferenceNumber +'</div></li>';
		$('#all_elements').append(historyDetails);
		}
	}
	else
	{
		$('.thead').addClass('displaynone').removeClass('displayblock');
		alert(response.errorMessage);
	}
	};

var historyFailureHandler = function(response){
	};

function sortDescending(a, b) {
	var date_first  = $(a).find(".year").text();
	date_first = date_first.split('/');
	date_first = new Date(date_first[2], date_first[1] -1, date_first[0]);
	var date_second  = $(b).find(".year").text();
	date_second= date_second.split('/');
	date_second= new Date(date_second[2], date_second[1] -1, date_second[0]);
	
	return date_first < date_second ? 1 : -1;
};
	
function sortAscending(a, b) {
	var date_first  = $(a).find(".year").text();
	date_first = date_first.split('/');
	date_first = new Date(date_first[2], date_first[1] -1, date_first[0]);
	var date_second  = $(b).find(".year").text();
	date_second= date_second.split('/');
	date_second= new Date(date_second[2], date_second[1] -1, date_second[0]);
	
	return date_first > date_second ? 1 : -1;
};