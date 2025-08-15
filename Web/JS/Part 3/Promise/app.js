

let p1 = new Promise((resolve, reject) => {
    let data = "Hello World";
    let err = "Error";
    resolve(data);
});

console.log(p1);