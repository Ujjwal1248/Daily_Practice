import React, { useState, useMemo } from 'react';

const UseMemo = () => {
    const [inp, setInp] = useState(0);
    const [count, setCount] = useState(0);

    const out = useMemo(() => {
        console.log("Calculating...");
        let sum = 0;
        let num = Number(inp);
        for (let item = 1; item <= num; item++) {
            sum += item;
        }
        return sum;
    }, [inp]);

    function handleInp(e) {
        setInp(e.target.value);
    }

    return (
        <div>
            <input onChange={handleInp} type="number" value={inp} />
            <h1>Ans: {out}</h1>
            <button onClick={() => setCount(count + 1)}>+</button>
            <h1>Count: {count}</h1>
        </div>
    );
};

export default UseMemo;
