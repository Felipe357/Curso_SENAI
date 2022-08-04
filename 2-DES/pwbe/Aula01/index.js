const express = require('express')
const app = express()

app.use(express.json())

app.get('/projeto01', (req, res) => {
    res.json("Alô Mundo")
})

app.listen(3000, ()=>{
    console.log("Hello world!")
})