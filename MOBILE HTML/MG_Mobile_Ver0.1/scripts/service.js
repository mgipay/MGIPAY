/* this file contains the implemenation of jquery/javascript ajax service calls */

function callService(methodName, requestType, postMethodJsonObject, successHandler, errorHandler)
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
				errorHandler();
				//errorHandler(jqXHR, errorType, exceptionObject);
			}
		});
}
