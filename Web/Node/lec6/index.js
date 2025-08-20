const express = require('express');
const path = require('path');
const methodOverride = require('method-override');
const app = express();
const {v4: uuidv4} = require('uuid');

app.set('view engine', 'ejs');
app.set('views', path.join(__dirname, 'views'));
app.use(express.static(path.join(__dirname, 'public')));
app.use(express.urlencoded({ extended: true }));
app.use(methodOverride('_method'));

app.get('/', (req, res) => {
    res.send('Welcome to root Route!');
});

app.get('/human', (req, res) => {
    res.send('Welcome to Human Route!');
});

app.get('/blogs', (req, res) => {
    res.render('blogs/index', { blogs });
});

app.get('/blogs/new', (req, res) => {
    res.render('blogs/new');
});

app.post('/blogs', (req, res) => {
    let { author, comment } = req.body;
    blogs.push({ id: blogs.length + 1 ,author, comment });
    res.send("Blog created successfully!");
});

// Particular Blog

app.get('/blogs/:idd', (req, res) => {
    let { idd } = req.params;
    let foundblog = blogs.find((blog) => blog.id == idd);
    res.render('blogs/show', { foundblog });
});

app.get('/blogs/:idd/edit', (req, res) => {
    let { idd } = req.params;
    let foundblog = blogs.find((blog) => blog.id == idd);
    res.render('blogs/edit', { foundblog });
});

app.patch('/blogs/:idd', (req, res) => {
    let { idd } = req.params;
    let foundblog = blogs.find((blog) => blog.id == idd);
    let { author, content } = req.body;
    foundblog.author = author;
    foundblog.comment = content;
    res.redirect('/blogs');
});

// Delete Blog
app.delete('/blogs/:idd', (req, res) => {
    let { idd } = req.params;
    let blogIndex = blogs.findIndex((blog) => blog.id == idd);
    res.redirect('/blogs');
});


// CRUD
// Create, Read, Update, Delete

const blogs = [
    {
        id: uuidv4(),
        author: 'Ujjwal',
        comment: "Aaj kamaenga to kl bathke khaenge",
    },
    {
        id: uuidv4(),
        author: 'Arpit',
        comment: "Aaj khaenge to kl kamaenge",
    },
    {
        id: uuidv4(),
        author: 'Anshul',
        comment: "Aaj khaenge to kl khaenge",
    },
    {
        id: uuidv4(),
        author: 'Aryan',
        comment: "Papa woh cycle ki toh....",
    }
]

const PORT = 8080;
app.listen(PORT, () => {
  console.log(`Server is running on http://localhost:${PORT}`);
});