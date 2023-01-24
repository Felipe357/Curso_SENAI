const toReadAll = () => {
    return 'SELECT * FROM entregadores'
}
const toRead = (model) => {
    return `SELECT * FROM entregadores where id_entregador = ${model.id_entregador}`
}

module.exports = {
    toReadAll,
    toRead
}