<%@ page contentType="text/html; charset=UTF-8" %>
<html><head><meta charset="utf-8"><title>Приток воздуха</title><link rel="stylesheet" href="css/main.min.css"><script src="js/chart.bundle.js"></script></head><body><div class="canvas-container"><h4>Приток воздуха</h4><canvas id="scatterChart"></canvas><script>var ctx = document.getElementById('scatterChart').getContext('2d');
var scatterChart = new Chart(ctx, {
    type: 'line',
    data: {
        labels: ['0', '2', '4', '6', '8', '10', '12', '14', '16', '18', '20', '22', '24'],
        datasets: [{
		    lineTension: 0, 
            label: 'Шкаф 1',
            data: ['200', '210', '220', '220', '240', '250', '300', '300', '300', '300', '300', '300', '300'],
            backgroundColor: "rgba(0, 30, 255, 0.2)"
        }]
    },
    options: {
        scales: {
            yAxes: [{
                scaleLabel: {
                    display: true,
                    labelString: 'м3/час'
                },
            ticks: {
                    max: 600,
                    min: 0,
                    stepSize: 50,
                    beginAtZero: false,
					suggestedMax: 400,
					suggestedMin: 0
            }
            }],
            xAxes: [{
                scaleLabel: {
                    display: true,
                    labelString: 'Час суток'
                }
            }]
        }
    }
});</script><div class="canvas-container__link"><a class="btn waves-effect waves-light" href="index.jsp">Назад</a></div></div><footer class="footer"><button class="btn waves-effect waves-light">События</button><button class="btn waves-effect waves-light">График инкубации</button><button class="btn waves-effect waves-light">Настройки</button><button class="btn btn_icon waves-effect waves-light"></button></footer></body></html>