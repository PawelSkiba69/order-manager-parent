$(document).ready(function() {
    $(".productChanged").on("change paste keyup", function(e) {
        $(this).closest("td").find("input[type='hidden']").val("true");
        $("#saveAll").val("true");
    });

    function productCheckbox() {
        console.log("function productCheckbox()");
    };

    $(".orderChosenCheckbox").on("click", function(e) {//----
        console.log("clicked orderChosenCheckbox!");

        var cbox = $(this).closest("tr").find(".orderMcfCheckbox").find("input[type='checkbox']");
        if (cbox.prop("checked")) {
            cbox.prop("checked", !cbox.prop("checked"));
        }

        productCheckbox();
    });

    $(".orderMcfCheckbox").on("click", function(e) {//----
        console.log("clicked orderMcfCheckbox!");

        var cbox = $(this).closest("tr").find(".orderChosenCheckbox").find("input[type='checkbox']");
        if (cbox.prop("checked")) {
            cbox.prop("checked", !cbox.prop("checked"));
        }

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

        if(mcfs.length<1){
            alert("Proszę zaznaczyć przynajmniej jedno zamówienie");
        }

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
                var date = new Date();
                let day = date.getDate();
                let month = date.getMonth() + 1;
                let year = date.getFullYear();
                let currentDate = `${year}${month}${day}`;
                a.href = window.URL.createObjectURL(blob);
                a.download = "mcf_"+currentDate+".txt";
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
