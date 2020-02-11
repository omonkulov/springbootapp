$(document).ready(function() {
	$("#deleteAll").click(function() {
		 $.ajax({
	            url: 'delete/all',
	            method: 'post',
	            dataType: 'json',
	            success: function(response) {
	                $('#user_table tbody').html(response);
	            }
	        });
	});
});
