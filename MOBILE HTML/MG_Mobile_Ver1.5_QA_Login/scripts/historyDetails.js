$.browser.chrome = /chrome/.test(navigator.userAgent.toLowerCase());


var historyValues;

$(document).ready(function(){
	var withdrawHisDetails;
	if($.browser.chrome) {
		withdrawHisDetails = localStorage.getItem('withdrawHistory');
	} else {
		withdrawHisDetails = $.cookie("withdrawHistory");
	}
	withdrawHisDetails=localStorage.getItem('withdrawHistory');
	historyValues=withdrawHisDetails.split(',');
	displayDetails();
});

function displayDetails()
{
        $('#transactionDate').html(historyValues[0]);
        $('#SenderName').html(historyValues[1]);
        $('#toatalAmount').html('$'+parseFloat(historyValues[2]).toFixed(2)+' USD');
        $('#feeAmount').html('$'+parseFloat(historyValues[3]).toFixed(2)+' USD');
        $('#referenceNumber').html(historyValues[4]);
}