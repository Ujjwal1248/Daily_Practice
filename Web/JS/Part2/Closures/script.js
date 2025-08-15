// function a() {
//     var ex = 10;
//     var ex2 = 100;
//     function b() {
//         console.log(ex2);
//     }
//     return b;
// }

// let returnedValue = a();
// console.log(returnedValue);
// returnedValue();

// function fun() {
//     var a = 10;
//     var b = 20;
//     function foo() {
//         console.log(a);
//         console.log(b);
//     }
// }

// function outer(){
//     var a = 10;
//     function inner(){
//         a++;
//         var b = 20;
//         function innermost(){
//             b++;
//             console.log(b);
//         }
//         return innermost;
//     }
//     return inner;
// }

// let f1 = outer();
// let f11 = f1();
// f11();
// let f12 = f1();
// f12();


function increase(){
    let secret_variable = 0;
    function getsecret(){
        secret_variable++;
        console.log(secret_variable);
    }
    return getsecret;
}

let g= increase();
g();
g();