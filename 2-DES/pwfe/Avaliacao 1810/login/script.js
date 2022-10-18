const email = document.querySelector("#email")
const senha = document.querySelector("#senha")

function verificar(){

    let logi = {
        "username" : email.value,
        "password" : senha.value
    }

    fetch("https://patrimoniomongo.herokuapp.com/login",{
        "method":"Post",
        "headers":{
            "Content-Type":"application/json"
        },
        "body":JSON.stringify(logi)
    })
    .then(res => { return res.json() })
    .then(login => {
        console.log(login)
        
        window.localStorage.setItem('user', JSON.stringify(login));

        window.location.href = "../home/index.html"

    })
}