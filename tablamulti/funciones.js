var par = 2;
var impar = 1;
inicio();

function inicio() {
    document.getElementById("todos").addEventListener("click", creartodos);
    document.getElementById("pares").addEventListener("click", function () { crear(par) });
    document.getElementById("impares").addEventListener("click", function () { crear(impar) });
}

function creartodos() {
    document.getElementById("contenedor1").innerHTML = "";
    for (var i = 1; i <= 10; i++) {
        document.getElementById("contenedor1").innerHTML += "<div id=div" + i + "></div>";
    }
    for (var i = 1; i <= 10; i++) {
        document.getElementById("div" + i).innerHTML += "<p>La tabla de multiplicar " + i + "</p> <br>";
        for (var j = 1; j <= 10; j++) {
            document.getElementById("div" + i).innerHTML += "<p>" + i + " x " + j + " = " + i * j + "</p> <br>";
        }
    }
}

function crear(par) {
    document.getElementById("contenedor1").innerHTML = "";
    for (var i = par; i <= 10; i += 2) {
        document.getElementById("contenedor1").innerHTML += "<div id=div" + i + "></div>";
    }
    for (var i = par; i <= 10; i += 2) {
        document.getElementById("div" + i).innerHTML += "<p>La tabla de multiplicar " + i + "</p> <br>";
        for (var j = 1; j <= 10; j++) {
            document.getElementById("div" + i).innerHTML += "<p>" + i + " x " + j + " = " + i * j + "</p> <br>";
        }
    }
}
