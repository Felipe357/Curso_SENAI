var infoPlaca = document.querySelector("#busca");

var resultPlaca = document.querySelector("#resultPlaca");

var btPlaca = document.querySelector("button");

btPlaca.addEventListener("click", validarPlaca);

function validarPlaca(){

    // falta retornar true our false
    var vf = true;
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

function validaCPF(cpf){
    cpf = cpf.replace(/\D/g, '');
    if(cpf.toString().length != 11 || /^(\d)\1{10}$/.test(cpf)) return false;
    var result = true;
    [9,10].forEach(function(j){
        var soma = 0, r;
        cpf.split(/(?=)/).splice(0,j).forEach(function(e, i){
            soma += parseInt(e) * ((j+2)-(i+1));
        });
        r = soma % 11;
        r = (r <2)?0:11-r;
        if(r != cpf.substring(j, j+1)) result = false;
    });
    return result;
}

console.log('11111111111', cpf('11111111111'));
console.log('825.566.405-02', cpf('825.566.405-02'));