/**
 * 
 */
$("document").ready(function(){
	$(".table #editBtn").on("click",function(event){
		event.preventDefault();
		var href = $(this).attr("href");
		$.get(href,function(user){
			$("#idEdit").val(user.id);
			$("#firstNameEdit").val(user.firstName);
			$("#lastNameEdit").val(user.lastName);
			$("#addressEdit").val(user.address);
			$("#nationalityEdit").val(user.nationality);
		});
		$("#editModal").modal();
	})
});