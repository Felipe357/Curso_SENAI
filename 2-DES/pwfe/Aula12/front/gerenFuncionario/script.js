const listaProdutos = document.querySelector("#lista-produtos")
const linhaModelo = document.querySelector(".linhaModelo")
const modalExcluir = document.querySelector(".excluir")
const modalEditar = document.querySelector(".editar")

const inputMatricula = document.querySelector("#matricula")
const inputNome = document.querySelector("#nome")
const inputCargo = document.querySelector("#cargo")
const inputSalario = document.querySelector("#salario")
const inputCPF = document.querySelector("#cpf")

const btnCadedit = document.querySelector("#cadedit")

fetch("http://localhost:5000/funcionario")
.then(res => {return res.json()})
.then(produtos => {
    produtos.forEach(produto => {
        let linha = linhaModelo.cloneNode(true)
        linha.classList.remove("model")

        let colunas = linha.querySelectorAll("td")
        colunas[0].innerHTML = produto.matricula
        colunas[1].innerHTML = produto.nome
        colunas[2].innerHTML = produto.cargo
        colunas[3].innerHTML = "R$ " + produto.salario
        colunas[4].innerHTML = produto.cpf

        linha.querySelector("#exclui").addEventListener("click", () => {
            modalExcluir.classList.remove("model")
            modalExcluir.querySelector("#cod").innerHTML = produto.matricula
        })

        linha.querySelector("#edita").addEventListener("click", () => {
            modalEditar.classList.remove("model")
            btnCadedit.innerHTML = "Editar"
            btnCadedit.onclick = () => {editarProduto()}
            inputMatricula.value = produto.matricula
            inputNome.value = produto.nome
            inputSalario.value = produto.cargo
            inputCargo.value = produto.salario
            inputCPF.value = produto.cpf
        })

        listaProdutos.appendChild(linha)
    });
})

function abrirModalCadastro(){
    btnCadedit.innerHTML = "Cadastrar"
    btnCadedit.onclick = () => {cadastroProduto()}
    inputMatricula.value = ""
    inputNome.value = ""
    inputSalario.value = ""
    inputCargo.value = ""
    inputCPF.value = ""
    modalEditar.classList.remove("model")
}

function fecharModalExcluir(){
    modalExcluir.classList.add("model")
}

function fecharModalEditar(){
    modalEditar.classList.add("model")
}

function editarProduto(){
    let produto = {
        "matricula": inputMatricula.value,
        "nome": inputNome.value,
        "cargo": inputCargo.value,
        "salario": inputSalario.value,
        "cpf": inputCPF.value
    }

    fetch("http://localhost:5000/funcionario", {
        "method":"PUT",
        "headers":{
            "Content-Type":"application/json"
        },
        "body":JSON.stringify(produto)
    })
    .then(res => {return res.json()})
    .then(resp => {
        if(resp.matricula !== undefined){
            alert("Funcionário Alterado com Sucesso !")
            window.location.reload()
        } else{
            alert("Não foi possivél editar o funcionário")
        }
    })

}

function excluirProduto(){
    let data ={
        "matricula": document.querySelector("#cod").innerHTML
    }

    console.log(data)

    fetch("http://localhost:5000/funcionario", {
        "method":"DELETE",
        "headers":{
            "Content-Type":"application/json"
        },
        "body":JSON.stringify(data)
    })
    .then(res => {return res.json()})
    .then(resp => {
        if(resp !== undefined){
            alert("Funcionário excluido com sucesso !")
            window.location.reload()
        } else {
            alert("Não foi possivél excluir o funcionário !")
        }
    })
}

function cadastroProduto(){
    let produto = {
        "matricula": inputMatricula.value,
        "nome": inputNome.value,
        "cargo": inputCargo.value,
        "salario": inputSalario.value,
        "cpf": inputCPF.value
    }

    fetch("http://localhost:5000/funcionario", {
        "method":"Post",
        "headers":{
            "Content-Type":"application/json"
        },
        "body":JSON.stringify(produto)
    })
    .then(res => {return res.json()})
    .then(resp => {
        if(resp.matricula !== undefined){
            alert("Produto Cadastrado com Sucesso !")
            window.location.reload()
        } else{
            alert("Não foi possivél cadastrar o produto")
        }
    })
}