/**
 * @author Prasanna
 */


var historyValues;

$(document).ready(function(){
	var withdrawHisDetails;
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