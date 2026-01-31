import React from "react";
import { Route, Routes, Link, useNavigate } from "react-router-dom";
import Home from "./Components/Home";
import Products from "./Components/Products";
import Dashboard from "./Components/Dashboard";

function App() {
  let navigate = useNavigate();
  function handleClick1(){
    navigate('/home')
  }
  function handleClick2(){
    navigate('/products')
  }
  function handleClick3(){
    navigate('/dashboard')
  }
  return (
    <>
      {/* Routing using Link Tag */}
      <Link to="/home">Home</Link><hr/>
      <Link to="/products">Products</Link><hr/>
      <Link to="/dashboard">Dashboard</Link><hr/>

      {/* Routing using useNavigate */}
      <button onClick={handleClick1}>Home Pr Jaaoge</button><br />
      <button onClick={handleClick2}>Products Pr Jaaoge</button><br />
      <button onClick={handleClick3}>Dashboard Pr Jaaoge</button><br />
      <Routes>
        <Route path="/home" element={<Home/>} />
        <Route path="/products" element={<Products />} />
        <Route path="/dashboard" element={<Dashboard />} />
      </Routes>
    </>
  );
}

export default App;
