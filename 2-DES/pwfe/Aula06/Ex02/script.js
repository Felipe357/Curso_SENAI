//Apenas analistas e desenvolvedores podem possuir Admin os demais são apenas leitores;
//Apenas cargos de nivel 3 ou superior podem ser Admin;
//Cargos inferiores a 3 podem ser removidos da lista de acesso;
var funcionarios = [
	{
		"funcionario":"Sancho Cedraz",
		"cargo":{
			"nome":"Analista",
			"nivel":2
		},
		"autorizado":true
	},		
	{
		"funcionario":"Ionara Pederneiras",
		"cargo":{
			"nome":"Técnico",
			"nivel":2
		},
		"autorizado":true
	},
	{
		"funcionario":"Filipe Castanho",
		"cargo":{
			"nome":"Desenvolvedor",
			"nivel":1
		},
		"autorizado":false
	},
	{
		"funcionario":"Lívia Bicalho",
		"cargo":{
			"nome":"Analista",
			"nivel":3
		},
		"autorizado":true
	},
	{
		"funcionario":"Mauro Varanda",
		"cargo":{
			"nome":"Desenvolvedor",
			"nivel":3
		},
		"autorizado":false
	},	
	{
		"funcionario":"Sandro Rosário",
		"cargo":{
			"nome":"Técnico",
			"nivel":3
		},
		"autorizado":true
	}
]

function carregar(){
    funcionarios.forEach(func =>{
        let row = document.createElement("tr")
        let funcio = document.createElement("td")
        let nome = document.createElement("td")
        let nivel = document.createElement("td")
        let autorizado = document.createElement("td")
        let remove = document.createElement("td")

        let removeImg = document.createElement("img")

        funcio.innerHTML = func.funcionario
        nome.innerHTML = func.cargo.nome
        nivel.innerHTML = func.cargo.nivel


        if(func.autorizado){
            autorizado.innerHTML = "sim"
            autorizado.style.color = "orange"
            
        }else{
            autorizado.innerHTML = "nao"
            autorizado.style.color = "grey"
        }

        if(func.cargo.nivel < 3){
            removeImg.setAttributeNS(null, 'onclick', 'removerItem(this)')
            removeImg.style.cursor = "pointer"
        }else{
            removeImg.style.opacity = ".3"
            removeImg.style.cursor = "pointer"
            
        }

        removeImg.src = "https://cdn-icons-png.flaticon.com/512/2197/2197788.png"
        removeImg.style.width = "40px"


        row.appendChild(funcio)
        row.appendChild(nome)
        row.appendChild(nivel)
        row.appendChild(autorizado)
        row.appendChild(removeImg)

        document.querySelector(".tabela").appendChild(row)
}) 
}
function removerItem(e) {
    e.parentNode.remove();
}