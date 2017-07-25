<%@ page contentType="text/html; charset=UTF-8" %>
<html><head><meta charset="utf-8"><title>Содержание С02, %</title><link rel="stylesheet" href="css/main.min.css"><script src="js/chart.bundle.js"></script></head><body><div class="canvas-container"><h4>Содержание С0<sub>2</sub>, %</h4><canvas id="myChart"></canvas><script>var ctx = document.getElementById('myChart').getContext('2d');
var myChart = new Chart(ctx, {
    type: 'line',
    data: {
        labels: ['0', '2', '4', '6', '8', '10', '12', '14', '16', '18', '20', '22', '24'],
        datasets: [{
		    lineTension: 0, 
            label: 'Шкаф 1',
            data: ['0.45', '0.50', '0.4', '0.45', '0.47', '0.48', '0.5', '0.51', '0.49', '0.48', '0.52', '0.53', '0.55'],
            backgroundColor: "rgba(171, 0, 0, 0.5)"
        }]
    },
    options: {
        scales: {
            yAxes: [{
			scaleLabel: {
				display: true,
				labelString: 'Содержание СО2',
			},
            ticks: {
                    max: 3,
                    min: 0,
                    stepSize: 0.5,
                    beginAtZero: false,
					suggestedMax: 2,
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
});
</script><div class="canvas-container__link"><a class="btn waves-effect waves-light" href="index.jsp">Назад</a></div></div><footer class="footer"><button class="btn waves-effect waves-light">События</button><button class="btn waves-effect waves-light">График инкубации</button><button class="btn waves-effect waves-light">Настройки</button><button class="btn btn_icon waves-effect waves-light"></button></footer></body></html>