/* this file contains the implemenation of jquery/javascript ajax service calls */
var sendMailFlag = false;
function callService(methodName, requestType, postMethodJsonObject, successHandler, errorHandler)
{
		var postMethodJsonString = JSON.stringify(postMethodJsonObject);
		var serviceUrl = baseUrl + methodName;
		if((/windows phone/gi).test(navigator.userAgent))
		{
			document.body.style.position="fixed";
		}
		else{
			document.ontouchmove = function(e){return false; }
		}
		clearTimeout(timer);
		callTimer();
		if(sendMailFlag)
		{
			sendMailFlag = false;
		}
		else
		{
			$("#preview").show();
		}
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
				if((/windows phone/gi).test(navigator.userAgent))
	            {
					document.body.style.position="relative";
				}
				else{
					document.ontouchmove = function(e){return true; }
				}
				successHandler(data);
			},
			error : function(jqXHR, errorType, exceptionObject)
			{
				$("#preview").hide();
				if((/windows phone/gi).test(navigator.userAgent))
	            {
					document.body.style.position="relative";
				}
				else{
					document.ontouchmove = function(e){return true; }
				}
				errorHandler();
			}
		});
}
