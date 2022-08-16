var usuario = JSON.parse(window.localStorage.getItem('dados_do_usuario'))
document.querySelector("#nomeUser").append(usuario.name)

fetch("https://jsonplaceholder.typicode.com/posts")
.then((response) => {
    return response.json();
})
.then((data) => {
    data.forEach(tarefa => {

        if(usuario.id == tarefa.userId){
            let tudao = document.createElement("div");
            tudao.classList.add("tudao")

            let title = document.createElement("span");
            title.classList.add("titulo")
            title.innerHTML = tarefa.title
            tudao.appendChild(title)

            let body = document.createElement("span");
            body.classList.add("infoPost")
            body.innerHTML = tarefa.body
            tudao.appendChild(body)

            document.querySelector(".post").appendChild(tudao)
        }
        
    })
})