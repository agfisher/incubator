<%@ page contentType="text/html; charset=UTF-8" %>
<html><head><title>Тест</title><link rel="stylesheet" href="css/magnific-popup.css"><link rel="stylesheet" href="css/main.min.css"><script src="js/chart.bundle.js"></script></head><body><div class="canvas-container"><h4>Тест</h4><canvas id="myChart"></canvas><script>var ctx = document.getElementById('scatterChart').getContext('2d');
var scatterChart = new Chart(ctx, {
    type: 'line',
    data: {
        datasets: [{
            lineTension: 0,
            label: 'Scatter Dataset',
            data: [{
                x: -10,
                y: 0
            }, {
                x: 0,
                y: 10
            }, {
                x: 10,
                y: 5
            }]
        }]
    },
    options: {
        bezierCurve: false,
        scales: {
            xAxes: [{
                type: 'linear',
                position: 'bottom'
            }]
        }
    }
});
</script><div class="canvas-container__link"><a class="btn waves-effect waves-light" href="index.jsp">Назад</a></div></div><footer class="footer"><a class="btn btn_footer btn_events waves-effect waves-light" href="#">События</a><a class="btn btn_footer waves-effect waves-light" href="table.jsp">График инкубации</a><a class="btn btn_footer btn_settings waves-effect waves-light" href="#">Настройки</a><a class="btn btn_footer btn_icon waves-effect waves-light"></a></footer><div class="white-popup mfp-hide" id="modal-events"><p class="events">За текущий период аварийных событий не зафиксировано</p><button class="btn btn_modal btn_close waves-effect waves-light" href="#">Выход</button></div><div class="white-popup mfp-hide" id="modal-settings"><form class="settings"><div class="input-field"><input type="password"><label for="password">Введите пароль</label></div></form><button class="btn btn_modal btn_password waves-effect waves-light">Ввод</button><button class="btn btn_modal btn_close waves-effect waves-light">Выход</button></div><script src="js/zepto.min.js"></script><script src="js/jquery.magnific-popup.min.js"></script><script src="js/scripts.js"></script></body></html>