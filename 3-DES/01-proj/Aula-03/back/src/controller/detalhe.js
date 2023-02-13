const { PrismaClient } = require('@prisma/client');

const prisma = new PrismaClient();

const create = async (req, res) => {
    let detalhe = await prisma.detalhe.createMany({
        data: req.body,
        skipDuplicates: true
      });
    res.status(200).json(detalhe).end();
}

const readOne = async (req, res) => {
    let detalhe = await prisma.detalhe.findUnique({
        where: {
            id: Number(req.params.id)
        },
        select: {
            produto:  true,
            venda: true,
            quantidade: true
        }
    });
    res.status(200).json(detalhe).end();
}

const read = async (req, res) => {
    let detalhes = await prisma.detalhe.findMany({
        select: {
            produto:  true,
            venda: true,
            quantidade: true
        }
    });
    res.status(200).json(detalhes).end();
}

module.exports = {
    create,
    read,
    readOne
}