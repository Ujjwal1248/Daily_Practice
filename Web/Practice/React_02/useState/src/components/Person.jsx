import React from 'react'
import { useState } from 'react';

function Person({ name }) {
    const [currentName, setCurrentName] = useState(name);
    function changeName(){
        console.log(currentName);
        setCurrentName("Anonymous");
        console.log(currentName);
    }
  return (
    <>
        <div>Name : {currentName}</div>
        <button onClick={changeName}>LogOut</button>
    </>
  )
}

export default Person