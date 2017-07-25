<%@ page contentType="text/html; charset=UTF-8" %>
<html><head><meta charset="utf-8"><title>Tемпература в шкафах</title><link rel="stylesheet" href="css/main.min.css"><script src="js/chart.bundle.js"></script></head>
<body>
<div class="canvas-container"><h4>Tемпература в шкафах</h4><canvas id="scatterChart"></canvas><script>var ctx = document.getElementById('scatterChart').getContext('2d');
var scatterChart  = new Chart(ctx, {
    type: 'line',
	data: {
			labels: ['0', '2', '4', '6', '8', '10', '12', '14', '16', '18', '20', '22', '24'],
			datasets: [{
			    lineTension: 0, 
				label: 'Шкаф 1',
				data: [{
					x: 0,
					y: 37.4
				}, {
					x: 2,
					y: 37.4
				}, {
					x: 4,
					y: 37.4
				}, {
					x: 6,
					y: 37.4
				}, {
					x: 8,
					y: 37.5
				}, {
					x: 10,
					y: 37.4
				}, {
					x: 12,
					y: 37.5
				}, {
					x: 14,
					y: 37.4
				}, {
					x: 16,
					y: 37.6
				}, {
					x: 18,
					y: 37.5
				}, {
					x: 20,
					y: 37.6
				}, {
					x: 22,
					y: 37.5
				}, {
					x: 24,
					y: 37.6
				}				
				],
				backgroundColor: "rgba(171, 0, 0, 0.5)"
			}]
		},

    options: {
        scales: {
            yAxes: [{
                scaleLabel: {
                    display: true,
                    labelString: 'Градусы Цельсия'
                },
            ticks: {
                    max: 40,
                    min: 34,
                    stepSize: 0.5,
                    beginAtZero: false,
					suggestedMax: 40,
					suggestedMin: 34					
            }				
            }],
            xAxes: [{
                scaleLabel: {
				    type: 'linear',
                    position: 'bottom',
                    //display: true,
                    labelString: 'Час суток'
                }
            }]
        }
    }
});
</script><div class="canvas-container__link"><a class="btn waves-effect waves-light" href="index.jsp">Назад</a></div></div><footer class="footer"><button class="btn waves-effect waves-light">События</button><button class="btn waves-effect waves-light">График инкубации</button><button class="btn waves-effect waves-light">Настройки</button><button class="btn btn_icon waves-effect waves-light"></button></footer></body></html>