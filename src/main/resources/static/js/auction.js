$(".food-button").hover(function() {
    $(this).find(".opaq").removeClass("hidden");
    $(this).find(".item-name").removeClass("hidden");
}, function() {
    $(this).find(".opaq").addClass("hidden");
    $(this).find(".item-name").addClass("hidden");
});

function getFoodData(foodId) {
	
	$.ajax({
		type: 'GET',
		url: ctx + '/getFoodData/' + foodId,
		dataType: 'json'
	}).done( function(response){
		
		console.log(JSON.stringify(response));
		
		$('h3.clicked-food').text(response.food_NAME);
		
	});
	
}
