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

        console.log("BEFORE ajax!");
        $.ajax({
            type: "POST",
            url: "/order-management/generate-mcf-rest",
            data: {
                "s[]": mcfs
            },
            dataType: "text",
            success: function(data) {
                var blob = new Blob([data]);
                var a = document.createElement('a');
                a.href = window.URL.createObjectURL(blob);
                a.download = "report-mcf.csv";
                a.style.display = 'none';
                document.body.appendChild(a);
                a.click();
            },
            error: function(result) {
                console.log("error result: " + result);
            }
        });
    });
});
