const express = require('express');
const mysql = require('mysql');
const app = express();

const con = mysql.createConnection({
    user : 'root',
    host : 'localhost',
    database : 'pedidos'
});

app.use(express.json());

// app.get('/aula02',(req, res)=>{
//     let nomeCliente = req.query.nomeCliente;
//     let clienteEndereco = req.query.clienteEndereco;
//     let sobreCliente = req.query.sobreCliente;
//     let string = `insert into clientes value(null, '${nomeCliente}','${clienteEndereco}','${sobreCliente}')`;
//     con.query(string, (err, result)=>{
//         if(err == null){
//             res.json("Dados recebidos com sucesso e enviados para o nosso banco de dados");
//         } else {
//             res.json("Dados recebidos com sucesso, porém não conseguimos enviar para o nosso banco de dados");
//         }
//     })
// });

app.get('/aula02',(req, res)=>{
    let id = req.query.id;
    let clienteTelefone = req.query.clienteTelefone;
    let string = `insert into telefones value('${id}', '${clienteTelefone}')`;
    con.query(string, (err, result)=>{
        if(err == null){
            res.json("Dados recebidos com sucesso e enviados para o nosso banco de dados");
        } else {
            res.json("Dados recebidos com sucesso, porém não conseguimos enviar para o nosso banco de dados");
        }
    })
});

app.listen(3000,()=>{
    console.log("Respondendo na porta 3000");
});