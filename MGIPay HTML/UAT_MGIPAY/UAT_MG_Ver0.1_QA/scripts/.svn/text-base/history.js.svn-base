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

			var sheight = (screen.height) * 0.6;
        	var swidth = (screen.width) * 0.6;  
			event.preventDefault();
          	$.popupWindow('https://www.paypal.com/in/cgi-bin/webscr?cmd=_login-submit', {
          	height:sheight,
          	width:sheight,
          	toolbar:'yes',
            onUnload: function() {
            $('.black_overlay').css('display','none');
            }
          });});
		/*** Navigate to login page  end***/
});

var historySuccessHandler = function(response){
	$('#preview').hide();
	var historyDetails = '';
	var historyHeader = '';
	var className = '';
	var historyData = '';
	historyHeader = '<li class="thead"><div id="dateSort"><a href="#">Date</a></div><div>Sender/Reciever</div><div>Total to Withdraw </div><div>Fee</div><div>Status/Reference Number</div></li>';
	$('#all_elements').append(historyHeader);
	for(var i=0;i<response.historyDetailsList.length;i++)
	{
		if((i%2) == 0)
			className = "";
		else 
			className = "altrow";
			
		historyDetails = '<li class="trow '+ className +'"><div class="year">'+ response.historyDetailsList[i].transactionDate +'</div><div>'+ response.historyDetailsList[i].customerName +'</div><div>'+ response.historyDetailsList[i].transactionAmount +'</div><div>'+ response.historyDetailsList[i].transactionFee +'</div><div><span>Collected:</span>'+ response.historyDetailsList[i].mgiReferenceNumber +'</div></li>';
	$('#all_elements').append(historyDetails);
	}
	};

var historyFailureHandler = function(response){
	alert(response);
	};

function sortDescending(a, b) {
	var date1  = $(a).find(".year").text();
	date1 = date1.split('/');
	date1 = new Date(date1[2], date1[1] -1, date1[0]);
	var date2  = $(b).find(".year").text();
	date2= date2.split('/');
	date2= new Date(date2[2], date2[1] -1, date2[0]);
	
	return date1 < date2 ? 1 : -1;
};
	
function sortAscending(a, b) {
	var date1  = $(a).find(".year").text();
	date1 = date1.split('/');
	date1 = new Date(date1[2], date1[1] -1, date1[0]);
	var date2  = $(b).find(".year").text();
	date2= date2.split('/');
	date2= new Date(date2[2], date2[1] -1, date2[0]);
	
	return date1 > date2 ? 1 : -1;
};