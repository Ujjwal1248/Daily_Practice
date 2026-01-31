const express = require('express');
const app = express();
const mongoose = require('mongoose');
const seedDB = require('./seed');
const cors = require('cors');
const quotesRoutes = require('./apis/quoteRoutes')

mongoose.connect('mongodb://127.0.0.1:27017/quotesApp')
.then(()=>console.log("Connected to MongoDB"))
.catch((err)=>console.log("Failed to connect to MongoDB", err));

app.use(cors());
app.use(express.json());

app.get('/hello', (req, res)=>{
    res.send("Hello World");
});

app.use(quotesRoutes);
// seedDB();

app.listen(8080, ()=>{
    console.log("Server is running on port 8080");
})