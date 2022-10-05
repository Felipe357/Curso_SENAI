const uri = "http://localhost:3000/patrimonio/itens/"
const corpo = document.querySelector("#corpo")
var itens = []

function carregar() {

    const options = { method: 'GET' };

    fetch(uri, options)
        .then(res => res.json())
        .then(res => {
            itens = res
            preencherTela()
        })
        .catch(err => console.error(err));

}

function preencherTela() {
    itens.forEach(e => {
        let card = document.querySelector("#card").cloneNode(true)

        card.classList.remove("model")

        data = new Date(e.aquisicao)
        dataFormatada = data.toLocaleDateString('pt-BR', { timeZone: 'UTC' })

        card.querySelector("#ni").innerHTML += e.ni
        card.querySelector("#aquisicao").innerHTML += dataFormatada
        card.querySelector("#denominacao").innerHTML += e.denominacao
        card.querySelector("#valor").innerHTML += e.valor
        card.querySelector("#img").src = '../docs/assets/' + e.img
        card.querySelector("#del").setAttribute('onclick', `del(${e.ni})`)
        corpo.appendChild(card)
    })
    console.log(itens)
}

const del = (ni) => {
    const options = {
        method: "DELETE"
    }
    if (confirm("Confirma a exclusão do item: " + ni)) {
        fetch(uri + ni, options)
            .then(res => res.status)
            .then(res => {
                if (res == 204)
                    window.location.reload()
            })
            .catch(err => console.error(err));
    }

}