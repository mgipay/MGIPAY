/* this file contains the implemenation of jquery/javascript ajax service calls */

function callService(methodName, requestType, sessionId, getMethodQueryParams, postMethodJsonObject, successHandler, errorHandler)
{
	if(navigator.onLine){	
		var postMethodJsonString = JSON.stringify(postMethodJsonObject);
		var serviceUrl = baseUrl + methodName;
		$("#preview").show();
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
				//alert(data);
				successHandler(data);
			},
			error : function(jqXHR, errorType, exceptionObject)
			{
				$("#preview").hide();
				alert("Service call failed");
				//errorHandler(jqXHR, errorType, exceptionObject);
			}
		});
	}
	else{
		alert("No network found, Please check your network settings.");
		return false;
	}
}
