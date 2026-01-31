import React, { useReducer, useState } from "react";

function logic(currentState, action) {
  if (action.type == "Increment") return currentState + 1;
  else if (action.type == "Decrement") return currentState - 1;
  else if (action.type == "Reset") return 0;
  else if (action.type == "Set") return action.value;

  return currentState;
}

function App() {
  const [input, setInput] = useState("");
  const [count, dispatch] = useReducer(logic, 0);
  return (
    <>
      <h2>Count : {count}</h2>
      <button onClick={() => dispatch({ type: "Increment" })}>Increment</button>
      <button onClick={() => dispatch({ type: "Decrement" })}>Decrement</button>
      <button onClick={() => dispatch({ type: "Reset" })}>Reset</button>
      <input
        value={input}
        type="number"
        onChange={(e) => {
          setInput(e.target.value);
          dispatch({ type: "Set", value: e.target.value });
        }}
        placeholder="Set Value"
      />
    </>
  );
}

export default App;
