import React, { useState } from 'react'

function Batching() {
    const[num, ChangeNum] = useState(0);
    // function handleClick(){
    //     ChangeNum(num + 1);
    //     ChangeNum(num + 1);
    //     ChangeNum(num + 1);
    // }
    //Using Batching
    function handleClick(){
        ChangeNum((num)=>num+1);
        ChangeNum((num)=>num+1);
        ChangeNum((num)=>num+1);
        ChangeNum((num)=>num+1);
        ChangeNum((num)=>num+1);
        ChangeNum((num)=>num+1);
    }
  return (
    <>
    <h1>Count : {num}</h1>
    <button onClick={handleClick}>Click Me</button>
    </>
  )
}

export default Batching