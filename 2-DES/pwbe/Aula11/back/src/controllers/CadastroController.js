const Cadastro = require('../models/cadastro');
const con = require('../dao/dbblobs');
const multer = require('multer');
const upload = multer().single('foto')
const fs = require('fs');

const cadastrarCliente = async (req, res) => {
    upload(req, res, function (err) {
        if (err)
            res.status(500).json({ error: 1, payload: err }).end();
        else {
            let string = Cadastro.toCreate(req.body, req.file);
            con.query(string, (err, result) => {
                if (err == null) {
                    //res.status(201).json(dados).end();
                    res.redirect('http://127.0.0.1:5500/front/index.html')
                } else {
                    res.status(500).json(err).end();
                }
            });
        }
    });
}

const listarCadastros = (req, res) => {
    let string = Cadastro.toReadAll();
    con.query(string, (err, result) => {
        if (err == null) {
            res.json(Cadastro.toAscii(result)).end();
        }
    });
}

module.exports = {
    listarCadastros,
    cadastrarCliente
}