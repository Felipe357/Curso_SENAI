var contVenda = 0

function carregarVenda() {
    const options = { method: 'GET', headers: { 'Content-Type': 'application/json' } };

    fetch('http://localhost:3000/venda', options)
        .then(response => response.json())
        .then(response => {
            response.forEach((vd, index) => {
                if ((index + 1) > contVenda) {
                    var venda = document.querySelector(".venda").cloneNode(true)
                    venda.classList.remove("model")

                    venda.querySelector("#data").innerHTML = new Date(vd.data).toLocaleDateString('pt-br', { timeZone: 'UTC' })
                    venda.querySelector("#nomeFc").innerHTML = vd.funcionario.nome
                    venda.querySelector("#nomeSt").innerHTML = vd.funcionario.setor.nome
                    if (vd.detalhe.length > 0) {
                        var qntd = 0
                        vd.detalhe.forEach(e => {
                            qntd += parseInt(e.quantidade)
                        })

                        venda.querySelector("#qntdPr").innerHTML = qntd
                    } else {
                        venda.querySelector("#qntdPr").innerHTML = "Nenhum Produto Vendido"
                    }

                    document.querySelector(".info").appendChild(venda)
                }
            })
            contVenda = response.length
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
                    var produto = document.querySelector("#modal-nome-pr").cloneNode(true)
                    produto.classList.remove("model")

                    produto.innerHTML = pr.nome
                    produto.value = pr.id

                    document.querySelector(".modal-pr-info").appendChild(produto)
                }
            })
            contProduto = response.length
        })

}

function addVenda(e) {
    const options = { method: 'GET' };

    fetch('http://localhost:3000/produto/' + e.value, options)
        .then(response => response.json())
        .then(response => {
            if (response !== undefined) {
                var valida = ""
                var prs = document.querySelectorAll(".pr")
                prs.forEach(ps => {

                    if (ps.id == response.id) {
                        ps.querySelector("#inpQntdPr").value = parseInt(ps.querySelector("#inpQntdPr").value) + 1
                        valida = "opa"
                    }
                })

                if (valida !== "opa") {
                    var pr = document.querySelector(".pr").cloneNode(true)
                    pr.classList.remove("model")

                    pr.id = response.id
                    pr.querySelector("#nomePr").innerHTML = response.nome

                    document.querySelector(".prod").appendChild(pr)
                }

                document.querySelector(".modal-pr").classList.toggle("model")

            }
        })
}

function toggleModal() {
    var prs = document.querySelectorAll(".pr").length

    if (prs > 5) {
        document.querySelector(".produto").style.background = "red"
        document.querySelector(".produto").addEventListener('click', '')
    } else {
        document.querySelector(".modal-pr").classList.toggle("model")
    }

}

function realizarVenda() {
    var nome = document.querySelector("#inpFc").value

    var nomeFunc = {
        "nome": nome
    }

    const options = {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(nomeFunc)
    };

    fetch('http://localhost:3000/venda', options)
        .then(response => response.json())
        .then(response => {
            if (response !== "Nome do funcionário incorreto") {

                var v = document.querySelectorAll(".pr")
                var vendas = []

                v.forEach((vs, indice) => {
                    
                    if (indice > 0) {
                        
                        var produtoId = vs.id
                        var vendaId = parseInt(contVenda) + 1
                        var quantidade = vs.querySelector("#inpQntdPr").value

                        var prs = {
                            "produto_id": parseInt(produtoId),
                            "venda_id": parseInt(vendaId),
                            "quantidade": parseInt(quantidade)
                        }

                        vendas.push(prs)

                    }
                })

                const options = {
                    method: 'POST',
                    headers: { 'Content-Type': 'application/json' },
                    body: JSON.stringify(vendas)
                };

                fetch('http://localhost:3000/detalhe', options)
                    .then(response => response.json())
                    .then(r => {
                        
                        if (r !== undefined) {
                            document.querySelector("#inpFc").innerHTML = ""
                            carregarVenda()
                        }
                    })


            } else {
                document.querySelector("#msgErro").innerHTML = response
            }
        })
}