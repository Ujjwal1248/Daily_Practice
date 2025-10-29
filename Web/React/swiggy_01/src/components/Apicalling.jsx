import React, { useEffect, useState } from 'react'
import axios from 'axios';

const Apicalling = () => {
    const [allRestaurnats, setAllRestaurants] = useState([])

    useEffect(() => {
        const API = "https://www.swiggy.com/dapi/restaurants/list/v5?lat=27.49870&lng=77.66690&is-seo-homepage-enabled=true&page_type=DESKTOP_WEB_LISTING"
        async function calling(){
            let resp = await axios.get(API);
            // console.log(resp.data.data.cards[1].card.card.gridElements.infoWithStyle.restaurants);
            setAllRestaurants(resp.data.data.cards[1].card.card.gridElements.infoWithStyle.restaurants);
        }
        calling()
    }, [])
  return allRestaurnats;
}

export default Apicalling