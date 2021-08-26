$(document).ready(function() {
    var refreshIntervalId = -1;
    var sent = false;

    $.post("/shipment-management/generate/check", function() {
        console.log("success");
    })
    .done(function(data) {
        console.log("second success");
        console.log("sent: " + data);
        sent = data;
    })
    .fail(function() {
        console.log("error");
    })
    .always(function() {
        console.log("finished");
    });

    console.log("document ready!");
    function generateCheck() {
        console.log("generateCheck()!");
        if (!sent) {
            console.log("IF !sent");
            $.post("/shipment-management/generate/check", function() {
                console.log("success");
            })
            .done(function(data) {
                console.log("second success");
                console.log("sent: " + data);
                sent = data;
            })
            .fail(function() {
                console.log("error");
            })
            .always(function() {
                console.log("finished");
            });
        }

        if (sent) {
            console.log("IF sent");
            $.get("/shipment-management/generate/check", function() {
                console.log("success");
            })
            .done(function(data) {
                console.log("second success");
                console.log("sent: " + data);
                document.write(data);
                clearInterval(refreshIntervalId);
            })
            .fail(function() {
                console.log("error");
            })
            .always(function() {
                console.log("finished");
            });
        }
    };

    if(!sent) {
        var refreshIntervalId = setInterval(generateCheck, 3000);
    }

//    setTimeout(function() {
//    console.log("setTimeout!");
//        $.get("/shipment-management/generate/check", function() {
//                console.log("success");
//            })
//            .done(function() {
//                console.log("second success");
//            })
//            .fail(function() {
//                console.log("error");
//            })
//            .always(function() {
//                console.log("finished");
//            });

        //        $.ajax({
        //        	url: "/generate/check",
        //            success: function(data) {
        //                console.log("/shipment-management/generate/check");
        //            }
        //        });

//    }, 3000);
});
