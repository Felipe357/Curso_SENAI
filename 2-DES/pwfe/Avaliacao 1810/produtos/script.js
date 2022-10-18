const carregar = document.querySelector(".carregar")

function carregarProd() {
    fetch("https://patrimoniomongo.herokuapp.com/read/")
        .then(res => { return res.json() })
        .then(prod => {

            const ululu = prod.items

            ululu.forEach(p => {
                let produto = document.createElement("div")
                produto.classList.add("produto")

                let img = document.createElement("img")
                img.classList.add("img")
                img.src = "../assets/" + p.img
                img.style.width = "70px"
                img.style.height = "70px"
                
                let id = document.createElement("span")
                id.innerHTML = p._id
                id.style.width = "90px"

                let ni = document.createElement("span")
                ni.innerHTML = p.ni
                ni.style.width = "50px"

                date = new Date(p.aquisicao)
                dataFormatada = date.toLocaleDateString('pt-BR', { timeZone: 'UTC' })
                let aq = document.createElement("span")
                aq.innerHTML = dataFormatada
                aq.style.width = "40px"

                let den = document.createElement("span")
                den.innerHTML = p.denominacao
                den.style.width = "400px"

                let val = document.createElement("span")
                val.innerHTML = "R$ "+ p.valor

                let btn = document.createElement("button")
                btn.addEventListener("click", () => excluir(p.ni))
                let imgbtn = document.createElement("img")
                imgbtn.src = "../assets/close.png"
                btn.appendChild(imgbtn)

                produto.appendChild(img)
                produto.appendChild(id)
                produto.appendChild(ni)
                produto.appendChild(aq)
                produto.appendChild(den)
                produto.appendChild(val)
                produto.appendChild(btn)

                carregar.appendChild(produto)
            });

        })
}

function excluir(e) {
        let data = e

        fetch(`https://patrimoniomongo.herokuapp.com/del/ni/${data}`, {
            "method":"DELETE"
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

function abrir() {
    document.querySelector(".model").classList.remove("model")
}

function fechar() {
    document.querySelector(".modelao").classList.add("model")
}

function fecha() {
    document.querySelector(".modela").classList.add("model")
    window.location.reload()
}

function cadastrar() {
    let ni = document.querySelector("#ni").value
    let aq = document.querySelector("#aq").value
    let de = document.querySelector("#de").value
    let va = document.querySelector("#va").value
    let im = document.querySelector("#im").value

    let dados = {
        "ni": ni,
		"aquisicao": aq,
		"denominacao": de,
		"valor": va,
		"img": im
    }

    fetch("https://patrimoniomongo.herokuapp.com/create", {
        "method":"Post",
        "headers":{
            "Content-Type":"application/json"
        },
        "body":JSON.stringify(dados)
    })
    .then(res => {return res.json()})
    .then(resp => {
        console.log(resp.ni)
        const te = document.querySelector("#test")
        const e = document.querySelector("#confir")
        if(resp.ni !== undefined){
            document.querySelector(".modelao").classList.add("model")
            document.querySelector(".modela").classList.remove("model")
            te.innerHTML = "Produto cadastrado com sucesso"
        } else {
            document.querySelector(".modelao").classList.add("model")
            document.querySelector(".modela").classList.remove("model")
            te.innerHTML = "Não foi possível cadastrar o produto"
            e.src = "../assets/close.png"
        }
    })
}

function carregarNome() {
    const name = JSON.parse(window.localStorage.getItem('user'));
    console.log(name)

    let n = document.querySelector("#name")
    n.innerHTML = name.username

    let i = document.querySelector("#img")
    i.src = "../assets/"+name.img
    i.style.width = "50px"
    i.style.height = "50px"
}