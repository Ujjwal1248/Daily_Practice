export function Sam() {
    let a = 10;
    let b = "sam";
    let c = true;
    let d = false;
    let e = null;
    let f = undefined;
    function budbak(){
        console.log("I am budbak function");
    }
    function autaat(){
        console.log("I am autaat function");
    }
    return (
        <div>
            <h1>Welcome Sam</h1>
            <h1>{a}</h1>
            <h1>{b}</h1>
            <h1>{JSON.stringify(c)}</h1>
            <h1>{JSON.stringify(d)}</h1>
            <h1>{JSON.stringify(e)}</h1>
            <h1>{JSON.stringify(f)}</h1>
            <button onClick={budbak}>Click me</button>
            <button onClick={()=>autaat()}>Click me</button>
        </div>
    )
}
