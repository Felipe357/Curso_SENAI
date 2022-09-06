const listaProdutos = document.querySelector("#lista-produtos")
const linhaModelo = document.querySelector(".linhaModelo")
const modalExcluir = document.querySelector(".excluir")
const modalEditar = document.querySelector(".editar")

const inputCodigo = document.querySelector("#codigo")
const inputNome = document.querySelector("#nome")
const inputquantidade = document.querySelector("#quantidade")
const inputPreco = document.querySelector("#valor")

fetch("http://localhost:5000/produtos")
.then(res => {return res.json()})
.then(produtos => {
    produtos.forEach(produto => {
        let linha = linhaModelo.cloneNode(true)
        linha.classList.remove("model")

        let colunas = linha.querySelectorAll("td")
        colunas[0].innerHTML = produto.cod
        colunas[1].innerHTML = produto.nome
        colunas[2].innerHTML = produto.qntd
        colunas[3].innerHTML = "R$ " + produto.preco

        linha.querySelector("#exclui").addEventListener("click", () => {
            modalExcluir.classList.remove("model")
            modalExcluir.querySelector("#cod").innerHTML = produto.cod
        })

        linha.querySelector("#edita").addEventListener("click", () => {
            modalEditar.classList.remove("model")

            inputCodigo.value = produto.cod
            inputNome.value = produto.nome
            inputPreco.value = produto.preco
            inputquantidade.value = produto.qntd
        })

        listaProdutos.appendChild(linha)
    });
})

function fecharModalExcluir(){
    modalExcluir.classList.add("model")
}

function fecharModalEditar(){
    modalEditar.classList.add("model")
}

function editarProduto(){
    let produto = {
        "cod": inputCodigo.value,
        "nome": inputNome.value,
        "qntd": inputquantidade.value,
        "preco": inputPreco.value
    }

    fetch("http://localhost:5000/produtos", {
        "method":"PUT",
        "headers":{
            "Content-Type":"application/json"
        },
        "body":JSON.stringify(produto)
    })
    .then(res => {return res.json()})
    .then(resp => {
        if(resp.cod !== undefined){
            alert("Produto Alterado com Sucesso !")
            window.location.reload()
        } else{
            alert("Não foi possivél editar o produto")
        }
    })

}

function excluirProduto(){
    let data ={
        "cod":document.querySelector("#cod").innerHTML
    }

    fetch("http://localhost:5000/produtos", {
        "method":"DELETE",
        "headers":{
            "Content-Type":"application/json"
        },
        "body":JSON.stringify(data)
    })
    .then(res => {return res.json()})
    .then(resp => {
        if(resp !== undefined){
            alert("Produto excluido com sucesso !")
            window.location.reload()
        } else {
            alert("Não foi possivél excluir o produto !")
        }
    })
}