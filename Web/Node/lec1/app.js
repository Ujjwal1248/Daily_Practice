console.log("Hello, World! This is a basic Node.js application.");

const args = process.argv.slice(2);
const message_to_show = args[0];
const times = args[1];

for (let i = 0; i < times; i++) {
    console.log(message_to_show);
}