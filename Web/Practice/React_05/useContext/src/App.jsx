import React, { createContext, useContext } from 'react'

const CountContext = createContext(100);

function App() {
  return (
    <CountContext.Provider value={200}>
      <A />
    </CountContext.Provider>
  )
}

function A(){
  return(
    <>
    <h1>A</h1>
    <B />
    </>
  )
}
function B(){
  return(
    <>
    <h1>B</h1>
    <C />
    </>
  )
}
function C(){
  const value = useContext(CountContext);
  return(
    <>
    <h1>C {value}</h1>
    </>
  )
}

export default App