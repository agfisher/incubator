<%@ page contentType="text/html; charset=UTF-8" %>
<html><head><meta charset="utf-8"><title>Влажность воздуха</title><link rel="stylesheet" href="css/main.min.css"><script src="js/chart.bundle.js"></script></head><body><div class="canvas-container"><h4>Влажность воздуха, %</h4><canvas id="myChart"></canvas><script>var ctx = document.getElementById('myChart').getContext('2d');
var myChart = new Chart(ctx, {
    type: 'line',
    data: {
        labels: ['0', '2', '4', '6', '8', '10', '12', '14', '16', '18', '20', '22', '24'],
        datasets: [{
		    lineTension: 0, 
            label: 'Шкаф 1',
            data: ['55', '56', '55', '58', '56', '57', '62', '58', '61', '59', '60', '62', '64'],
            backgroundColor: "rgba(20, 56, 135, 0.5)"
        }]
    },
    options: {
        scales: {
            yAxes: [{
                scaleLabel: {
                    display: true,
                    labelString: '% влажности воздуха'
                },
            ticks: {
                    max: 80,
                    min: 40,
                    stepSize: 10,
                    beginAtZero: false,
					suggestedMax: 80,
					suggestedMin: 40					
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