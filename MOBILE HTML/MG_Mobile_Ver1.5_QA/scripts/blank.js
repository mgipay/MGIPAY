var timer;
var sessionTimedOut;
var loginResponse;
$.browser.chrome = /chrome/.test(navigator.userAgent.toLowerCase());
$(document).ready(function() {
$("#preview").show();

var url = document.URL;
		var index = url.lastIndexOf("code=");
		var code = url.substr(index + 5, url.length);
		var getUserData = new Object();
		getUserData.code = code;
		var getUserDataObj = new Object();
		getUserDataObj.UserDataInputBean = getUserData;
		//callService(methods.GetUserData[0], methods.GetUserData[1], getUserDataObj, getUserDataSuccessHandler, getUserDataFailureHandler);
		getUserDataSuccessHandler("");
});

var getUserDataSuccessHandler = function(response){
	response = {"address":{"postal_code":"07901","locality":"Summit","region":"NJ","country":"US","street_address":"4807384 5th Street, 3272844 4th Street","senderState":"New Jersey"},"family_name":"Fundsout","verified":"true","phone_number":"6023820578","zoneinfo":"America/Los_Angeles","name":"MGIFundsout","email":"mgi_consumer_test@moneygram.com","given_name":"MGI","user_id":"https://www.paypal.com/webapps/auth/identity/user/dCn3hbvb2NWbecoGgSGz41zZ5jGdcYvQAr3zmwEZxUo","transactionSuccess":"true","errorMessage":"","token":"wdbfpweurwoeirwofhnwfnvqosifh"};
	loginResponse = response;
	var locationInfo;
		if($.browser.chrome){
       		localStorage.setItem("logoutClicked","false");
        }
       	else {
       		$.cookie("logoutClicked", "false");
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
			
			window.location.href = "home.html";
		}
		else
		{
			alert(resources.UScustomer);
			logout();
		}
	
}

var getUserDataFailureHandler = function(){
	alert(resources.errorMsg);
	logout();
};

function callTimer()
{
	timer = setTimeout(function(){
		sessionTimedOut = 'yes'
		logout();
	},1800000);
}

function logout()
{
		clearTimeout(timer);
		if($.browser.chrome){
			localStorage.clear();
	       	localStorage.setItem("logoutClicked", "true");
			if(sessionTimedOut == 'yes'){
				localStorage.setItem("sessionTimedOut", "true");
			}else{
				localStorage.setItem("sessionTimedOut", "false");
			}
			window.location.href = "home.html";
        }
       	else {
			$.removeCookie("userLogin");
			$.removeCookie("addCashActive");
			$.removeCookie("withdrawCashActive");
			$.removeCookie("loginResponse");
			$.removeCookie("referenceNumber");
			$.removeCookie("reviewValues");
			$.removeCookie("sessionID");
			$.removeCookie("commitResponse");	
			$.removeCookie("withdrawValues");		
       		$.cookie("logoutClicked", "true");
			if(sessionTimedOut == 'yes'){
				$.cookie("sessionTimedOut", "true");
			}else{
				$.cookie("sessionTimedOut", "false");
			}
			window.location.href = "home.html";
       	}
}