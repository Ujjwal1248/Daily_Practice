const { readNetas, createNeta, showNewForm } = require('../controllers/neta.controller');

function netaRoutes(app){
    app.get('/api/netas', readNetas);
    app.get('/api/new', showNewForm);
    app.post('/api/neta', createNeta);
}

module.exports = netaRoutes;