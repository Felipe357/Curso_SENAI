const { PrismaClient } = require('@prisma/client');

const prisma = new PrismaClient();

const create = async (req, res) => {

    let idF

    let funcionario = await prisma.funcionario.findMany({
        where: req.body
    })

    if (funcionario.length !== 0) {
        let venda = await prisma.vendas.createMany({
            data: { funcionario_id: parseInt(funcionario[0].id) },
            skipDuplicates: true
        })
        res.status(200).json(venda).end();
    } else {
        res.status(200).json("Nome do funcionário incorreto").end();
    }

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
            funcionario: {
                select: {
                    nome: true,
                    setor: {
                        select: {
                            nome:true
                        }
                    }
                }
            },
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