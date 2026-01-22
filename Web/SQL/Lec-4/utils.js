import {Client} from 'pg'

export async function getClient(){

    const client = new Client({
        user: 'postgres',
        host: 'localhost',
        database: 'basanti',
        password: '1234567890',
        port: '5432'
    })
    await client.connect()
    return client
}