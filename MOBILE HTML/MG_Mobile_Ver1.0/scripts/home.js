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
		$("#homeText").removeClass("displaynone").addClass("displayblock");
		$("#paypalHomeLink").removeClass("withdrawbutton");
		$("#withdrawText").removeClass("displayblock").addClass("displaynone");
		var url = document.URL;
		var index = url.lastIndexOf("code=");
		var code = url.substr(index + 5, url.length);
		var getUserData = new Object();
		getUserData.code = code;
		var getUserDataObj = new Object();
		getUserDataObj.UserDataInputBean = getUserData;
		//callService(methods.GetUserData[0], methods.GetUserData[1], getUserDataObj, getUserDataSuccessHandler, getUserDataFailureHandler);
		getUserDataSuccessHandler("");
	}
	else
	{
		$("#homeText").removeClass("displayblock").addClass("displaynone");
		$("#paypalHomeLink").addClass("withdrawbutton");
		$("#withdrawText").removeClass("displaynone").addClass("displayblock");
	}
});

function goTopaypalWithdraw()
{
		if($('#paypalHomeLink').hasClass("withdrawbutton"))
		{
			window.location.href = "withdrawcash.html";
		}
		else
		{
			window.location.href = "home.html";
			//window.location.href = "https://www.stage2cp07.stage.paypal.com:8443/webapps/auth/protocol/openidconnect/v1/authorize?client_id=mgi_fundsout_qa_env.moneygram.com&response_type=code&scope=profile email address phone https://uri.paypal.com/services/AdaptivePaymentsPayAPI openid&redirect_uri=https://qapaypal.qa.moneygram.com/home.html";
		}
}

var getUserDataSuccessHandler = function(response){
	response = {"address":{"postal_code":"07901","locality":"Summit","region":"NJ","country":"US","street_address":"4807384 5th Street, 3272844 4th Street","senderState":"New jersey"},"family_name":"Fundsout","verified":"true","phone_number":"6023820578","zoneinfo":"America/Los_Angeles","name":"MGIFundsout","email":"mgi_consumer_test@moneygram.com","given_name":"MGI","user_id":"https://www.paypal.com/webapps/auth/identity/user/dCn3hbvb2NWbecoGgSGz41zZ5jGdcYvQAr3zmwEZxUo","transactionSuccess":"true","errorMessage":"","token":"wdbfpweurwoeirwofhnwfnvqosifh"};
	loginResponse = response;
	var locationInfo;
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
	else
	{
		alert(resources.UScustomer);
		logout();
	}
}

var getUserDataFailureHandler = function(){
	alert(resources.errorMsg);
};
