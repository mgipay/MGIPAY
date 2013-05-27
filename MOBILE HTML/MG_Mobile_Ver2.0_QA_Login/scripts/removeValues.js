$.browser.chrome = /chrome/.test(navigator.userAgent.toLowerCase());

if($.browser.chrome)
{
	localStorage.setItem("reviewValues", "");
}else
{
	$.cookie("reviewValues", "");
}