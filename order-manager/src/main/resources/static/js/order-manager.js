$(document).ready(function() {
    $(".chooseCar").on("change paste keyup", function(e) {
        $(this).closest("td").find("input[type='hidden']").val("true");
    });
});
