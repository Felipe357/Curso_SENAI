const Item = require('../models/entregadores');
const con = require('../models/entregasDAO');

const listarEntregadores = (req, res) => {
    con.query(Item.toReadAll(), (err, result) => {
        if (err == null)
            res.status(201).json(result).end();
        else
            if (err.sqlState == 23000)
                res.status(406).json(err).end();
            else
                res.status(500).json(err).end();
    });
}

const Entregadores = (req, res) => {
    con.query(Item.toRead(req.params), (err, result) => {
        if (err == null)
            res.status(201).json(result).end();
        else
            if (err.sqlState == 23000)
                res.status(406).json(err).end();
            else
                res.status(500).json(err).end();
    });
}

const login = (req, res) => {
    con.query(Item.login(req.body), (err, result) => {
        if (err == null) {
            if (req.body.senha === result[0].senha) {
                res.status(201).json(result).end();
            } else {
                res.status(404).json({"msg": 'Vacilou comeu cocô'}).end()
            }
        }
        else{
            if (err.sqlState == 23000)
                res.status(406).json(err).end();
            else
                res.status(500).json(err).end();
        }
    });
}

module.exports = {
    listarEntregadores,
    Entregadores,
    login
}