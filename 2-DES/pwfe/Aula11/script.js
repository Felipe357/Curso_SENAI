function carregarAluno(){
    // fetch("http://localhost:5000/academia/alunos")
    // .then((response) => {
    //     return response.json();
    // })
    // .then((data) => {

        let onEx = document.querySelector(".containerEx")
        onEx.classList.add("modelo")

        let onApa = document.querySelector(".containerAparelho")
        onApa.classList.add("modelo")

        let onFicha = document.querySelector(".containerFicha")
        onFicha.classList.add("modelo")

        let onAluno = document.querySelector(".containerAluno")
        onAluno.classList.remove("modelo")

        
            data.forEach(alunos => {


                onAluno.classList.add("modelo")
                let novoproduto = onAluno.cloneNode(true)
        
                novoproduto.classList.remove("modelo")
        
                novoproduto.querySelector("#id").innerHTML = alunos.id_aluno
                novoproduto.querySelector("#nome").innerHTML = alunos.nome
                novoproduto.querySelector("#date").innerHTML = new Date(alunos.nascimento).toLocaleDateString('pt-BR')
                novoproduto.querySelector("#sexo").innerHTML = alunos.sexo
                novoproduto.querySelector("#peso").innerHTML = alunos.peso
                novoproduto.querySelector("#telefone").innerHTML = alunos.telefones
        
                document.querySelector(".tudao").appendChild(novoproduto)
            })
        
    // })
}

function carregarFicha(){
    // fetch("http://localhost:5000/academia/fichas")
    // .then((response) => {
    //     return response.json();
    // })
    // .then((data) => {

        let onAluno = document.querySelector(".containerAluno")
        onAluno.classList.add("modelo")

        let onEx = document.querySelector(".containerEx")
        onEx.classList.add("modelo")

        let onApa = document.querySelector(".containerAparelho")
        onApa.classList.add("modelo")

        let onFicha = document.querySelector(".containerFicha")
        onFicha.classList.remove("modelo")
        
            data.forEach(alunos => {

                onFicha.classList.add("modelo")

                let novoproduto = onFicha.cloneNode(true)
        
                novoproduto.classList.remove("modelo")
        
                novoproduto.querySelector("#idNoFicha").innerHTML = alunos.id_aluno
                novoproduto.querySelector("#exFicha").innerHTML = alunos.id_exercicio
                novoproduto.querySelector("#diaSemana").innerHTML = alunos.dia_semana
                novoproduto.querySelector("#serie").innerHTML = alunos.serie
        
                document.querySelector(".tudao").appendChild(novoproduto)
            })
        
    // })
}

function carregarAparelho(){
    // fetch("http://localhost:5000/academia/fichas")
    // .then((response) => {
    //     return response.json();
    // })
    // .then((data) => {

        let onAluno = document.querySelector(".containerAluno")
        onAluno.classList.add("modelo")

        let onEx = document.querySelector(".containerEx")
        onEx.classList.add("modelo")

        let onApa = document.querySelector(".containerAparelho")
        onApa.classList.remove("modelo")

        let onFicha = document.querySelector(".containerFicha")
        onFicha.classList.add("modelo")
        
            data.forEach(alunos => {

                onApa.classList.add("modelo")

                let novoproduto = onFicha.cloneNode(true)
        
                novoproduto.classList.remove("modelo")
        
                novoproduto.querySelector("#idAparelho").innerHTML = alunos.id_aparelho
                novoproduto.querySelector("#nomeAparelho").innerHTML = alunos.nome_aparelho
        
                document.querySelector(".tudao").appendChild(novoproduto)
            })
        
    // })
}

function carregarExercicios(){
    // fetch("http://localhost:5000/academia/fichas")
    // .then((response) => {
    //     return response.json();
    // })
    // .then((data) => {

        let onAluno = document.querySelector(".containerAluno")
        onAluno.classList.add("modelo")

        let onEx = document.querySelector(".containerEx")
        onEx.classList.remove("modelo")

        let onApa = document.querySelector(".containerAparelho")
        onApa.classList.add("modelo")

        let onFicha = document.querySelector(".containerFicha")
        onFicha.classList.add("modelo")
        
            data.forEach(alunos => {

                onEx.classList.add("modelo")

                let novoproduto = onFicha.cloneNode(true)
        
                novoproduto.classList.remove("modelo")
        
                novoproduto.querySelector("#id_ex").innerHTML = alunos.id_exercicio
                novoproduto.querySelector("#descricao").innerHTML = alunos.descricao
                novoproduto.querySelector("#grupo_muscular").innerHTML = alunos.grupo_muscular
                novoproduto.querySelector("#id_aparelho").innerHTML = alunos.id_aparelho
        
                document.querySelector(".tudao").appendChild(novoproduto)
            })
        
    // })
}