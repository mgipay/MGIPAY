/* this file contains the implemenation of jquery/javascript ajax service calls */

function callService(methodName, requestType, sessionId, getMethodQueryParams, postMethodJsonObject, successHandler, errorHandler)
{
	var postMethodJsonString = JSON.stringify(postMethodJsonObject);
	var serviceUrl = baseUrl + methodName;
	document.body.style.overflow="hidden";
	$("#preview").show();
	$.support.cors = true;
	$.ajax(
	{
		url  : serviceUrl,
		data : postMethodJsonString,
		type : requestType,
		cache   : "false",
		crossDomain: true,
		contentType:"application/json",
		dataType:"json",
		success : function (data, successCode, jqXhr)
		{
			successHandler(data);
		},
		error : function(jqXHR, errorType, exceptionObject)
		{
			$("#preview").hide();
			document.body.style.overflow="visible";
			alert("An error has occurred while processing your request. If you continue to receive this error contact MoneyGram at 1-800-MONEYGRAM");
			//errorHandler(jqXHR, errorType, exceptionObject);
		}
	});
}
