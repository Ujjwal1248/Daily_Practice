import React, { useState, memo } from 'react';

const Chotu = memo(function ({ naam }) {
    return <h1>Chai leke aaya malik: {naam}</h1>;
});

const Person = () => {
    const [dog, setDog] = useState("Simba");

    function changeDog() {
        setDog(Math.floor(Math.random() * 10));
    }

    let [inp, setInp] = useState('');
    function handleInput(e) {
        setInp(e.target.value);
    }

    return (
        <div>
            {/* <button onClick={changeDog}>Change Dog</button> */}
            <input onChange={handleInput} type='text' value={inp} />
            <Chotu naam={dog} />
            <Chotu naam="Chotu" />
            <Chotu naam="Simba" />
            <Chotu naam="Nepali" />
            <Chotu naam="Dodo" />
        </div>
    );
};

export default Person;
