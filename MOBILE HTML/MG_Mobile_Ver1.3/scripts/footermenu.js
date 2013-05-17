// JavaScript Document
// FOOTER EXPAND COLAPSE MENU
var flag1=0;
	
	
	function menu_clicked()
	{
		if(flag1==0)
				   	{
		
		//$('#footermenu').animate({'margin-top':'65%'},"slow");
								
		$('#footermenu').animate({'height':'22%'});
		$('#Slide_footermenu').css({'visibility':'visible'});
		
		$('#footermenu_img').attr('src','images/footer_collapsed_icon.png');
		
		
		flag1++;
		}
		else
		{
				$('#Slide_footermenu').css({'visibility':'hidden'});
				$('#footermenu').animate({'height':'2%'});
				$('#footermenu_img').attr('src','images/footer_expand_icon.png');
		
		$('#footermenu').css({'height':'2%'});
		flag1=0;
		}
		
	}