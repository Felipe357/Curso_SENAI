var produto = document.querySelector(".modal-produto")
var setor = document.querySelector(".modal-setor")
var funcionario = document.querySelector(".modal-funcionario")
function btnSetor() {
    setor.style.top = "300px"
    funcionario.style.bottom = "-400px"
    produto.style.left = "-400px"
}

function btnProduto() {
    setor.style.top = "-400px"
    funcionario.style.bottom = "-400px"
    produto.style.left = "180px"
}

function btnFuncionario() {
    setor.style.top = "-400px"
    funcionario.style.bottom = "300px"
    produto.style.left = "-400px"
}

var info

function selectBox(e) {
    info = e.id
    var btn = e.parentNode.parentNode
    btn.querySelector(".dropbtn").querySelector("span").innerHTML = info
}

function carregarSetor() {
    const options = { method: 'GET' };

    fetch('http://localhost:3000/setor', options)
        .then(response => response.json())
        .then(response => {
            response.forEach(st => {
              var setor = document.querySelector(".info").querySelector(".setor").cloneNode(true)
              setor.classList.remove("model")
              
              setor.querySelector("#idSetor").innerHTML = st.id
              setor.querySelector("#nomeSetor").innerHTML = st.nome
              setor.querySelector("#comissaoSetor").innerHTML = st.comissao + "%"

              document.querySelector(".infoSetores").appendChild(setor)
            })
        })
        
}

function carregarProduto() {
    const options = { method: 'GET' };

    fetch('http://localhost:3000/produto', options)
        .then(response => response.json())
        .then(response => {
            response.forEach(pr => {
              var produto = document.querySelector(".info").querySelector(".produto").cloneNode(true)
              produto.classList.remove("model")
              
              produto.querySelector("#idProduto").innerHTML = pr.id
              produto.querySelector("#nomeProduto").innerHTML = pr.nome
              produto.querySelector("#valorProduto").innerHTML = pr.valor
              produto.querySelector("#idSetorProduto").innerHTML = pr.setor.id

              document.querySelector(".infoProdutos").appendChild(produto)
            })
        })
        
}

function carregarFuncionario() {
    const options = { method: 'GET' };

    fetch('http://localhost:3000/funcionario', options)
        .then(response => response.json())
        .then(response => {
            response.forEach(pr => {
              var produto = document.querySelector(".info").querySelector(".funcionarios").cloneNode(true)
              produto.classList.remove("model")
              
              produto.querySelector("#idFuncionario").innerHTML = pr.id
              produto.querySelector("#nomeFuncionario").innerHTML = pr.nome
              produto.querySelector("#salarioFuncionario").innerHTML = pr.salario
              produto.querySelector("#idSetorFuncionario").innerHTML = pr.setor_id

              document.querySelector(".infoFuncionarios").appendChild(produto)
            })
        })
        
}

function infoSetor() {
    document.querySelector(".infoSetores").classList.remove("model")
    document.querySelector(".infoProdutos").classList.add("model")
    document.querySelector(".infoFuncionarios").classList.add("model")
}

function infoProduto() {
    document.querySelector(".infoSetores").classList.add("model")
    document.querySelector(".infoProdutos").classList.remove("model")
    document.querySelector(".infoFuncionarios").classList.add("model")
}

function infoFuncionario() {
    document.querySelector(".infoSetores").classList.add("model")
    document.querySelector(".infoProdutos").classList.add("model")
    document.querySelector(".infoFuncionarios").classList.remove("model")
}