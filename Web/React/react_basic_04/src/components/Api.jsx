import React, { useEffect, useState } from 'react';
import axios from 'axios';

const Api = () => {
    const [data, setData] = useState([]);
    const API = "https://jsonplaceholder.typicode.com/todos";
    useEffect(() => {

        // USING FETCH FUNCTION
        // fetch(API)
        // .then((data) => {
        //     return data.json();
        // })
        // .then((resp) => {
        //     setData(resp);
        // })
        // .catch((err) => console.log(err));

// ==========================================================
        // USING AXIOS
        // axios.get(API)
        // .then((response) => {
        //     setData(response.data);
        // })
        // .catch((err) => console.log(err));

// ==========================================================

        // USING ASYNC AWAIT
        // async function apicalling(){
        //     let data = await axios.get(API);
        //     setData(data.data);
        // }
        // apicalling();

// ==========================================================
        // USING ASYNC AWAIT WITH FETCH
        async function apicalling(){
            let data = await fetch(API);
            let parsedData = await data.json();
            setData(parsedData);
        }
        apicalling();

// ==========================================================
    }, []);
    return (
        <div>
            <h1>API</h1>
            {/* {
                data.map((item, index) => {
                    return (
                        <div>
                            <h1>Title: {item.title}</h1>
                        </div>
                    )
                })
            } */}

            {/* Make a timer */}

            


        </div>
    );
}

export default Api;