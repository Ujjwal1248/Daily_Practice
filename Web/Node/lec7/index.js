const express = require('express');
const app = express();
const mongoose = require('mongoose');
mongoose.connect('mongodb+srv://ujjwalagrawal1248:bG0WscuyvDIGFrbf@cluster0.swiiw0q.mongodb.net/')
.then(() => {
    console.log('MongoDB connected');
})
.catch(err => {
    console.error('MongoDB connection error:', err);
});

app.get('/', (req, res) => {
    res.send('Hello World!');
});

app.listen(8080, () => {
    console.log('Server is running on http://localhost:8080');
});