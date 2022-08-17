function valida(){
    if(senha.value.length < 8){
        setErrorFor(senha, "A senha deve ter no mínimo 8 caracteres")
    } else {
        setSuccessFor(senha)
    }
}

function confirmaSenha(){
    var senha = document.getElementById("senha")
    let confSenha = document.getElementById("confirmarSenha")

        if(senha.value != confSenha.value){
            setErrorFor(confSenha, "As senhas não coincidem")
        } else{
            setSuccessFor(confSenha);
        }

}

function validaNome(){
    let nome = document.getElementById("nome")

    if(nome.value.length == ""){
        setErrorFor(nome, "O nome é obrigatório")
    } else {
        setSuccessFor(nome)
    }
}

function validaEmail(){
    let email = document.getElementById("email")

    if(email.value.length == ""){
        setErrorFor(email, "O email é obrigatório")
    } else {
        setSuccessFor(email)
    }
}

function setErrorFor(input, message) {
    const formControl = input.parentElement;
    const small = formControl.querySelector("small");
  
    // Adiciona a mensagem de erro
    small.innerText = message;
  
    // Adiciona a classe de erro
    formControl.className = "form-control error";
  }
  
  function setSuccessFor(input) {
    const formControl = input.parentElement;
  
    // Adicionar a classe de sucesso
    formControl.className = "form-control success";
  }

  function checkCEP(){

    var log = document.getElementById("logradouro")
    var com = document.getElementById("complemento")
    var bai = document.getElementById("bairro")
    var cid = document.getElementById("cidade")
    var est = document.getElementById("estado")
    var cep = document.getElementById("cep")

    if(cep.value.length > 8 || cep.value.length < 8){
        setErrorFor(cep, "CEP está digitado incorretamente")
    } else {
        setSuccessFor(cep)
        fetch(`https://viacep.com.br/ws/${cep.value}/json/`)
        .then((response) => {
            return response.json();
        })
        .then((data) => {
                log.value = data.logradouro
                com.value = data.complemento
                bai.value = data.bairro
                cid.value = data.localidade
                est.value = data.uf
            })
    }

    
  }