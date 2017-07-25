function getRandomFloat(){return Number(Math.random().toFixed(1))}function getRandomInterval(e,t){return(Math.random()*(t-e)+e).toFixed(1)}
function setRandomValue(e,t,n){e.textContent=n?getRandomInterval(CO1,CO2):t+getRandomFloat()}function setIntervalIteration(){setInterval(
function(){setRandomValue(fieldTemperature,TEMPERATURE)},PERIOD),setInterval(function(){setRandomValue(fieldHumidity,HUMIDITY)},PERIOD),setInterval(
function(){setRandomValue(fieldCO,null,!0)},PERIOD)}
function displayDate(){var e={year:"numeric",month:"long",day:"numeric",timezone:"UTC",hour:"numeric",minute:"numeric"};setInterval(
function(){document.getElementById("date").textContent=(new Date).toLocaleString("ru",e)},1e3)}
var fieldTemperature=document.getElementById("temperature"),fieldHumidity=document.getElementById("humidity"),fieldCO=document.getElementById("co"),
PERIOD=3e3,TEMPERATURE=37,HUMIDITY=58,CO1=.5,CO2=1.2;displayDate(),setIntervalIteration();var form=document.querySelector(".settings"),
passwordInput=form.querySelector("input"),passwordLabel=form.querySelector("label");passwordInput.addEventListener("focus",
function(){passwordLabel.classList.add("active")}),passwordInput.addEventListener("focusout",
function(){passwordLabel.classList.remove("active")}),$(".btn_events").magnificPopup({items:{src:"#modal-events",type:"inline"}}),
$(".btn_settings").magnificPopup({items:{src:"#modal-settings",type:"inline"}}),$(".btn_close").click(function(){$.magnificPopup.close(),
passwordInput.value=""});
//# sourceMappingURL=../maps/scripts.js.map
