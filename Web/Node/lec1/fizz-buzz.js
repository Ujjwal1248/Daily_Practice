const n = 16;

let c3 = 1;
let c5 = 1;
var str = "";

for (let i = 1; i <= n; i++) {
    if (c3 === 3 && c5 === 5) {
        str += "FizzBuzz" + " ";
        c3 = 0;
        c5 = 0;
    } else if (c3 === 3) {
        str += "Fizz" + " ";
        c3 = 0;
    } else if (c5 === 5) {
        str += "Buzz" + " ";
        c5 = 0;
    } else {
        str += i + " ";
    }
    c3++;
    c5++;
}

console.log(str);