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