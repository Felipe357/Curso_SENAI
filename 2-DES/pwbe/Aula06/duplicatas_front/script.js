function carregarClientes() {
    fetch("http://localhost:3000/duplicatas/clientes")
    .then((response) => {
        return response.json();
    })
    .then((data) => {

        let cliente = document.querySelector(".clientes")

        data.forEach(clientes => {

            let cli = cliente.cloneNode(true)

            cli.classList.remove("model")
    
            cli.querySelector("#id").innerHTML = clientes.cod_cli
            cli.querySelector("#nome").innerHTML = clientes.nome
            cli.querySelector("#tipo").innerHTML = clientes.telefone.tipo
            cli.querySelector("#tel").innerHTML = clientes.telefone.telefone
            cli.querySelector("#end").innerHTML = clientes.endereco
            cli.querySelector("#bairro").innerHTML = clientes.bairro
            cli.querySelector("#cidade").innerHTML = clientes.cidade
            cli.querySelector("#uf").innerHTML = clientes.uf
    
            document.querySelector(".container").appendChild(cli)
        })

    })
}

function carregarTel() {

    let modal = document.querySelector(".infoTel")

    modal.classList.toggle("modelTel")
}