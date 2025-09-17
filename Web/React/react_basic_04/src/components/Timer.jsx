import React, { useState } from 'react';

const Timer = () => {
    const [time, setTime] = useState(0);

    useEffect(() => {

        const interval = setInterval(() => {

            setTime(prevTime => prevTime + 1);

        }, 1000);



        return () => clearInterval(interval);

    }, []);



    return (
        <h1>Timer: {time} sec</h1>
    );
}

export default Timer;
