/* this file contains the implemenation of jquery/javascript ajax service calls */

function callService(methodName, requestType, postMethodJsonObject, successHandler, errorHandler)
{
		var postMethodJsonString = JSON.stringify(postMethodJsonObject);
		var serviceUrl = baseUrl + methodName;
		document.body.style.overflow="hidden";
		$('body').keydown(function(event){
					return false;
				});
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
				$('body').unbind('keydown');
				successHandler(data);
			},
			error : function(jqXHR, errorType, exceptionObject)
			{
				$('body').unbind('keydown');
				$("#preview").hide();
				document.body.style.overflow="visible";
				errorHandler();
				//errorHandler(jqXHR, errorType, exceptionObject);
			}
		});
}
