import { BrowserRouter, Routes, Route } from "react-router-dom"
import { lazy, Suspense } from "react"
import Navbar from "./components/Navbar"

const Home = lazy(() => import("./pages/Home"))
const About = lazy(() => import("./pages/About"))
const Courses = lazy(() => import("./pages/Courses"))

export default function App() {
  return (
    <BrowserRouter>
      <Navbar />

      <Suspense fallback={<p>Loading page...</p>}>
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/about" element={<About />} />
          <Route path="/courses" element={<Courses />} />
        </Routes>
      </Suspense>
    </BrowserRouter>
  )
}
