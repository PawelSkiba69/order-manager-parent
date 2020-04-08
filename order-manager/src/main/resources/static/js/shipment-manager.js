$(document).ready(function() {
    $(function() {
        $("#sendDate").datepicker({
            minDate: 0
        }).datepicker('setDate', 'today');
    });
});