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
    btn.querySelector(".dropbtn").querySelector("span").id = e.value
}



var contSetor = 0

function carregarSetor() {
    const options = { method: 'GET' };

    fetch('http://localhost:3000/setor', options)
        .then(response => response.json())
        .then(response => {

            response.forEach((st, index) => {
                if ((index + 1) > contSetor) {
                    var setor = document.querySelector(".info").querySelector(".setor").cloneNode(true)
                    setor.classList.remove("model")

                    setor.querySelector("#idSetor").innerHTML = st.id
                    setor.querySelector("#nomeSetor").innerHTML = st.nome
                    setor.querySelector("#comissaoSetor").innerHTML = st.comissao + "%"

                    document.querySelector(".infoSetores").appendChild(setor)
                    var p = document.querySelector(".dropdown-content").querySelector("p").cloneNode(true)
                    p.classList.remove("model")
                    p.innerHTML = st.nome
                    p.id = st.nome
                    p.value = st.id

                    var p2 = document.querySelector(".dropdown-content").querySelector("p").cloneNode(true)
                    p2.classList.remove("model")
                    p2.innerHTML = st.nome
                    p2.id = st.nome
                    p2.value = st.id

                    
                    document.querySelector(".dropdown2").appendChild(p2)
                    document.querySelector(".dropdown-content").appendChild(p)
                }

            })
            contSetor = response.length

        })

}

var contProduto = 0

function carregarProduto() {
    const options = { method: 'GET' };

    fetch('http://localhost:3000/produto', options)
        .then(response => response.json())
        .then(response => {
            response.forEach((pr, index) => {
                if ((index + 1) > contProduto) {
                    var produto = document.querySelector(".info").querySelector(".produto").cloneNode(true)
                    produto.classList.remove("model")

                    produto.querySelector("#idProduto").innerHTML = pr.id
                    produto.querySelector("#nomeProduto").innerHTML = pr.nome
                    produto.querySelector("#valorProduto").innerHTML = pr.valor
                    produto.querySelector("#idSetorProduto").innerHTML = pr.setor.id

                    document.querySelector(".infoProdutos").appendChild(produto)
                }
            })
            contProduto = response.length
        })

}

var contFuncionario = 0

function carregarFuncionario() {
    const options = { method: 'GET' };

    fetch('http://localhost:3000/funcionario', options)
        .then(response => response.json())
        .then(response => {
            response.forEach((pr, index) => {
                if ((index + 1) > contFuncionario) {
                    var produto = document.querySelector(".info").querySelector(".funcionarios").cloneNode(true)
                    produto.classList.remove("model")

                    produto.querySelector("#idFuncionario").innerHTML = pr.id
                    produto.querySelector("#nomeFuncionario").innerHTML = pr.nome
                    produto.querySelector("#salarioFuncionario").innerHTML = pr.salario
                    produto.querySelector("#idSetorFuncionario").innerHTML = pr.setor_id

                    document.querySelector(".infoFuncionarios").appendChild(produto)
                }
            })
            contFuncionario = response.length
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

function cadastrarSetor() {

    var nomeSt = document.getElementById("nomeSetor")
    var comissaoSt = document.getElementById("comissaoSetor")

    var st = {
        "nome": nomeSt.value,
        "comissao": parseFloat(comissaoSt.value)
    }

    const options = {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(st)
    };

    fetch('http://localhost:3000/setor', options)
        .then(response => response.json())
        .then(response => {
            if (response !== undefined) {
                nomeSt.value = ""
                comissaoSt.value = ""
                carregarSetor()
            }
        })

}

function cadastrarProduto() {

    var nomePr = document.getElementById("nomeProduto")
    var valorPr = document.getElementById("valorProduto")
    var setorPr = document.getElementById("dropSetor").querySelector("span")

    var st = {
        "nome": nomePr.value,
        "valor": parseFloat(valorPr.value),
        "setor_id": parseInt(setorPr.id)
    }

    const options = {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(st)
    };

    fetch('http://localhost:3000/produto', options)
        .then(response => response.json())
        .then(response => {
            if (response !== undefined) {
                nomePr.value = ""
                valorPr.value = ""
                carregarProduto()
            }
        })

}

function cadastrarFuncionario() {

    var nomeFc = document.getElementById("nomeFuncionario")
    var salarioFc = document.getElementById("salarioFuncionario")
    var setorFc = document.getElementById("dropSetor2").querySelector("span")

    var st = {
        "nome": nomeFc.value,
        "salario": parseFloat(salarioFc.value),
        "setor_id": parseInt(setorFc.id)
    }

    const options = {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(st)
    };

    fetch('http://localhost:3000/funcionario', options)
        .then(response => response.json())
        .then(response => {
            if (response !== undefined) {
                nomeFc.value = ""
                salarioFc.value = ""
                carregarFuncionario()
            }
        })

}