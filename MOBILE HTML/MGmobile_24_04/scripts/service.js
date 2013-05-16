/* this file contains the implemenation of jquery/javascript ajax service calls */

function callService(methodName, requestType, postMethodJsonObject, successHandler, errorHandler)
{
		var postMethodJsonString = JSON.stringify(postMethodJsonObject);
		var serviceUrl = baseUrl + methodName;
		document.body.style.overflow="hidden";
		$(".tabDisable").attr("tabindex","-1");
		/*$("body").keydown(function (evt) {
			//Determine where the character code is coming from
			var charCode = evt.charCode || evt.keyCode;
			if (charCode  == 9) { //Enter key's keycode, could be any other key
				return false;
			}
		});*/
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
