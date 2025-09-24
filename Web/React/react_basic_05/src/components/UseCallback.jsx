import React, { memo, useCallback } from 'react';

const UseCallback = () => {
    const [count, setCount] = React.useState(0);
    let a = useCallback(function() {console.log("Hello")}, []);
    return (
        <div>
            <Chotu chai={a} />
            <button onClick={() => setCount(count + 1)}>Counter: {count}</button>
        </div>
    );
}

const Chotu = memo(({ chai }) => {
    console.log("Chotu rendered");
    return (
        <h1>mai launga chai:{chai}</h1>
    );
});

export default UseCallback;
