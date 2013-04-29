
var reviewResp;
var reviewValues;
$(document).ready(function() {
if($.browser.chrome){
		reviewResp = localStorage.getItem("commitResponse");
		reviewValues = localStorage.getItem("reviewValues");
	}
	else{
		reviewResp = $.cookie("commitResponse");
		reviewValues = $.cookie("reviewValues"); 
	}
	var reviewDetails = reviewValues.split(",");
	$(".sender_name").html(reviewDetails[0]);
	$(".state").html(reviewDetails[1]);
	$(".availability").html(reviewDetails[3]);
	$(".pickup").html(reviewDetails[2]);
	$(".receive_amt").html(reviewDetails[6]);
	$(".final_fee").html(reviewDetails[5]);
	$(".review_total").html(reviewDetails[4]);
});

function openTermsAndConditions()
{
	orientationVar=1;
	var sheight = (screen.height) * 0.9;
		var swidth = (screen.width) * 0.94;  
	document.body.style.position="fixed";
 	$.fancybox({
    	 autoDimensions: false,
    	 'width'             :swidth,
         'height'            : sheight,
        	 content: $('#termsAndConditions').html(),
    	 
    	 'onClosed' : function(){
						   document.body.style.position="relative";
						   orientationVar=0;
    	 				}
    });
}

function openFraudMessage()
{
orientationVar=2;
 var sheight = (screen.height);
		var swidth = (screen.width);  
	document.body.style.position="fixed";
 	$.fancybox({
    	 autoDimensions: false,
    	 'width'             : swidth,
         'height'            : sheight,
        	 content: $('#fraudMessageContent').html(),
    	 
    	 'onClosed' : function(){
						   document.body.style.position="relative";
						   orientationVar=0;
    	 				}
    });
}
