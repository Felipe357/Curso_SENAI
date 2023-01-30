const express = require('express');

const router = require('./routes/routes');

const app = express();
app.use(express.json());
app.use(router);

app.listen(5000, () => {
    console.log("Respondendo na porta 5000");
});