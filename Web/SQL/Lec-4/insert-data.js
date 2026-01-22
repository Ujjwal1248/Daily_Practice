import { getClient } from "./utils.js";

async function insertData() {
    
    //users
    const userData = `INSERT INTO users (email, password) VALUES ($1, $2) RETURNING id;`
    const userArr = ['ujjwalaaaa@gmail.com', '123']
    const client =  await getClient();
    const response = await client.query(userData, userArr);
    console.log(response.rows);
    console.log(response.rows[0]);

    //todos
    const todoData = `INSERT INTO todos (title, description, user_id, done) VALUES ($1, $2, $3, $4);`
    const todoArr = ['gym', 'workout karo', response.rows[0].id, false]
    await client.query(todoData, todoArr);
    console.log("Todo inserted");

    await client.end();
}

insertData();