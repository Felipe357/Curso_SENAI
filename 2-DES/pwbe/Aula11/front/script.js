const uri = 'http://localhost:5000/blobs/cadastros';
var dados = [];

function carregar() {
    const options = { method: 'GET' };
    fetch(uri, options)
        .then(resp => resp.json())
        .then(resp => {
            dados = resp;
            montarCards();
        })
        .catch(err => alert("Erro ao carregar dados do BD:" + err));
}

function montarCards() {
    dados.forEach(e => {
        
        let user = document.querySelector(".user").cloneNode(true)
        user.classList.remove("model")

        user.querySelector("#user").innerHTML = e.nome
        user.querySelector("#img").setAttribute('src', montaImg(e.foto))
        
        document.querySelector(".users").appendChild(user)
    });
}

function montaImg(img) {
    if (img != null) {
        return `data:image/png;base64,${img}`;
    } else
        return `./default.png`;
}

function inputChangou(inp) {
    document.querySelector(".inpFile").querySelector("span").innerHTML = inp.files[0].name
}