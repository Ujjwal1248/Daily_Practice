const NetaModel = require("../models/Neta.model");

async function readNetas(req, res) {
    try{
        const allNetas = await NetaModel.find();
        return res.status(200).render('index',{allNetas});
    }catch(err){
        res.status(404).json({ message: 'Error reading neta' });
    }
}

async function createNeta(req, res) {
    try{
        let{name,isMale,party, isCorrupt}=req.body;
        let newNeta = await NetaModel.create({name, isMale, party, isCorrupt});
        return res.status(201).json(newNeta);
    }
    catch(err){
        res.status(404).json({ message: 'Error creating neta' });
    }
}

async function showNewForm(req, res) {
    try{
        res.status(200).render('new');
    }
    catch(err){
        res.status(404).json({ message: 'Error creating neta' });
    }
}

async function showParticularNeta(req, res) {
    try{
        let {id} = req.params;
        let foundNeta = await NetaModel.findById(id);
        return res.status(200).render('show',{foundNeta});
    }
    catch(err){
        res.status(404).json({ message: 'Error creating neta' });
    }
}

async function showEditForm(req, res) {
    try{
        let {id} = req.params;
        let foundNeta = await NetaModel.findById(id);
        res.status(200).render('edit', { foundNeta });
    }
    catch(err){
        res.status(404).json({ message: 'Error creating neta' });
    }
}

async function actuallyEditingNeta(req, res) {
    try{
        let {name,isMale,party,isCorrupt} = req.body;
        let {id} = req.params;
        let editedData = await NetaModel.findByIdAndUpdate(id, {name, isMale, party, isCorrupt}, {new: true});
        res.status(200).redirect('/api/netas');
    }
    catch(err){
        res.status(404).json({ message: 'Error creating neta' });
    }
}

async function deletingNeta(req, res) {
    try{
        let {id} = req.params;
        let editedData = await NetaModel.findByIdAndDelete(id);
        res.status(200).redirect('/api/netas');
    }
    catch(err){
        res.status(404).json({ message: 'Error creating neta' });
    }
}
module.exports = { readNetas, createNeta , showNewForm , showParticularNeta, showEditForm , actuallyEditingNeta, deletingNeta};