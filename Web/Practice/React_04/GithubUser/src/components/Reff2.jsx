import React, { useRef, useState } from 'react'

function Reff2() {
    // const [count, setCount] = useState(0);

    let countRef= useRef(0);
    function handleClick(){
        countRef.current++;
        console.log(countRef.current);
    }

  return (
    <div>
        {/* <button onClick={()=>setCount(count+1)}>Increment: {count}</button> */}
        <button onClick={handleClick}>Increment: {countRef.current}</button>
    </div>
  )
}

export default Reff2