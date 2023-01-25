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

module.exports = {
    listarEntregadores,
    Entregadores
}