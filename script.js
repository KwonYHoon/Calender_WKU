document.addEventListener('DOMContentLoaded', function() {
    var calendarEl = document.getElementById('calendar');

    var calendar = new FullCalendar.Calendar(calendarEl, {
        initialView: 'dayGridMonth'
        // 여기에 캘린더 옵션과 콜백 함수를 추가할 수 있습니다.
    });

    calendar.render();
});