const { PrismaClient } = require('@prisma/client');

const prisma = new PrismaClient();

const create = async (req, res) => {
    let funcionario = await prisma.funcionario.create({
        data: req.body
    });
    res.status(200).json(funcionario).end();
}

const readOne = async (req, res) => {
    let funcionario = await prisma.funcionario.findUnique({
        where: {
            id: Number(req.params.id)   
        },
        select: {
            nome: true,
            salario: true,
            setor_id: true
        }
    });
    res.status(200).json(funcionario).end();
}

const read = async (req, res) => {
    let funcionarios = await prisma.funcionario.findMany();
    res.status(200).json(funcionarios).end();
}

module.exports = {
    create,
    read,
    readOne
}