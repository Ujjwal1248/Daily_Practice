const path = require('path');
const fs = require('fs');

// Create
let data = "namaste hi ki haal chaal copy to all"
fs.writeFile('sam.txt', data, {
    encoding: 'utf8',
    flag: 'w'
}, (err) => {
    if (err) {
        throw err;
    } else {
        console.log('File created successfully');
    }
});

// Read
fs.readFile('sam.txt', 'utf8', (err, data) => {
    if (err) {
        throw err;
    } else {
        console.log('File content:', data);
    }
});
// Update
fs.appendFile('sam.txt', ' and good morning', (err) => {
    if (err) {
        throw err;
    } else {
        console.log('File updated successfully');
    }
}
);
// Delete
fs.unlink('sam.txt', (err) => {
    if (err) {
        throw err;
    } else {
        console.log('File deleted successfully');
    }
}
);

function vohra() {
    console.log("Vohra");
}
