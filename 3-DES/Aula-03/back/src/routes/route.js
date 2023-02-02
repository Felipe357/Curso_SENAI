const express = require('express');

const router = express.Router();

const Setor = require('../controller/setor');
const Produto = require('../controller/produto');
const Funcionario = require('../controller/funcionario');

router.post('/setor', Setor.create);
router.get('/setor', Setor.read);
router.get('/setor/:id', Setor.readOne);

router.post('/produto', Produto.create);
router.get('/produto', Produto.read);
router.get('/produto/:id', Produto.readOne);

router.post('/funcionario', Funcionario.create);
router.get('/funcionario', Funcionario.read);
router.get('/funcionario/:id', Funcionario.readOne);

module.exports = router;