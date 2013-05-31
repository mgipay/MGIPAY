var isIE = /*@cc_on!@*/false; 


var historyValues;

$(document).ready(function(){
	var withdrawHisDetails;
	if(isIE) {
		withdrawHisDetails = $.cookie("withdrawHistory");
	} else {
		withdrawHisDetails = localStorage.getItem('withdrawHistory');
	}
	historyValues=withdrawHisDetails.split(',');
	displayDetails();
});

function displayDetails()
{
        $('#transactionDate').html(historyValues[0]);
        $('#SenderName').html(historyValues[1]);
		$('#country').html(historyValues[2]);
        $('#feeAmount').html('$'+parseFloat(historyValues[4]).toFixed(2)+' USD');
        $('#receiveAmount').html('$'+parseFloat(historyValues[3]).toFixed(2)+' USD');
		$('#totalAmount').html('$'+parseFloat(historyValues[5]).toFixed(2)+' USD');
        $('#referenceNumber').html(historyValues[6]);
}