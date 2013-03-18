/** This file contains global constants like service urls/ service method names */

//var baseUrl = "http://172.25.156.88:8080/CXFRest/rest/";
var baseUrl = "http://172.25.156.110:12107/CXFRest/rest/";

var methods = {
	GetFees : ["getFee", "POST"],
	CodeTable : ["getStateCode", "POST"],
	CommitTransaction : ["commitTransaction", "POST"],
	SendValidation : ["sendValidation","POST"],
	GetUserLimits : ["getUserLimits", "POST"]	
};
