import React from 'react'
import MainNavigation from './components/mainNavigation/mainNavigation'
import { Route, Routes } from 'react-router-dom'
import Allquotes from './components/pages/Allquotes'
import NewQuote from './components/pages/NewQuote'
import ShowQuote from './components/pages/ShowQuote'


function App() {
  return (
    <> 
      <MainNavigation />
      <Routes>
        <Route path='/' element={<Allquotes />} />
        <Route path='/new' element={<NewQuote />} />
        <Route path='/quotes/:id' element={<ShowQuote />} />
      </Routes>
    </>
  )
}

export default App