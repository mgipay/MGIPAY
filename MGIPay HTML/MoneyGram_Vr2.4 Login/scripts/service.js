/* this file contains the implemenation of jquery/javascript ajax service calls */

function callService(methodName, requestType, sessionId, getMethodQueryParams, postMethodJsonObject, successHandler, errorHandler)
{
	if(navigator.onLine)
    {
		var postMethodJsonString = JSON.stringify(postMethodJsonObject);
		var serviceUrl = baseUrl + methodName;
		document.body.style.overflow="hidden";
		$("#receiveAmount").attr("tabindex","-1");
		$("#pickup_location").attr("tabindex","-1");
		$("#fee_value").attr("tabindex","-1");
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
					
				//errorHandler(jqXHR, errorType, exceptionObject);
			}
		});
	}
	else
	{
		alert(resources.errorMsg);
	}
}
