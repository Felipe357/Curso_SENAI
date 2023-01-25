const Express = require('express');

const router = Express.Router();

const entregadoresController = require("../controllers/entregadoresController");
const pedidosController = require("../controllers/pedidosController");

router.get("/listarPedidos", pedidosController.listarPedidos);
router.post("/cadPedido", pedidosController.cadastrarPedidos);
router.put("/altPedidoEntrega", pedidosController.alterarPedidoEntrega);
router.put("/altPedidoFim", pedidosController.alterarPedidoFim);
router.delete("/delPedido", pedidosController.deletarPedido);

router.get("/listarEntregadores", entregadoresController.listarEntregadores);
router.get("/buscarEntregador/:id", entregadoresController.Entregadores);

module.exports = router;