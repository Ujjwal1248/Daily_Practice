import React, { useEffect, useRef, useState } from 'react'

function Reff() {

    const[marks, setMarks] = useState(95);
    let spanEl = useRef();
    useEffect(()=>{
        setTimeout(function(){
            spanEl.current.innerText = 45;
        }, 5000)
    },[])
  return (
    <div>
        <h2>Math Marks : <span ref={spanEl}>{marks}</span></h2>
    </div>
  )
}

export default Reff