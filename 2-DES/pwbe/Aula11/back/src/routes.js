const express = require('express');
const router = express.Router();

const Cadastro = require("./controllers/CadastroController");

router.get("/blobs/cadastros", Cadastro.listarCadastros);
router.post("/blobs/cadastros", Cadastro.cadastrarCliente);

module.exports = router;