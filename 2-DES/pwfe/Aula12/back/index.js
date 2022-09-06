const Express = require('express')
const cors = require('cors')
const mysql = require('mysql')

const conDB = mysql.createConnection({
    "host": "localhost",
    "user": "root",
    "database": "lojinha"
})

const app = Express()
app.use(Express.json())
app.use(cors())

app.get("/produtos", (req, res) => {
    let query = "select * from produtos"

    conDB.query(query, (err, result) => {
        if(err == null) {
            res.json(result).status(200).end()
        }else {
            res.json(err).status(402).end()
        }
    })
})

app.post("/produtos", (req, res) => {

    let query = `insert into produtos values (default, "${req.body.cod}", "${req.body.nome}", ${req.body.qntd}, ${req.body.preco})`

    conDB.query(query, (err, result) => {
        if(err == null){
            res.status(201).json(req.body).end()
        } else {
            res.status(400).json(err).end()
        }
    })

})

app.delete("/produtos", (req, res) => {
    let query = `delete from produtos where cod = '${req.body.cod}'`

    conDB.query(query, (err, result) => {
        if(err == null) {
            res.status(200).json(req.body).end()
        } else {
            res.status(400).json(err).end()
        }
    })
})

app.put("/produtos", (req, res) => {
    let query = `update produtos set cod = '${req.body.cod}', nome = '${req.body.nome}', qntd = ${req.body.qntd}, preco = ${req.body.preco} where cod = '${req.body.cod}' `

    conDB.query(query, (err, result) => {
        if(err == null) {
            res.status(200).json(req.body).end()
        } else {
            console.log(err)
            res.status(400).json(err).end()
        }
    })
})

app.listen(5000, () => {
    console.log("Respondendo na porta 5000");
});

