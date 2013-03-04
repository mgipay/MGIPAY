/**
 * @author Prasanna
 */
//prasanna Start

  var initialPrice='';
  var defaultPickupLocation;
  var flag1=0;
 

	function termsAndConditions()
     {
     	window.location.href = "termsconditions.html";
     }
     
     function termsOfUse()
     {
     	window.location.href = "terms_of_use.html";
     }
     
     function privacyPolicy()
     {
     	window.location.href = "privacy_policy.html";
     }
     function goToWithdrawAccessPage()
         {
         
     	window.location.href = "withdraw_access.html";
     	
  }
  function lightBox()
  {
  	
  	document.getElementById('light').style.display='block';	
document.getElementById('fade').style.display='block';
  }
     
     function goToWithdraw()
     {
     	window.location.href = "withdraw.html";
     	       	
     }
   
   function  goToHomePage()
   {
   	
   	window.location.href = "Intro_mobile.html";
   }
function closeLB()
  {
 	window.location.href = "Intro_mobile.html";
  	
  }

function goToFullSite()
{

window.location.href = "https://www.moneygram.com/MGI/EN/IN/Market/Market.htm?CC=IN&LC=EN";
	
}





function completeTransaction()
{
	window.location.href = "complete.html";
}


function withdrawCash()
{
window.location.href = "withdraw.html";	
}


function goToBackPage()
{
	
	document.getElementById('light_complete').style.display='none';	
document.getElementById('fade_complete').style.display='none';
}

function goToMoneygramMap()
{
	document.getElementById('light_complete').style.display='block';	
document.getElementById('fade_complete').style.display='block';
}

function clearFeilds()
{


//$('.pickup_location#docsList').attr('selectedIndex', defaultPickupLocation);
$('.pickup_location').get(0).selectedIndex = defaultPickupLocation;
document.getElementById('recieveAmount').value = "";
document.getElementById('fee').innerHTML = "";
document.getElementById('totalAmount').innerHTML = "";

}

function numberValidation()
	{
		
		var recieveAmount1=document.getElementById('recieveAmount').value;
		
		if(isNaN(recieveAmount))
		alert('please enter only numbers');
	}


	
	 function enableButton()
	 {
	 	
	 	var checked_status = document.getElementById('ckeck').checked;
	 	
    if (checked_status == true)
           {
      $('#withdraw_button').removeAttr('disabled');
          }
      else
           {
      	 $('#withdraw_button').attr('disabled','disabled');
          }

	 }
	
function storeDefaultValues()
{
	defaultPickupLocation=$('.pickup_location :selected').index();
		
}

function display()
{
				  	if(flag1==0)
				   	{
				   		$(".slide_menu").animate({"margin-right":"63%"},'slow');
				   		
				   		flag1++;
				   	}
				   	else
		      {
			$(".slide_menu").animate({"margin-right":"-63%"},'slow');
				   		
				   		//$(".second").hide();
				   		flag1=0;
		}
		
		
		
		//alert(flag1);	
		
		  
}
