
$("document").ready(function() {
	$("#contact_us_byEmail").hide();
	$("#contact_us_tab li ").click(function() {
	//  First remove class "active" from currently active tab
	if ($(this).index() != 2)
		displayCoverageBalanceAlert = false;
		var selected_tab = $(this).find("a").attr("href");

		if (selected_tab != "#") {
			$("#contact_us_tab li").removeClass('active');
			//  Now add class "active" to the selected/clicked tab
			$(this).addClass("active");
			//  Hide all tab content
			$(".contact_us_content").hide();
			
			//  Here we get the href value of the selected tab

			//  Show the selected tab content
			$(selected_tab).fadeIn();
		}
		//  At the end, we add return false so that the click on the link is not executed
		return false;
	});

});