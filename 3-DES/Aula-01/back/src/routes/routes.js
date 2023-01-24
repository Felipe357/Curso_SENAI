const Express = require('express');

const router = Express.Router();

const entregadoresController = require("./controllers/");
const pedidosController = require("./controllers/pedidosController.js");

router.get("/listarPedidos", pedidosController.listarPedidos);
router.post("/cadPedido", pedidosController.cadastarPedidos);
router.put("/altPedidoEntrega", pedidosController.alterarPedidosEntrega);
router.put("/altPedidoFim", pedidosController.alterarPedidoFim);
router.delete("/delPedido", pedidosController.deletarPedido);

router.get("/listarEntregadores", entregadoresController);
router.get("/buscarEntregador/:id", entregadoresController);

module.exports = router;