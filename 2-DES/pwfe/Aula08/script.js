fetch("https://jsonplaceholder.typicode.com/todos")
.then((response) => {
    return response.json();
})
.then((data) => {
    data.forEach(tarefa => {
        let tudao = document.createElement("div");
        tudao.classList.add("tudao")

        let userid = document.createElement("div");
        userid.classList.add("user_id")
        userid.innerHTML = tarefa.userId;
        tudao.appendChild(userid);

        let title = document.createElement("div");
        title.classList.add("titulo")
        title.innerHTML = tarefa.title;
        tudao.appendChild(title);

        let gonho = document.createElement("div")
        gonho.classList.add("gonho")
        let completed = document.createElement("input");
        completed.type = 'checkbox';
        completed.checked = tarefa.completed;
        completed.innerHTML = tarefa.completed;
        gonho.appendChild(completed)
        tudao.appendChild(gonho)

        document.querySelector(".nota").appendChild(tudao)
    })
})