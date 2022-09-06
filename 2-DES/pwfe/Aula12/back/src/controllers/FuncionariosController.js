const mysql = require('mysql');

const conDB = mysql.createConnection({
    "host": "localhost",
    "user": "root",
    "database": "lojinha"
});

function listarFunc(req, res) {
    let query = "SELECT * FROM funcionario";

    conDB.query(query, (err, result) => {
        if(err == null) {
            res.json(result).status(200).end();
        }else {
            res.json(err).status(400).end();
        }
    })
};

function listaFunc(req, res) {
    let query = `SELECT * FROM funcionario WHERE matricula = '${req.params.matricula}'`;
    
    conDB.query(query, (err, result) => {
        if(err == null) {
            res.status(200).json(result).end();
        }else {
            res.status(400).json(err).end();
        }
    })
};

function cadastrarFunc(req, res) {
    let query = `INSERT INTO funcionario VALUES (DEFAULT, '${req.body.matricula}', '${req.body.nome}', '${req.body.cargo}', ${req.body.salario}, '${req.body.cpf}')`;

    conDB.query(query, (err, result) => {
        if(err == null) {
            res.status(201).json(req.body).end();
        }else {
            res.status(400).json(err).end();
        }
    });
};

function excluirFunc(req, res) {
    let query = `DELETE FROM funcionario WHERE matricula = '${req.body.matricula}'`;

    conDB.query(query, (err, result) => {
        if(err == null) {
            res.status(200).json(req.body).end();
        }else {
            res.status(400).json(err).end();
        }
    });
};

function editarFunc(req, res){
    let query = `UPDATE funcionario SET matricula = '${req.body.matricula}', nome = '${req.body.nome}', cargo = '${req.body.cargo}', salario = ${req.body.salario} WHERE matricula = '${req.body.matricula}'`;

    conDB.query(query, (err, result) => {
        if(err == null) {
            res.status(200).json(req.body).end();
        }else {
            res.status(400).json(err).end();
        }
    });
};

module.exports = {
    listarFunc,
    listaFunc,
    cadastrarFunc,
    excluirFunc,
    editarFunc
}