const toCreate = (model) => {
    return `INSERT INTO tarefa VALUES (default, '${model.descricao}', '${model.horarioInicio}', '${model.horarioFim}', ${model.status});`;
}

const toCom = (model) => {
    return `UPDATE tarefa SET horarioFim = '${model.fim}', status = ${model.status} WHERE id = ${model.id}`
}

const toReadA = (model) => {
    return `SELECT * FROM tarefa WHERE status = ${model.status}`
}

module.exports = {
    toCreate,
    toReadA,
    toCom
}