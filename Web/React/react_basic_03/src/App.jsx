import Counter from "./components/Counter";
import Mongambo from "./components/Mogambo";
import Person from "./components/Person";

function App(){
  return(
    <div>
      <Mongambo naam = "Ujjwal"/><br />
      <Counter />


      {/* <Person name = "Ujjwal Agrawal" age = {20} favColor = "Yellow" />
      <Person name = "Arjit Sharma" age = {22} favColor = "Green" />
      <Person name = "Dhanraj SIngh" age = {18} favColor = "Blue" /> */}
      {/* <Person></Person> */}
      {/* {Person()} */}

    </div>
  )
}

export default App;