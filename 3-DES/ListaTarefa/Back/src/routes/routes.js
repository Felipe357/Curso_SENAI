const Express = require('express');

const router = Express.Router();

const tarefasController = require("../controllers/tarefasController");

router.post("/listarStatus", tarefasController.listarStatus);
router.post("/cadTarefa", tarefasController.cadastrar);
router.put("/altTarefa", tarefasController.alteraFim);

module.exports = router;