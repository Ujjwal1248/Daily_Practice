// var a = 100;
// function sam(){
//     var b = 200;
//     console.log(b);
//     function lol(){
//         var c = 300;
//         console.log(c);
//     }
//     lol();
// }
// console.log(a);
// sam();

let arr = [1, 2, 3, 4, 5, 6];

let square = arr.map(value => value * value);
let filter = square.filter(value => value > 10);
filter.forEach(value => console.log(value));


// Constructor Function
// Whenever you call a function with a new keyword in front of it then that function is not just a genral function it is known as constructor function
// The role of the constructor function is to create objects
// Generally in order to distinguish between a normal funciton and a constructor function we start a constructor function with a capital letter (Not Compulsory)

