import React, { useEffect, useState } from "react"
import { useParams } from "react-router-dom"
import axios from "axios"
import styles from "./ShowQuote.module.css"

function ShowQuote() {
  const params = useParams()
  const [quote, setQuote] = useState({ author: "", text: "" })

  async function fetchQuote() {
    let resp = await axios.get(`http://localhost:8080/quotes/${params.id}`)
    let { text, author } = resp.data
    setQuote({ text, author })
  }

  useEffect(() => {
    fetchQuote()
  }, [])

  return (
    <div className={styles.page}>
      <div className={styles.card}>
        <p className={styles.quote}>{quote.text}</p>
        <p className={styles.author}>— {quote.author}</p>
      </div>
    </div>
  )
}

export default ShowQuote
