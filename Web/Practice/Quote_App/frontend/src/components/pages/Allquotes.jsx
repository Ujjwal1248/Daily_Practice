import React from 'react'
import { useState } from 'react';
import { useEffect } from 'react';
import Quote from '../Quote/Quote';

function Allquotes() {
  let[quotes, setQuotes] = useState([]);
  async function getQuotes(){
    let resp = await fetch('http://localhost:8080/allQuotes');
    let data = await resp.json();
    setQuotes(data);
  }

  useEffect(() => {
    getQuotes();
  }, [])
  return (
    <>
    <div>All Quotes</div>
    {
      quotes.map((quote, index)=>{
        return <Quote key={quote._id} id={quote._id} author={quote.author} text={quote.text}/>
      })
    }
    </>
  )
}

export default Allquotes