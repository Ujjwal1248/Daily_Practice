import React from 'react'

function Jugaad() {
    function help(d){
        console.log(d,"parent");
    }
  return (
    <div><Child help={help} /></div>
  )
}

function Child(){
    let data = "nobita";
    help(data);
    return(
        <div>
            
        </div>
    )
}

export default Jugaad