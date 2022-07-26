var infoPlaca = document.querySelector("#busca");

var resultPlaca = document.querySelector("#resultPlaca");

var btPlaca = document.querySelector("button");

btPlaca.addEventListener("click", validarPlaca);

function validarPlaca(){

    var placa = infoPlaca.value;
    const placaAntiga = /^[a-zA-Z]{3}[0-9]{4}$/;
    const placaNova = /^[a-zA-Z]{3}[0-9]{1}[a-zA-Z]{1}[0-9]{2}$/;

    if(placaAntiga.test(placa)){ 

        console.log("Placa válida");
        resultPlaca.innerHTML = "Placa válida"

    } else if(placaNova.test(placa)){

        console.log("Placa válida");
        resultPlaca.innerHTML = "Placa válida"

    }else {

    console.log("Placa inválida");

    }
}