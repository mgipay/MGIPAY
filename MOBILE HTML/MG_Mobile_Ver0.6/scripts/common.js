$(document).ready(function() {
	if($.browser.chrome){
		localStorage.setItem("withdrawPageDetails","");
	}
	else{
		$.cookie("withdrawPageDetails",""); 
	}
});