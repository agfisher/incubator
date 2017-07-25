<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <title>Main page</title><link rel="stylesheet" href="css/magnific-popup.css">
    <link rel="stylesheet" href="css/main.min.css">
</head>
<body><header class="header"><div class="logo"><img src="img/logo.jpg"></div>
<div class="date" id="date">   </div></header><main class="section-main" id="main"><table class="main-data bordered"><thead><th></th><th>37,4</th>
<th></th><th>58</th></thead><tbody><tr><td class="cell_label">T, &deg;C</td><td class="cell_digit">
<a class="cell__link" id="temperature" href="temperature.jsp">37.5</a></td><td class="cell_label">H,%</td><td class="cell_digit">
<a class="cell__link" id="humidity" href="humidity.jsp">60</a></td></tr><tr><td class="cell_label">CO<sub>2</sub>,%</td><td class="cell_digit">
<a class="cell__link" id="co" href="co.jsp">1.2</a></td><td class="cell_label">V, м<sup>3</sup>/ч</td><td class="cell_digit">
<a class="cell__link" id="airflow" href="airflow.jsp">300</a></td></tr></tbody></table>
<div class="images">
    <div style="color: #b3e5fc">Поворот лотков</div>
    <div class="img-eggs"><img src="img/cases.jpg"></div>
    <div style="color: #b3e5fc">Текущие сутки</div>
    <div class="img-steps">
        <img src="img/step-11.jpg">
    </div>
</div>
</main><footer class="footer"><a class="btn btn_footer btn_events waves-effect waves-light" href="#">События</a>
<a class="btn btn_footer waves-effect waves-light" href="table.jsp">График инкубации</a>
<a class="btn btn_footer btn_settings waves-effect waves-light" href="#">Настройки</a>
<a class="btn btn_footer btn_icon waves-effect waves-light"></a></footer>
<div class="white-popup mfp-hide" id="modal-events"><p class="events">За текущий период аварийных событий не зафиксировано</p>
    <button class="btn btn_modal btn_close waves-effect waves-light" href="#">Выход</button></div>
<div class="white-popup mfp-hide" id="modal-settings"><form class="settings"><div class="input-field"><input type="password">
    <label for="password">Введите пароль</label></div></form><button class="btn btn_modal btn_password waves-effect waves-light">Ввод</button>
    <button class="btn btn_modal btn_close waves-effect waves-light">Выход</button></div><script src="js/zepto.min.js">
</script><script src="js/jquery.magnific-popup.min.js"></script><script src="js/scripts.js"></script></body></html>