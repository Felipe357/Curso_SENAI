const Express = require('express');

const router = Express.Router();

const ProdutosController = require("./controlles/itemController");

router.get("/patrimonio/itens", ProdutosController.listarItens);
router.post("/patrimonio/itens", ProdutosController.criarItens);
router.delete("/patrimonio/itens", ProdutosController.excluirItens);
// router.put("/produto", ProdutosController.editarProduto);



module.exports = router;