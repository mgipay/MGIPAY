// JavaScript Document
var sortFlag=0;
$(document).ready(function() {
	$("#dateSort").click(function(){
		if(sortFlag == 0)
		{
			$('#all_elements .element').sort(sortDescending).appendTo('#all_elements');
			sortFlag = 1;
		}
		else 
		{
			$('#all_elements .element').sort(sortAscending).appendTo('#all_elements');
			sortFlag = 0;
		}
	});
		/*** Navigate to login page  start***/
		$('.paypal_login').live('click', function(event) {  

			$('.black_overlay').css('display','block');

			var sheight = (screen.height) * 0.6;
        var swidth = (screen.width) * 0.6;  
	event.preventDefault();
          $.popupWindow('https://www.paypal.com/in/cgi-bin/webscr?cmd=_login-submit', {
          	height:sheight,
          	width:sheight,
          	toolbar:'yes',
            onUnload: function() {
            $('.black_overlay').css('display','none');
            }
          });});
		/*** Navigate to login page  end***/
});

function sortDescending(a, b) {
	var date1  = $(a).find(".year").text();
	date1 = date1.split('/');
	date1 = new Date(date1[2], date1[1] -1, date1[0]);
	var date2  = $(b).find(".year").text();
	date2= date2.split('/');
	date2= new Date(date2[2], date2[1] -1, date2[0]);
	
	return date1 < date2 ? 1 : -1;
};
	
function sortAscending(a, b) {
	var date1  = $(a).find(".year").text();
	date1 = date1.split('/');
	date1 = new Date(date1[2], date1[1] -1, date1[0]);
	var date2  = $(b).find(".year").text();
	date2= date2.split('/');
	date2= new Date(date2[2], date2[1] -1, date2[0]);
	
	return date1 > date2 ? 1 : -1;
};