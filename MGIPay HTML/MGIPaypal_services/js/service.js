/* this file contains the implemenation of jquery/javascript ajax service calls */

function callService(methodName, requestType, sessionId, getMethodQueryParams, postMethodJsonObject, successHandler, errorHandler)
{	
	var postMethodJsonString = JSON.stringify(postMethodJsonObject);
	var serviceUrl = baseUrl + methodName;
	
	/*if(requestType == undefined || requestType == "GET")
	{
		serviceUrl += getMethodQueryParams;
		requestType = "GET";
	}*/
	
	$.ajax(
	{
		url : serviceUrl,
		data : postMethodJsonString,
		type : requestType,
		contentType:"application/json",
		dataType:"json",
		/*beforeSend : function (xhr)
		{
			 /*If the session id is available the write it to the header*/ 
			/*if(sessionId != undefined && sessionId != '')
			{
				xhr.setRequestHeader("Authorization", sessionId);
			}
		},*/
		success : function (data, successCode, jqXhr)
		{
			//console.log('Service call successful.');
			successHandler(data);
		},
		error : function(jqXHR, errorType, exceptionObject)
		{
			//console.log('Service call failed.');
			errorHandler(jqXHR, errorType, exceptionObject);
		}
	});
}
