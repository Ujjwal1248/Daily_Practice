import React, { useMemo, useState } from "react";

function Memooo() {
  const [count, setCount] = useState(0);
  const [inp, setInp] = useState("");
  function handleInp(e) {
    setInp(e.target.value);
  }
  let myMemo = useMemo(() => {
    let ans = 0;
    for (let i = 0; i <= inp; i++) {
      ans += i;
    }
    return ans;
  }, [inp]);

  return (
    <div>
      <input onChange={handleInp} type="number" value={inp} />
      <h2>Sum : {myMemo}</h2>
      <button onClick={() => setCount(count + 1)}>Counter : {count}</button>
    </div>
  );
}

export default Memooo;
