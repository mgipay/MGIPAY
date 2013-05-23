$.browser.chrome = /chrome/.test(navigator.userAgent.toLowerCase());


var historyValues;

$(document).ready(function(){
	var withdrawHisDetails;
	if($.browser.chrome) {
		withdrawHisDetails = localStorage.getItem('withdrawHistory');
	} else {
		withdrawHisDetails = $.cookie("withdrawHistory");
	}
	historyValues=withdrawHisDetails.split(',');
	displayDetails();
});

function displayDetails()
{
        $('#transactionDate').html(historyValues[0]);
        $('#SenderName').html(historyValues[1]);
		$('#country').html(historyValues[2]);
		$('#pickupLocation').html(historyValues[3]);
		$('#toatalAmount').html('$'+parseFloat(historyValues[4]).toFixed(2)+' USD');
        $('#feeAmount').html('$'+parseFloat(historyValues[5]).toFixed(2)+' USD');
        $('#receiveAmount').html('$'+parseFloat(historyValues[6]).toFixed(2)+' USD');
        $('#referenceNumber').html(historyValues[7]);
}