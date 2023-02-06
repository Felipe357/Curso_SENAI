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