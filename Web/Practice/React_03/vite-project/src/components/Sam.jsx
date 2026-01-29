import React, { useState } from 'react'

function Head(props){
    return(
        <h1>Name: {props.name}</h1>
    )
}
function BadaHead(props){
    const[namm, setNaam] = useState(props.name);
    function chnageName(){
        setNaam(Math.floor(Math.random()*10));
    }
    return(
        <>
            <h1>Name: {namm}</h1>
            <button onClick={chnageName}>Change the Naam</button>
        </>
    )
}

function Sam() {
  return (
    <>
        <Head name = "mayank"/>
        <BadaHead name = "Ujjwal"/>
    </>
  )
}

export default Sam