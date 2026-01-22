import { getClient } from "./utils.js";

async function createTable() {
    const client = await getClient();

    const userTable = `
    CREATE TABLE IF NOT EXISTS users (
        id SERIAL PRIMARY KEY,
        email VARCHAR(255) UNIQUE NOT NULL,
        password VARCHAR(255) NOT NULL
    );`;
    await client.query(userTable);
    console.log("Users table ready");

    const todoTable = `
    CREATE TABLE IF NOT EXISTS todos (
        id SERIAL PRIMARY KEY,
        title TEXT NOT NULL,
        description TEXT,
        user_id INTEGER REFERENCES users(id),
        done BOOLEAN DEFAULT FALSE
    );`;
    await client.query(todoTable);
    console.log("Todos table ready");

    await client.end();
}

createTable();
