$(document).ready(function() {
    $(".productChanged").on("change paste keyup", function(e) {
        $(this).closest("td").find("input[type='hidden']").val("true");
        $("#saveAll").val("true");
    });

    function productCheckbox() {
        console.log("function productCheckbox()");
    };

    $(".orderChosenCheckbox").on("click", function(e) {
        console.log("clicked orderChosenCheckbox!");
        productCheckbox();
    });

    $(".orderMcfCheckbox").on("click", function(e) {
        console.log("clicked orderMcfCheckbox!");
        productCheckbox();
    });

    $("#generate-mcf-btn").on("click", function(e) {
        console.log("clicked generate-mcf-btn!");

        const mcfs = [];
        var index = 0;

        $("input[name='orderOIdMcfChosen']").each(function() {
            if (this.checked) {
                var orderOIdMcf = $(this).closest("td").find("input[type='hidden']").val();
                mcfs[index++] = orderOIdMcf;
            }
        });

		$.post("/order-management/generate-mcf-rest", {'s[]': mcfs}, function() {
			console.log("success");
		})
		.done(function(data) {
			console.log("second success");
			sent = data;
		})
		.fail(function() {
			console.log("error");
		})
		.always(function() {
			console.log("finished");
		});
    });


});
