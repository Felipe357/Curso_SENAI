const Express = require('express');

const router = Express.Router();

const ProdutosController = require("./controllers/ProdutosController");

router.get("/produtos", ProdutosController.listarProdutos);
router.get("/produtos/:cod", ProdutosController.listaProduto);
router.post("/produtos", ProdutosController.cadastrarProduto);
router.delete("/produtos", ProdutosController.excluirProduto);
router.put("/produtos", ProdutosController.editarProduto);

const funcionariController = require("./controllers/FuncionariosController");

router.get("/funcionario", funcionariController.listarFunc);
router.get("/funcionario/:matricula", funcionariController.listaFunc);
router.post("/funcionario", funcionariController.cadastrarFunc);
router.delete("/funcionario", funcionariController.excluirFunc);
router.put("/funcionario", funcionariController.editarFunc);


module.exports = router;