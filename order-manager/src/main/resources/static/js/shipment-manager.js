$(document).ready(function() {
    $(function() {
        $("#sendDate")
//        .datepicker({dateFormat: "yy/mm/dd"})
        .datepicker({minDate: 0
        }).datepicker('setDate', 'today');
    });
});