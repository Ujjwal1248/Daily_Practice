const { readNetas, createNeta } = require('../controllers/neta.controller');

function netaRoutes(app){
    app.get('/api/netas', readNetas);
    app.post('/api/neta', createNeta);
}

module.exports = netaRoutes;