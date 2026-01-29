import React, { useState, memo } from "react";

// function MyMemo({name}){
//     return <h1> Mera Naam : {name}</h1>
// }

let MyMemo = memo(function ({ name }) {
  return <h1>Mera Naam : {name}</h1>;
});

function Memo() {
  const [name, setName] = useState("Ujjwal 1");
  function nameChange() {
    setName("Hulla Hulla");
  }
  return (
    <>
      <MyMemo name={name} />
      <button onClick={nameChange}>Chande Krde</button>
      <MyMemo name="Ujjwal 2" />
      <MyMemo name="Ujjwal 3" />
      <MyMemo name="Ujjwal 4" />
    </>
  );
}

export default Memo;
