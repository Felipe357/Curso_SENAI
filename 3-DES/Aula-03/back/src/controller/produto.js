const { PrismaClient } = require('@prisma/client');

const prisma = new PrismaClient();

const create = async (req, res) => {
    let produto = await prisma.produto.create({
        data: req.body
    });
    res.status(200).json(produto).end();
}

const readOne = async (req, res) => {
    let produto = await prisma.produto.findUnique({
        where: {
            id: Number(req.params.id)
        },
        select: {
            nome: true,
            valor: true,
            setor: true,
            detalhe: true
        }
    });
    res.status(200).json(produto).end();
}

const read = async (req, res) => {
    let produtos = await prisma.produto.findMany({
        select: {
            nome: true,
            valor: true,
            setor: true,
            detalhe: true
        }
    });
    res.status(200).json(produtos).end();
}

module.exports = {
    create,
    read,
    readOne
}