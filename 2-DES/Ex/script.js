var infoPlaca = document.querySelector("#busca");
var resultPlaca = document.querySelector("#placaRes");
var btPlaca = document.querySelector("#btPlaca");
btPlaca.addEventListener("click", validarPlaca);
function validarPlaca(){
    var placa = infoPlaca.value;
    const placaAntiga = /^[a-zA-Z]{3}[0-9]{4}$/;
    const placaNova = /^[a-zA-Z]{3}[0-9]{1}[a-zA-Z]{1}[0-9]{2}$/;
    if(placaAntiga.test(placa)){ 
        resultPlaca.innerHTML = "Placa válida";
    } else if(placaNova.test(placa)){
        resultPlaca.innerHTML = "Placa válida";
    }else {
    resultPlaca.innerHTML = "Placa inválida";
    }
}

var infoCPF = document.querySelector("#bcCPF");
var btCPF = document.querySelector("#btCPF");
var resultCPF = document.querySelector("#cpfRes")
btCPF.addEventListener("click", validaCPF)

function validaCPF(){
    var cpf = infoCPF.value;
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
    if(result == true){
        resultCPF.innerHTML = "CPF válido"
        return console.log(result);
    }else{
        resultCPF.innerHTML = "CPF inválido"
        return console.log(result);
    }

}

var btphone = document.querySelector("#gen");
var resultPhone = document.querySelector("#telefones");
var infophone = document.querySelector("#tel");

btphone.addEventListener("click", gerarnumeros)

function gerarnumeros(){
    let qnt = infophone.value;
    let i = 0;
    
    while(i < qnt){
        let phone = `${"(19)"}${Math.floor(Math.random() * (99999 - 11111 + 1)) + 111111}-${Math.floor(Math.random() * (9999 - 1111 + 1)) + 1111}               `;
        resultPhone.innerHTML += phone;
        console.log(phone);
        i++
    }
    
}