function(doc){
	if (doc.eClass == 'http://btsmodel/1.0#//BTSTextCorpus' && doc.state == 'active'){
		emit(null, doc);
	}
}