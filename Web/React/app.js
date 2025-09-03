// let rootEl = document.getElementById("root");

// // let h1 = React.createElement("h1", null, "Hello World");
// let h1 = React.createElement("h1", {id : "ujjwal", className:"agrawal"}, "Hello World");

// let root = ReactDOM.createRoot(rootEl);

// root.render(h1);

let rootEl = document.getElementById("root");

// let h1 = React.createElement("div", null, 
//     React.createElement("div", null,
//         React.createElement("h1", null, "Hello World"),
//     ),
// );
// let h1 = React.createElement("div", null,
//     [React.createElement("div", null,
//         React.createElement("h1", null, "Hello World"),
//     ),
//     React.createElement("div", null,
//         React.createElement("h1", null, "Hello World"),
//     )]
// );

// let root = ReactDOM.createRoot(rootEl);

// root.render(h1);
let h1 = <div>
    <div>
        <h1>Hello World</h1>
    </div>
    <div>
        <h1>Hello World</h1>
    </div>
</div>;

let root = ReactDOM.createRoot(rootEl);

root.render(h1);