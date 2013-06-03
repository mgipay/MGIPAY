/** This file contains global constants like service urls/ service method names */
var baseUrl = "https://qapaypal.qa.moneygram.com/CXFRest/rest/";
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