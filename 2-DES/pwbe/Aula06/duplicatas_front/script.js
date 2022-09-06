
function carregarClientes() {
    fetch("http://localhost:3000/duplicatas/clientes")
    .then((response) => {
        return response.json();
    })
    .then((data) => {

        let cliente = document.querySelector(".clientes")
        data.forEach(clientes => {

            var cli = cliente.cloneNode(true)

            cli.classList.remove("model")

            
    
            cli.querySelector("#id").innerHTML = clientes.cod_cli
            cli.querySelector("#nome").innerHTML = clientes.nome
            cli.querySelector("#end").innerHTML = clientes.endereco
            cli.querySelector("#bairro").innerHTML = clientes.bairro
            cli.querySelector("#cidade").innerHTML = clientes.cidade
            cli.querySelector("#uf").innerHTML = clientes.uf

            document.querySelector(".container").appendChild(cli)
            
        })

    })
}

function carregarTel(el){

    let cod
    cod = el.parentNode.parentNode.querySelector(".infoNome").querySelector("#id").innerHTML

    fetch("http://localhost:3000/duplicatas/clientes")
    .then((response) => {
        return response.json();
    })
    .then((data) => {

        document.querySelector(".infoTel").classList.toggle("modelTel")

        data.forEach(cl => {

            let info = document.querySelector(".card")

            if(cl.cod_cli == cod){

                cl.telefone.forEach(tel => {

                    var i = info.cloneNode(true)

                    i.classList.toggle("modelTel")

                    i.querySelector("#tipo").innerHTML = tel.tipo
                    i.querySelector("#tel").innerHTML = tel.telefone

                    document.querySelector(".infoTel").appendChild(i)
                    
                })

            }

        })
    })

}

function fecha(){
    location.reload()
}

function carregarclientes(e) {

    let modal = e.parentNode.querySelector(".infoclientes")

    modal.classList.toggle("modelclientes")
}