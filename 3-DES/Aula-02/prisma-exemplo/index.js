const express = require("express")
const cors = require("cors")

const app = express()
const router = require('./src/routes/routes')

app.use(cors())
app.use(express.json())
app.use(router)

app.listen(3200, () => {
    console.log("Rodando: 3200")
})