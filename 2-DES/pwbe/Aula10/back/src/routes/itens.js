const express = require('express');
const router = express.Router();

const sol = require("../controller/solController");

router.post("/solicitacoes/iten", sol.criarItem);
router.get("/solicitacoes/itens", sol.listarItens);


module.exports = router;