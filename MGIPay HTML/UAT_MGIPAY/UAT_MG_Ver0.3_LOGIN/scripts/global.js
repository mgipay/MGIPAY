/** This file contains global constants like service urls/ service method names */
//var baseUrl = "https://54.236.98.103/services/CXFRest/rest/"; 
var baseUrl = "https://qapaypal.qa.moneygram.com/services/CXFRest/rest/";
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
	SendProofMessage : ["sendProofMessage","POST"],
	SendTransactionInformationMail : ["sendTransactionInformationMail","POST"]
	
};
