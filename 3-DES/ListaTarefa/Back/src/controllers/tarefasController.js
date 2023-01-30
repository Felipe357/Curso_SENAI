const { PrismaClient } = require('@prisma/client')

const prisma = new PrismaClient()

const cadastrar = async (req, res) => {
    const tarefa = await prisma.tarefa.create({
        data: req.body
    })
    res.status(200).json(tarefa).end()
}

const alteraFim = async (req, res) => {
    const tarefa = await prisma.tarefa.update({
        where: {
            id: Number(req.body.id)
        },
        data: req.body
    })

    res.status(200).json(tarefa).end()
}

const listarStatus = async (req, res) => {
    const tarefa = await prisma.tarefa.findMany()
    res.status(200).json(tarefa).end()
}


module.exports = {
    listarStatus,
    cadastrar,
    alteraFim
}