function criarelemento(){
    let itemlista = document.createElement("div")
    itemlista.className = "item-lista"

    let thumnail = document.createElement("img")
    thumnail.src = "./imagens/boteco.PNG"
    thumnail.id = "thumb"
    thumnail.alt = "Foto do Restaurante"

    let like = document.createElement("img")
    like.src = "./imagens/heart2.png"
    like.id = "like"
    like.alt = "Icone de coracaozin"

    let avaliacao = document.createElement("img")
    avaliacao.src = "./imagens/star2.png"
    avaliacao.id = "avaliacao"
    avaliacao.alt = "Avaliacao"

    let info = document.createElement("div")
    info.id = "info"

    let nomerestaurante = document.createElement("p")
    nomerestaurante.innerHTML = "Xurumelas Boteco 2.0 Muito Mais Melhor do que antes"

    let textoavaliacao = document.createElement("p")
    textoavaliacao.appendChild(avaliacao)
    textoavaliacao.append("4.9")

    info.appendChild(nomerestaurante)
    info.appendChild(textoavaliacao)

    itemlista.appendChild(thumnail)
    itemlista.appendChild(info)
    itemlista.appendChild(like)

    document.querySelector(".lista").appendChild(itemlista)
}