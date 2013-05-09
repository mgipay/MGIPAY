$.browser.chrome = /chrome/.test(navigator.userAgent.toLowerCase());
var loginResponse;
$(document).ready(function() {
	if($.browser.chrome) {
		loginResponse = localStorage.getItem("loginResponse");
	} else {
		loginResponse = $.cookie("loginResponse");
	}
	if(loginResponse == null || loginResponse == "" || loginResponse == undefined)
	{
		var url = document.URL;
		var index = url.lastIndexOf("code=");
		var code = url.substr(index + 5, url.length);
		var getUserData = new Object();
		getUserData.code = code;
		var getUserDataObj = new Object();
		getUserDataObj.UserDataInputBean = getUserData;
		callService(methods.GetUserData[0], methods.GetUserData[1], getUserDataObj, getUserDataSuccessHandler, getUserDataFailureHandler);
	}
	else
	{
		
	}
});

var getUserDataSuccessHandler = function(response){
	loginResponse = response;
	$("#preview").hide();
		if($.browser.chrome){
       		localStorage.setItem("logoutClicked", "");
        }
       	else {
       		$.cookie("logoutClicked", "");
       	}
	locationInfo = response.address.country;
	if(locationInfo == "US")
	{
		if($.browser.chrome)
		{
			localStorage.setItem("userLogin", "yes");
			localStorage.loginResponse = JSON.stringify(loginResponse);
		}
		else 
		{
			$.cookie("userLogin", "yes"); 
			$.cookie("loginResponse", JSON.stringify(loginResponse)); 
		}
	}
}

var getUserDataFailureHandler = function(){
	alert(resources.errorMsg);
};
