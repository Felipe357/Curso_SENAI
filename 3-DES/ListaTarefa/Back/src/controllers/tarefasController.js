const Item = require('../models/terefas');
const con = require('../models/tarefasDAO');

const cadastrar = (req, res) => {
    con.query(Item.toCreate(req.body), (err, result) => {
        if (err == null)
            res.status(201).json(result).end();
        else
            if (err.sqlState == 23000)
                res.status(406).json(err).end();
            else
                res.status(500).json(err).end();
    });
}

const alteraFim = (req, res) => {
    con.query(Item.toCom(req.body), (err, result) => {
        if (err == null)
            if (result.affectedRows > 0)
                res.status(200).json(result).end();
            else
                res.status(404).end();
        else
            res.status(500).json(err).end();
    });
}

const listarStatus = (req, res) => {
    con.query(Item.toReadA(req.body), (err, result) => {
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
    listarStatus,
    cadastrar,
    alteraFim
}