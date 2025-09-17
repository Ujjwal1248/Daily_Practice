// const express = require('express');
// const app = express();
// const mongoose = require('mongoose');
// const path = require('path');

// app.set('view engine', 'ejs');
// app.set('views', path.join(__dirname, 'views'));

// mongoose.connect('mongodb://127.0.0.1:27017/test')
//   .then(() => console.log('Connected!'));

// app.get('/', (req, res) => {
//     res.send('Hello, World!');
// });

// // app.get('/about', (req, res) => {
// //     res.render('about');
// // });

// app.get('/about/:name', (req, res) => {
//     const name = req.params.name;
//     res.render('about', { name });
// });


// app.listen(3000, () => {
//     console.log('Server is running on http://localhost:3000');
// });




const str1 = "hhh";
const str2 = "hhh";

obj1 = {
    name: "hhh",
    age: 18,
    address: {
        city: "New York",
        zip: "10001"
    }
}
console.log(age);


class Person {
    constructor(name, age) {
        age = 18;
        name = true;
    }
    greet() {
        console.log(`Hello, my name is ${this.name} and I am ${this.age} years old.`);
    }
}

