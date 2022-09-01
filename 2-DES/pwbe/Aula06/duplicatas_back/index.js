const express = require("express");
const cors = require("cors");
const mysql = require("mysql");

const app = express();

const con = mysql.createConnection({
    user: 'root',
    host: 'localhost',
    database: 'duplicatas'
});

app.use(cors())

app.get('/duplicatas/clientes',(req,res)=>{
    let string = "select * from vw_clientes";
    con.query(string,(err,result)=>{
        if (err==null) {
            let repReg = []
            let tel = []
            let tipo = []
            result.forEach(c => {
                if (result.indexOf(c) != (result.length -1)) {
                    if (result[(result.indexOf(c)+1)].cod_cli == c.cod_cli) {
                        console.log((result.indexOf(c)+1) + " - O proximo repete")
                        tel.push(c.telefone)
                        tipo.push(c.tipo)
                        repReg.push(result[result.indexOf(c)+1])
                    } else if(result[(result.indexOf(c)-1)].cod_cli == c.cod_cli && result.indexOf(c) > 0) {
                        console.log((result.indexOf(c)+1) + " - Ultimo da repeticao")
                        tel.push(c.telefone)
                        tipo.push(c.tipo)
                        result[result.indexOf(c)-(tel.length-1)].telefone = []
                        for (let i = 0; i < tel.length; i++) {
                            result[result.indexOf(c)-(tel.length-1)].telefone.push({
                                tipo: tipo[i],
                                telefone: tel[i]
                            })
                        }
                        tel = []
                        tipo = []
                    } else {
                        console.log((result.indexOf(c)+1) + " - Nao repete")
                        c.telefone = [{
                            tipo: c.tipo,
                            telefone: c.telefone
                        }]
                        tel = []
                        tipo = []
                    }
                } else {
                    if ((result.indexOf(c)-1).cod_cli == c.cod_cli) {
                        console.log((result.indexOf(c)+1) + " - Ultimo da repeticao")
                        (result.indexOf(c)-1).telefone.push(c.cod_cli)
                        repReg.push(c)
                        tel.push(c.telefone)
                        tipo.push(c.tipo)
                        for (let i = 0; i < tel.length; i++) {
                            result[result.indexOf(c)-(tel.length-1)].telefone.push({
                                tipo: tipo[i],
                                telefone: tel[i]
                            })
                        }
                        tel = []
                        tipo = []
                    } else {
                        console.log((result.indexOf(c)+1) + " - Nao repete")
                        c.telefone = [{
                            tipo: c.tipo,
                            telefone: c.telefone
                        }]
                        tel = []
                        tipo = []
                    }
                }
            });
            console.log(repReg)
            repReg.forEach(reg => {
                result.splice(result.indexOf(reg), 1)
            });
            result.forEach(c => {
                delete c.tipo
            })
            res.json(result)
        } else {
            res.json(err)
        }
    })
});

app.get('/duplicatas/duplicatas',(req,res)=>{
    let string = "select * from duplicatas";
    con.query(string,(err,result)=>{
        if(err == null){
            res.json(result);
        }
    });
});

app.get('/duplicatas/duplicatasaberto',(req,res)=>{
    let string = "select * from vw_duplicatas_aberto";
    con.query(string,(err,result)=>{
        if(err == null){
            res.json(result);
        }
    });
});

app.get('/duplicatas/duplicataspagas',(req,res)=>{
    let string = "select * from vw_duplicatas_pagas";
    con.query(string,(err,result)=>{
        if(err == null){
            res.json(result);
        }
    });
});

app.listen(3000, () => {
    console.log("Respondendo na porta 3000");
});