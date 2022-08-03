var nome = document.getElementById("nome")
var cargo = document.getElementById("cargo")
var salario = document.getElementById("salario")

function addtable(){
    let itemtable = document.createElement("tr")

    let nomeValue = document.createElement("td")
    nomeValue.innerHTML = nome.value 
    
    let cargoValue = document.createElement("td")
    cargoValue.innerHTML = cargo.value

    let salarioValue = document.createElement("td")
    salarioValue.innerHTML = salario.value

    itemtable.appendChild(nomeValue)
    itemtable.appendChild(cargoValue)
    itemtable.appendChild(salarioValue)

    document.querySelector(".corpo").appendChild(itemtable)
}