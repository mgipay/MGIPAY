/** This file contains global constants like service urls/ service method names */
//54.236.98.103/
//var baseUrl = "http://172.25.156.88:8080/CXFRest/rest/";
var baseUrl = "http://54.236.98.103/services/CXFRest/rest/"; 

var methods = {
	GetFees : ["getFee", "POST"],
	CodeTable : ["getStateCode", "POST"],
	CommitTransaction : ["commitTransaction", "POST"],
	SendValidation : ["sendValidation","POST"],
	GetUserLimits : ["getUserLimits", "POST"],
	GetHistoryDetails : ["getHistoryDetails", "POST"],
	GetFeeLinkValue : ["getFeeLinkValue", "POST"],
	GetUserData : ["getUserData","POST"],
	SendMail : ["sendmail","POST"],
	SendProofMessage : ["sendProofMessage","POST"]
	
};