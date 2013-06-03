var sessionTimedOut;
var loginResponse;
var isIE = /*@cc_on!@*/false; 
$(document).ready(function() {
$("#preview").show();

		var url = document.URL;
		if(url.indexOf("error=") < 0)
		{
			var index = url.lastIndexOf("code=");
			var code = url.substr(index + 5, url.length);
			var getUserData = new Object();
			getUserData.code = code;
			var getUserDataObj = new Object();
			getUserDataObj.UserDataInputBean = getUserData;
			callService(methods.GetUserData[0], methods.GetUserData[1], getUserDataObj, getUserDataSuccessHandler, getUserDataFailureHandler);
			//getUserDataSuccessHandler("");
		}
		else
		{
			logout();
		}
});

var getUserDataSuccessHandler = function(response){
	//response = {"address":{"postal_code":"07901","locality":"Summit","region":"NJ","country":"US","street_address":"4807384 5th Street, 3272844 4th Street","senderState":"New Jersey"},"family_name":"Fundsout","verified":"true","phone_number":"6023820578","zoneinfo":"America/Los_Angeles","name":"MGIFundsout","email":"mgi_consumer_test@moneygram.com","given_name":"MGI","user_id":"https://www.paypal.com/webapps/auth/identity/user/dCn3hbvb2NWbecoGgSGz41zZ5jGdcYvQAr3zmwEZxUo","transactionSuccess":true,"errorMessage":"","token":"wdbfpweurwoeirwofhnwfnvqosifh"};
	loginResponse = response;
	var locationInfo;
		if(isIE){
       		$.cookie("logoutClicked", "false");
        }
       	else {
			localStorage.setItem("logoutClicked","false");
       	}
		if(response.transactionSuccess == true)
		{
			locationInfo = response.address.country;
			if(locationInfo == "US")
			{
				var sessionDate = new Date();
				sessionDate.setMinutes(sessionDate.getMinutes() + 15);
				sessionDate.toGMTString();
				if(isIE)
				{
					$.cookie("userLogin", "yes"); 
					$.cookie("loginResponse", JSON.stringify(loginResponse)); 
					$.cookie("sessionDate", sessionDate); 
				}
				else 
				{
					localStorage.setItem("userLogin", "yes");
					localStorage.loginResponse = JSON.stringify(loginResponse);
					localStorage.sessionDate = sessionDate;
				}
				
				window.location.href = "home.html";
			}
			else
			{
				alert(resources.UScustomer);
				logout();
			}
		}
		else
		{
			alert(response.errorMessage);
			logout();
		}
	
}

var getUserDataFailureHandler = function(){
	alert(resources.errorMsg);
	logout();
};


function logout()
{
		if(isIE){
			$.removeCookie("userLogin");
			$.removeCookie("addCashActive");
			$.removeCookie("withdrawCashActive");
			$.removeCookie("loginResponse");
			$.removeCookie("referenceNumber");
			$.removeCookie("reviewValues");
			$.removeCookie("sessionID");
			$.removeCookie("commitResponse");	
			$.removeCookie("withdrawValues");	
			$.removeCookie("sessionDate");			
       		$.cookie("logoutClicked", "true");
			if(sessionTimedOut == 'yes'){
				$.cookie("sessionTimedOut", "true");
			}else{
				$.cookie("sessionTimedOut", "false");
			}
			window.location.href = "home.html";
        }
       	else {
			localStorage.clear();
	       	localStorage.setItem("logoutClicked", "true");
			if(sessionTimedOut == 'yes'){
				localStorage.setItem("sessionTimedOut", "true");
			}else{
				localStorage.setItem("sessionTimedOut", "false");
			}
			window.location.href = "home.html";
       	}
}