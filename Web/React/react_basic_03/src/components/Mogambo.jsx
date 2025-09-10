import { useState } from "react";

// function Mongambo(props){
function Mongambo({naam}){
    let[name, setName] = useState(naam);
    function handleNaam(){
        setName("Mogambo");
    }

    return(
        <div>
            <h1>Mongambo mein NAAM badal Dunga</h1>
            <h2>{name}</h2>
            <button onClick={handleNaam}>Naam badal Dun</button>
        </div>
    )
}

export default Mongambo;