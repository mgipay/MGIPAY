/** This file contains global constants like service urls/ service method names */

var baseUrl = "http://172.25.89.0:8080/CXFRest/rest/";

var methods = {
	GetFees : ["getFee", "POST"],
	CodeTable : ["getStateCode", "POST"],
	CommitTransaction : ["commitTransaction", "POST"],
	DetailsLookUp : ["detailLookUp", "POST"],
	SedReversal : ["sendReversal","POST"],
	SendValidation : ["sendValidation","POST"],
	GetUserLimits : ["getUserLimits", "POST"]
	
};

