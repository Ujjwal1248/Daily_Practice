const { readNetas, createNeta, showNewForm, showParticularNeta } = require('../controllers/neta.controller');

function netaRoutes(app){
    app.get('/api/netas', readNetas);
    app.get('/api/new', showNewForm);
    app.post('/api/neta', createNeta);
    app.get('/api/neta/:id', showParticularNeta)
}

module.exports = netaRoutes;