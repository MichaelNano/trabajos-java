//Llamada a metodo crearboton
crearboton()

/*
 *Este metodo crea los divs donde iran los numeros de las tarjetas y tambien
 *los parrafos donde se insertaran los numeros de las tarjetas
 */
function crearDivs() {
    for (let i = 1; i <= 3; i++) {
        let div = document.createElement("div")
        let iddivs = "div" + i
        for (let j = 1; j <= 3; j++) {
            let p = document.createElement("p")
            div.appendChild(p)
        }
        div.setAttribute("id", iddivs)
        document.body.appendChild(div)
    }
}

/*
 * Este metodo crea el boton para generar las tarjetas
 */
function crearboton() {
    let botonMostrar = document.createElement("button")
    botonMostrar.type = "button"
    botonMostrar.textContent = "Generar tarjetas"
    botonMostrar.onclick = creartarjetasBingo
    document.body.appendChild(botonMostrar)
}

/*
 * Este metodo genera las tarjetas y los numeros que van dentro de ellas
 * con un maximo de 5 numeros por linea y 15 por tarjeta
 */
function creartarjetasBingo() {
    let button = document.querySelector("button")
    button.remove()
    crearDivs();
    for (let i = 1; i <= 3; i++) {
        let div = document.getElementById("div" + i);
        let arraynumerico = [];

        for (let j = 1; j <= 3; j++) {
            let p = div.children[j - 1];

            for (let k = 1; k <= 5; k++) {
                let numero = Math.floor(Math.random() * 99) + 1;

                if (!arraynumerico.includes(numero)) {
                    arraynumerico.push(numero);
                    p.textContent += " " + numero;
                } else {
                    k--;
                }
            }
        }
    }
    crearbotonrecargar()

}

//Crea el boton que al pulsarlo recarga la pagina
function crearbotonrecargar() {
    let botonMostrar = document.createElement("button")
    botonMostrar.type = "button"
    botonMostrar.textContent = "Jugar"
    botonMostrar.addEventListener("click", function () {
        location.reload();
    })
    botonMostrar.onclick = location.reload
    document.body.appendChild(botonMostrar)
}