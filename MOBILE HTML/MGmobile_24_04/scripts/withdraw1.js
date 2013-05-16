$(document).ready(
			function() {
				$('#fee_withdrawcashtooltip').hide();
				
$("#fee_withdrawcashtooltip").hide();
				$("#withdrawcashfee").click(function() {
					
					$('#fee_withdrawcashtooltip').slideDown(800);
					
				});

				$("#withdrawcashfancybox-close").click(function() {
					
					$('#fee_withdrawcashtooltip').hide(800);
					
				});
				
				
				
				
});
function openFraudMessage()
{

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
    	 				}
    });
}

function openTermsAndConditions()
{
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
    	 				}
    });
}

// $(window).resize(function(){openFraudMessage()});
// $(window).resize(function(){openTermsAndConditions()})