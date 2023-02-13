

function carregar() {
    const options = { method: 'GET' };

    fetch('http://localhost:5000/listarpedidos', options)
        .then(response => response.json())
        .then(response => {
            response.forEach(e => {

                if (e.hora_entrega == "" && e.hora_fim == "") {

                    var pedido = document.querySelector(".lista-cozinha").querySelector(".pedido").cloneNode(true)
                    pedido.classList.remove("model")
                    pedido.querySelector(".id").querySelector("#id").innerHTML = e.id_pedido
                    pedido.querySelector(".cliente").querySelector("#cli").innerHTML = e.cliente
                    pedido.querySelector(".endereco").querySelector("#end").innerHTML = e.endereco
                    pedido.querySelector(".Produto").querySelector("#prod").innerHTML = e.produto
                    pedido.querySelector(".horario").querySelector("#hora").innerHTML = e.hora_pedido
                    pedido.querySelector(".data").querySelector("#data").innerHTML = e.data

                    pedido.querySelector(".img").querySelector("button").id = e.id_pedido

                    document.querySelector(".lista-cozinha").appendChild(pedido)

                } else if (e.hora_fim == "") {
                    var pedido = document.querySelector(".lista-entrega").querySelector(".pedido").cloneNode(true)
                    pedido.classList.remove("model")
                    pedido.querySelector(".id").querySelector("#id").innerHTML = e.id_pedido
                    pedido.querySelector(".cliente").querySelector("#cli").innerHTML = e.cliente
                    pedido.querySelector(".endereco").querySelector("#end").innerHTML = e.endereco
                    pedido.querySelector(".Produto").querySelector("#prod").innerHTML = e.produto
                    pedido.querySelector(".horario").querySelector("#hora").innerHTML = e.hora_entrega
                    pedido.querySelector(".data").querySelector("#data").innerHTML = e.data

                    pedido.querySelector(".img").querySelector("button").id = e.id_pedido
                    pedido.querySelector(".img").querySelector("img").id = e.id_pedido+"m"

                    document.querySelector(".lista-entrega").appendChild(pedido)
                }
            });
        })
}

function cad() {
    const date = new Date();
    var time

    if (date.getHours() < 10) {
        time = '0' + date.getHours() + ":" + date.getMinutes()
    } else {
        time = date.getHours() + ":" + date.getMinutes()
    }

    var pedido = {
        "cliente": document.querySelector(".cli").querySelector("input").value,
        "endereco": document.querySelector(".end").querySelector("input").value,
        "produto": document.querySelector(".prod").querySelector("input").value,
        "data": date.toLocaleDateString(),
        "hora_pedido": time,
        "hora_entrega": "",
        "hora_fim": "",
        "id_entregador": Math.floor(Math.random() * 4 + 1),
    }

    const options = {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(pedido)
    };

    fetch('http://localhost:5000/cadPedido', options)
        .then(response => response.json())
        .then(response => {
            if (response !== undefined) {
                window.location.reload()
            }
        })
}

function altCozinha(e) {
    const date = new Date();
    var time

    if (date.getHours() < 10) {
        time = '0' + date.getHours() + ":" + date.getMinutes()
    } else {
        time = date.getHours() + ":" + date.getMinutes()
    }

    var alt = {
        "id_pedido": e.id,
        "hora_entrega": time
    }

    const options = {
        method: 'PUT',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(alt)
    };

    fetch('http://localhost:5000/altPedidoEntrega', options)
        .then(response => response.json())
        .then(response => {
            if (response !== undefined) {
                window.location.reload()
            }
        })
}

function altEntrega(e) {
    const date = new Date();
    var time

    if (date.getHours() < 10) {
        time = '0' + date.getHours() + ":" + date.getMinutes()
    } else {
        time = date.getHours() + ":" + date.getMinutes()
    }

    var alt = {
        "id_pedido": e.id,
        "hora_fim": time
    }

    const options = {
        method: 'PUT',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(alt)
    };

    fetch('http://localhost:5000/altPedidoFim', options)
        .then(response => response.json())
        .then(response => {
            if (response !== undefined) {
                var img = document.getElementById(e.id+"m")
                img.style.rotate = "-45deg"
                img.style.right = "-140px"
                setTimeout(() => {
                    window.location.reload()
                }, 3000)
            }
        })
}