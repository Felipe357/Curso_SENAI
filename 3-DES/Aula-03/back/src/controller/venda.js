const { PrismaClient } = require('@prisma/client');

const prisma = new PrismaClient();

const create = async (req, res) => {
    let venda = await prisma.vendas.createMany({
        data: req.body,
        skipDuplicates: true
      });
    res.status(200).json(venda).end();
}

const readOne = async (req, res) => {
    let venda = await prisma.vendas.findUnique({
        where: {
            id: Number(req.params.id)
        },
        select: {
            id: true,
            data: true,
            funcionario: true,
            detalhe: true
        }
    });
    res.status(200).json(venda).end();
}

const read = async (req, res) => {
    let venda = await prisma.vendas.findMany({
        select: {
            id: true,
            data: true,
            funcionario: true,
            detalhe: true
        }
    });
    res.status(200).json(venda).end();
}

module.exports = {
    create,
    read,
    readOne
}