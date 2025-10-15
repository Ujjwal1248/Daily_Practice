import React, { Suspense } from 'react';
import { Link, Routes, Route, useNavigate } from 'react-router-dom';
import Home from './components/Home';
import Driling from './components/Driling';
// import Dashboard from './components/Dashboard';
const Dashboard = React.lazy(() => import('./components/Dashboard'));
// import About from './components/About';
const About = React.lazy(() => import('./components/About'));

function App() {
  const navigate = useNavigate();
  function handleBtn(){
    navigate('/')
  }
  return (
    <div>
      <Driling />
      <Link to="/">Home</Link>
      <button onClick={handleBtn}>Home</button>
      <Link to="/dashboard">Dashboard</Link>
      <Link to="/about">About</Link>

      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/dashboard" element={<Suspense fallback="loading DashBoard..."><Dashboard /></Suspense>} />
        <Route path="/about" element={<Suspense fallback="loading About..."><About /></Suspense>} />
      </Routes>
    </div>
  );
}

export default App;
