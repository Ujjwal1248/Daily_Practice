import React from 'react'

function Driling() {
    let data = "main hun Gian";
  return (
    <div>
        <A gian={data}/>
    </div>
  )
}

function A({gian}){ return(<h1><B gian={gian} /> </h1>)}
function B({gian}){ return(<h1><C gian={gian} /> </h1>)}
function C({gian}){ return(<h1><D gian={gian} /> </h1>)}
function D({gian}){ return(<h1> naam: {gian} </h1>)}

export default Driling