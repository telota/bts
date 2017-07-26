function(doc){
	if (doc.eClass == 'http://btsCorpusModel/1.0#//BTSLemmaEntry' && doc.state == 'active'){
		emit(doc._id, {"name": doc.name, "eClass": doc.eClass, "type": doc.type, "subtype": doc.subtype, "sortKey" : doc.sortKey, "visibility": doc.visibility, "readers": doc.readers, "updaters": doc.updaters, "revisionState": doc.revisionState, "relations": doc.relations});
	}
}