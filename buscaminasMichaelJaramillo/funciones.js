var casillas = 20, mina = 3;
var minas = [];
inicio();

function inicio() {
    generarminas();
    crearcasillasyeventos();
}

function generarminas() {
    var posicionesMinas = new Set();
    while (posicionesMinas.size < mina) {
        var nuevaMina = Math.floor(Math.random() * casillas);
        posicionesMinas.add(nuevaMina);
    }
    minas = Array.from(posicionesMinas);
}

function crearcasillasyeventos() {
    for (var i = 0; i < casillas; i++) {
        // Crear el botón de manera dinámica
        boton = document.createElement("button");
        boton.id = "boton" + i;
        boton.innerHTML = i; // Puedes poner un número o lo que desees como texto del botón

        // Añadir el botón al contenedor
        document.getElementById("contenedor").appendChild(boton);

        // Agregar el evento de clic a cada botón
        boton.addEventListener("click", function (ewt) {
            explotabomba(ewt); // Pasamos el evento al hacer clic
        });
    }
}

function explotabomba(ewt) {
    var cual = ewt.target.id; // Obtener el id del botón
    var indice = parseInt(cual.replace("boton", "")); // Extraer el índice del botón
    var boton = document.getElementById(cual);

    // Comparar el índice de la casilla con las minas
    if (minas.includes(indice)) {
        boton.innerHTML = "💣 Bomba";
        boton.style.backgroundColor = "red";
    } else {
        boton.innerHTML = "✔️ vacio";
        boton.style.backgroundColor = "green";
    }
    boton.disabled = true;
}
