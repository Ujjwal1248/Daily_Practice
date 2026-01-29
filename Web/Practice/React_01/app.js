
let r1 = document.getElementById("root");

let p1 = React.createElement("p", {id:"para1", className:"graph"}, "This is parra 1");
let root = ReactDOM.createRoot(r1);

root.render(p1);