function carregar(){
    fetch("http://localhost:5000/academia/alunos")
    .then((response) => {
        return response.json();
    })
    .then((data) => {

        let pr = document.querySelector(".container")

        
            data.forEach(alunos => {
                let novoproduto = pr.cloneNode(true)
        
                novoproduto.classList.remove("modelo")
        
                novoproduto.querySelector("#id").innerHTML = alunos.id_aluno
                novoproduto.querySelector("#nome").innerHTML = alunos.nome
                novoproduto.querySelector("#date").innerHTML = new Date(alunos.nascimento).toLocaleDateString('pt-BR')
                novoproduto.querySelector("#sexo").innerHTML = alunos.sexo
                novoproduto.querySelector("#peso").innerHTML = alunos.peso
                novoproduto.querySelector("#telefone").innerHTML = alunos.telefones
        
                document.querySelector(".tudao").appendChild(novoproduto)
            })
        
    })
}