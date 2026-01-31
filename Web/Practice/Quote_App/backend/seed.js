const mongoose = require('mongoose');
const Quotes = require('./models/Quote');

let dummyQuotes = [
    {
        author : "Albert Einstein",
        text : "Life is like riding a bicycle. To keep your balance you must keep moving."
    },
    {
        author : "Marilyn Monroe",
        text : "I'm selfish, impatient and a little insecure. I make mistakes, I am out of control and at times hard to handle. But if you can't handle me at my worst, then you sure as hell don't deserve me at my best."
    },
    {
        author : "Oscar Wilde",
        text : "Be yourself; everyone else is already taken."
    },
    {
        author : "Frank Zappa",
        text : "So many books, so little time."
    }
]

async function seedDB(){
    await Quotes.insertMany(dummyQuotes);
    console.log("Database Seeded");
}

module.exports = seedDB;