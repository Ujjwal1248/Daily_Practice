import { useState } from 'react';
function Counter() {
    let [count, setCount] = useState(0);
    function increase() {
        // setCount(count + 1);
        setCount((cnt) => cnt + 1);
        setCount((cnt) => cnt + 1);
        setCount((cnt) => cnt + 1);
    }
    function decrease() {
        // setCount(count - 1);
        setCount((cnt) => cnt - 1);
        setCount((cnt) => cnt - 1);
        setCount((cnt) => cnt - 1);
    }

    return (
        <div>
            <button onClick={increase}>+</button>
            <span>&nbsp;{count}&nbsp;</span>
            <button onClick={decrease}>-</button>
        </div>
    )
}

export default Counter;