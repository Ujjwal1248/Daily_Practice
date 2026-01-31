import React from 'react'
import { useRef } from 'react'
import axios from 'axios'
import styles from './NewQuote.module.css'
import { useNavigate } from 'react-router-dom'

function NewQuote() {
  const usernameInpRef = useRef()
  const quoteInpRef = useRef()
  const navigate = useNavigate()

  async function autoQuoteHandler(e) {
    e.preventDefault()
    let author = usernameInpRef.current.value
    let text = quoteInpRef.current.value
    try {
      let resp = await axios.post('http://localhost:8080/addQuotes', { author, text })
      navigate('/')
    } catch (err) {
      console.log(err, "Abi nhi ho paaega mitrr")
    }
  }

  return (
    <div className={styles.page}>
      <form className={styles.form} onSubmit={autoQuoteHandler}>
        <h1 className={styles.title}>Add New Quote</h1>

        <div className={styles.control}>
          <label htmlFor="author">Author</label>
          <input
            type="text"
            ref={usernameInpRef}
            id="author"
            placeholder="Author Name"
          />
        </div>

        <div className={styles.control}>
          <label htmlFor="quote">Text</label>
          <textarea
            id="quote"
            ref={quoteInpRef}
            rows="5"
            placeholder="Quote Text"
          />
        </div>

        <button className={styles.button}>Add Quote</button>
      </form>
    </div>
  )
}

export default NewQuote
