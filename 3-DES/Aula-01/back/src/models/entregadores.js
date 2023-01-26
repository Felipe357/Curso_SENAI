const toReadAll = () => {
    return 'SELECT * FROM entregadores'
}
const toRead = (model) => {
    return `SELECT * FROM pedidos where id_entregador = ${model.id}`
}

const login = (model) => {
    return `SELECT * FROM entregadores where email = '${model.email}'`
}

module.exports = {
    toReadAll,
    toRead,
    login
}