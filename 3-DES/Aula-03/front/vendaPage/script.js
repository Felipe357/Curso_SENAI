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
                        console.log(qntd);
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

    fetch('http://localhost:3000/produto/'+e.value, options)
        .then(response => response.json())
        .then(response => {
            if (response !== undefined) {
                var pr = document.querySelector(".pr").cloneNode(true)
                pr.classList.remove("model")

                pr.querySelector("#nomePr").innerHTML = response.nome

                document.querySelector(".prod").appendChild(pr)

                toggleModal()
            }
        })
}

function toggleModal() {
    document.querySelector(".modal-pr").classList.toggle("model")
}