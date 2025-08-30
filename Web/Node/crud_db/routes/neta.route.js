const { readNetas, createNeta, showNewForm, showParticularNeta, showEditForm, actuallyEditingNeta, deletingNeta } = require('../controllers/neta.controller');

function netaRoutes(app){
    app.get('/api/netas', readNetas);
    app.get('/api/new', showNewForm);
    app.post('/api/neta', createNeta);
    app.get('/api/neta/:id', showParticularNeta)
    app.get('/api/neta/edit/:id', showEditForm);
    app.put('/api/neta/edit/:id', actuallyEditingNeta);
    app.delete('/api/neta/delete/:id', deletingNeta );
}

module.exports = netaRoutes;