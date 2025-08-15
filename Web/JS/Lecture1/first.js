// let abc = 80;
// console.log(abc);

// let a = 10;
// let b = 10.15;
// let c = +Infinity;
// let d = -Infinity;

// console.log(a);
// console.log(b);
// console.log(c);
// console.log(d);

// console.log(typeof(a));
// console.log(typeof(b));
// console.log(typeof(c));
// console.log(typeof(d));

// let name = "Ujjwal Agrawal";
// let age = 19;

// let out = `Name: ${name}, Age: ${age}`
// console.log(out)

//  let arr=[];
// let arr=[10,20,'sam',true,40,'ayaan'];
// console.log(arr);
// console.log(arr[5]);

// let arr=[10,'ayaan',true,[100,[2000,3000,6000],200],'hussain'];
// console.log(arr[3]);
// console.log(arr[3][1]);
// console.log(arr[3][1][2]);

// object:- is a collection of Style Property(key-value pair) . objects are unordered in nature.

// let aya={
//     naam:"ayaan",
//     umar:20,
//     fav_color:"black"
// }
// console.log(aya);                   // all the keys are stored behind as string
// console.log(aya["umar"]);
// console.log(aya.umar);
// console.log(aya.fav_color);
let person={
    naam:"ayaan",
    umar:100,
    favcolor:"black"
}
Object.freeze(person);
console.log(person.umar);
console.log(person.favcolor);
console.log(person.naam);
console.log(person);
person.naam="maverick";
person.isMale=true;
delete person.favcolor
console.log(person);
console.log(typeof(NaN));

function sunio(x=100,y=200) {
    console.log(x);
    console.log(y);
    console.log(x+y);
}
sunio(50);

let person1 = {
    naam:"wanjad",
    kaam:"juice",
    greet:function mitthu(){
        console.log(`Ye GAREEB ${this.naam}`);
    }
}
console.log(person1.greet());
