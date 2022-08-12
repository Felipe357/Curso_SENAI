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

var produtos = [
    {
        "id":"1",
        "foto":"https://cdn.discordapp.com/attachments/631275586035122206/1007042562403618856/unknown.png",
        "nome":"chupeta",
        "valor":"50,00"
    },

    {
        "id":"2",
        "foto":"https://cdn.discordapp.com/attachments/631275586035122206/1007042636831539240/unknown.png",
        "nome":"tampinha",
        "valor":"11,00"
    },

    {
        "id":"3",
        "foto":"https://cdn.discordapp.com/attachments/631275586035122206/1007043065220956301/unknown.png",
        "nome":"capacete",
        "valor":"500,00"
    }
];

var pr = document.querySelector(".info_produto");

function carregar() { 
    produtos.forEach(item => {
        let novoproduto = pr.cloneNode(true);

        novoproduto.classList.remove("modelo");

        novoproduto.querySelector("#img_produto").src = item.foto;
        novoproduto.querySelector(".nome_produto").innerHTML = item.nome;
        novoproduto.querySelector(".valor_produto").innerHTML = item.valor;

        document.querySelector(".produtos").appendChild(novoproduto);
    });
}