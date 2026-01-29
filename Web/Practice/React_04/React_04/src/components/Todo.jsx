import React, { useState } from "react";

function Todo() {
  const [arr, setArr] = useState([
    { title: "Game", description: "To play the Game" },
    { title: "SkateBoard", description: "SkateBoarding" },
    { title: "Walk", description: "To go for a 3 km walk" },
    { title: "Gym", description: "Break my own PR" },
  ]);
  return (
    <>
      <Todos arrayy={arr} />
      <AddTodo />
    </>
  );

  function AddTodo() {
    let [inp1, setInp1] = useState("");
    let [inp2, setInp2] = useState("");
    function change1(e) {
      setInp1(e.target.value);
    }
    function change2(e) {
      setInp2(e.target.value);
    }
    function handleAdd() {
      setArr([...arr, { title: inp1, description: inp2 }]);
    }
    return (
      <>
        <input
          type="text"
          onChange={change1}
          placeholder="Title"
          value={inp1}
        />
        <br />
        <input
          type="text"
          onChange={change2}
          placeholder="Description"
          value={inp2}
        />
        <br />
        <button onClick={handleAdd}>Add Todo</button>
      </>
    );
  }

  function Todos(props) {
    return (
      <>
        {props.arrayy.map((item, index) => {
          return (
            <>
              <h2>Title : {item.title}</h2>
              <h2>Description : {item.description}</h2>
              <hr />
            </>
          );
        })}
      </>
    );
  }
}

export default Todo;
