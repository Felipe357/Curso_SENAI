function validarUser(){
    fetch("https://jsonplaceholder.typicode.com/users")
    .then((response) => {
        return response.json();
    })
    .then((data) => {
            data.forEach(login => {

                let email = document.querySelector("#email")
                let senha = document.querySelector("#senha")
        
                var emailValue = email.value
                var senhaValue = senha.value

                if(emailValue == login.email){
        
                    if(senhaValue == login.username){
                        window.location.href = "./telaPosts.html"
                        let user = {
                            id: login.id,
                            name: login.name
                        }
                        window.localStorage.setItem("dados_do_usuario", JSON.stringify(user));
                    }
                }
        
            })
    })
}

