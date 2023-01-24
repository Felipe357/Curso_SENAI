const Item = require('../models/pedidos');
const con = require('../models/entregasDAO');

const cadastrarPedidos = (req, res) => {
    con.query(Item.toCreate(req.body), (err, result) => {
        if (err == null)
            res.status(201).end();
        else
            if (err.sqlState == 23000)
                res.status(406).json(err).end();
            else
                res.status(500).json(err).end();
    });
}

const alterarPedidoEntrega = (req, res) => {
    con.query(Item.toUpdateEntrega(req.body), (err, result) => {
        if (err == null)
            if (result.affectedRows > 0)
                res.status(200).end();
            else
                res.status(404).end();
        else
            res.status(500).json(err).end();
    });
}

const alterarPedidoFim = (req, res) => {
    con.query(Item.toUpdateFim(req.body), (err, result) => {
        if (err == null)
            if (result.affectedRows > 0)
                res.status(200).end();
            else
                res.status(404).end();
        else
            res.status(500).json(err).end();
    });
}


const listarPedidos = (req, res) => {
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

const deletarPedido = (req, res) => {
    con.query(Item.toDelete, (err, result) => {
        if(err == null) {
            res.status(200).json(req.body).end();
        }else {
            res.status(400).json(err).end();
        }
    })
}


module.exports = {
    listarPedidos,
    cadastrarPedidos,
    alterarPedidoEntrega,
    alterarPedidoFim,
    deletarPedido
}