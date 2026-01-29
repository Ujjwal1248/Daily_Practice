import React, { useEffect, useState } from "react";

function GithubUser(props) {
    const [user, setUser] = useState({imgUrl:"", followers : 0, following : 0})

    useEffect(()=>{
        async function callApi(username){
            let resp = await fetch(`https://api.github.com/users/${username}`)
            let data = await resp.json();
            let{avatar_url, followers, following} = data;
            setUser(()=>{
                return{
                    imgUrl : avatar_url,
                    followers,
                    following
                }
            })
        }
        callApi(props.username)

    }, [])
  return (
    <figure style={{display: "flex",alignItems: "center",gap: "16px",padding: "12px 16px",border: "1px solid #e5e7eb",borderRadius: "12px",maxWidth: "420px",fontFamily: "Arial, sans-serif",}}>
      <img src={user.imgUrl} alt="GitHub Avatar" style={{ width: "80px", height: "80px", borderRadius: "50%", }} />

      <figcaption>
        <p style={{ margin: 0, fontWeight: "bold", fontSize: "16px" }}>
          {props.username}
        </p>
        <p style={{ margin: "4px 0" }}>Followers: {user.followers}</p>
        <p style={{ margin: 0 }}>Following: {user.following}</p>
      </figcaption>
    </figure>
  );
}

export default GithubUser;
