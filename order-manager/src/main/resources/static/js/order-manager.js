$(document).ready(function() {
    $(".productChanged").on("change paste keyup", function(e) {
        $(this).closest("td").find("input[type='hidden']").val("true");
        $("#saveAll").val("true");
    });
});
