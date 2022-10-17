function carregar() {
    fetch("http://localhost:3000/departamento/read")
        .then(res => { return res.json() })
        .then(departamento => {
            departamento.forEach(dep => {

                let linha = document.createElement("tr")

                let coluna1 = document.createElement("td")
                coluna1.innerHTML = dep.Cod_Depto

                let coluna2 = document.createElement("td")
                coluna2.innerHTML = dep.Nome_Depto

                let coluna3 = document.createElement("td")
                let btn = document.createElement("button")
                let img = document.createElement("img")
                img.src = "https://cdn-icons-png.flaticon.com/512/7078/7078826.png"
                img.style.width = "25px"
                img.style.height = "25px"
                btn.appendChild(img)
                btn.addEventListener("click", () => {excluir(dep.Cod_Depto)})
                coluna3.appendChild(btn)

                linha.appendChild(coluna1)
                linha.appendChild(coluna2)
                linha.appendChild(coluna3)


                document.querySelector("#info").appendChild(linha)

            })

        })
}

function excluir(e) {

    let data = e

    fetch(`http://localhost:3000/departamento/del/${data}`, {
        method: "DELETE",
    })
        .then((res) => { return res.json() })
        .then(resp => {
            console.log(resp)
            if (resp !== undefined) {
                alert("Departamanto excluido com sucesso !")
                window.location.reload()
            } else {
                alert("Não foi possivél excluir o departamento !")
            }
        })

}