$(document).ready(function(){
	// Adding year dynamically in footer
	//$(".footer_year").text( (new Date).getFullYear() );
	$(".footer_year").text( (new Date).getFullYear() + " - " + (parseInt((new Date).getFullYear())+1)  );
	
});

	var flag1=0;
function cickExpand()
	{
		
		if(flag1==0)
				   	{
				   		$('#navfootermenu').slideDown('500');
						$('#navfootermenu').css('display','block');
		
		document.getElementById("menuexpandId").style.backgroundImage = "url(images/footer_collapsed_icon.png)";
		//$('.footertogglemenu').css("margin-top","-15%");
		
		flag1++;
		}
		else
		{
			 $('#navfootermenu').slideUp('500');
			 document.getElementById("menuexpandId").style.backgroundImage = "url(images/footer_expand_icon.png)";
			 //$('.footertogglemenu').css("margin-top","0px");
			flag1=0;
		
		}
	}
function goTowithdrawPage()
     {
     	window.location.href = "withdrawcash.html";
     }
     

function openHistoryDetails()
{
	window.location.href = "history.html";
}