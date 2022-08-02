function addtable(nome, cargo, salario) {

    var tabela = document.getElementById(tabelao);
    var numeroLinhas = tabela.rows.length;
    var linha = tabela.insertRow(numeroLinhas);
    var celula1 = linha.insertCell(0);
    var celula2 = linha.insertCell(1);   
    var celula3 = linha.insertCell(2);
    celula1.innerHTML = nome; 
    celula2.innerHTML =  cargo; 
    celula3.innerHTML =  salario;
}