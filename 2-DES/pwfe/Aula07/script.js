var users = [
    {
        "id":"1",
        "username":"Felipe",
        "pass":"1234"
    },

    {
        "id":"2",
        "username":"Cirilo",
        "pass":"4321"
    },

    {
        "id":"3",
        "username":"Xurastei",
        "pass":"1432"
    },

    {
        "id":"4",
        "username":"Durango",
        "pass":"2341"
    }
];

var nome = document.getElementById("user")
var senha = document.getElementById("senha")

function validaUser(){

    let validou = false

    users.forEach( user => {
    
    if(nome.value == user.username){

        if(senha.value == user.pass){
            window.location.href = "./produtos.html"
            validou = true
        }

    }

    })

    if (!validou) {
        window.alert("Usuário inválido")    
    }
    

}