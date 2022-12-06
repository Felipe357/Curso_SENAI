const express = require('express')
const router = express.Router()

const middle = require("../middleware/middleware")
const user = require("../controller/userController")

router.post('/login', user.login)
router.delete('/delete/:id', middle.validaAcesso, user.remover)


module.exports = router