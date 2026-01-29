import React from 'react'
import { useState } from 'react';

function Counter() {
    let count = 0;
    const [counter, setCounter] = useState(count);
    function increase(){
        setCounter(counter + 1);
    }
    function decrease(){
        setCounter(counter - 1);
    }
  return (
    <>
        <button onClick={increase}>+</button>
        &nbsp;{counter}&nbsp;
        <button onClick={decrease}>-</button>
    </>
  )
}

export default Counter