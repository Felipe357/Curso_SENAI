// // //tagname, id, class
// // var texto = document.getElementsByTagName("h1");

// // // console.log(texto);

// // var titulo = document.getElementById("titulo");

// // var aluno = {
// //     nome: "Ciclano",
// //     matricula: 234578
// // };

// // titulo.innerHTML = `Nome: ${aluno.nome} </br> Matricula : ${aluno.matricula}`;

// // titulo.style.color = "green";

// // var mensagem = document.getElementById("mensagem");

// // mensagem.style.display = "block";

// // var divisao = document.getElementsByClassName("divisao");

// //document.querySelector();
// //document.querySelectorAll();

// var titulo2 = document.querySelector("#titulo");
// var div = document.querySelectorAll(".divisao");
// var msg = document.querySelectorAll("h1");

// console.log(msg);

var busca = document.querySelector("#busca")

var linhas = document.querySelectorAll("tr")

var btBusaca = document.querySelector("button")

btBusaca.addEventListener("click", buscarNome)

busca.addEventListener("keyup", buscarNome)

function buscarNome() {
    let Encontrei = false;

    linhas.forEach(linha => {
        let temp = linha.querySelector("td")
        if(temp != null){
            // if(temp.innerHTML.toLocaleLowerCase() == busca.value.toLocaleLowerCase()){
            //     alert("Encontrei");
            //     Encontrei = true
            //     linha.style.fontWeight = "pink";
            // // }
            // if(temp.innerHTML.toLowerCase().includes(busca.value.toLowerCase())){
            //     linha.style.display = "table-row"
            // } else {
            //     linha.style.display = "none"
            // }
            if(linha.innerHTML.toLowerCase().includes(busca.value.toLowerCase())){
                linha.style.display = "table-row"
            }else{
                linha.style.display = "none"
            }
        }
    });

    // if(!Encontrei) alert("Não encontrei");

}