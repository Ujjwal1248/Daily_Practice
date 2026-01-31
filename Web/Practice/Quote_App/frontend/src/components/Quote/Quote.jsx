import React from 'react'
import styles from './Quote.module.css'
import { useNavigate } from 'react-router-dom';

function Quote(props) {
    let navigate = useNavigate();
    function showQuoteHandler(id){
        navigate(`/quotes/${id}`);
    }
  return (
    <>
        <li className = {styles.quote}>
            <div>
                <p>Quote: {props.text}</p>
                <p>Author: {props.author}</p>
            </div>
            <button onClick={()=>showQuoteHandler(props.id)}>View Full quote</button>
            <br/>
            <br/>
            <hr />
            <br/>
        </li>
    </>
  )
}

export default Quote