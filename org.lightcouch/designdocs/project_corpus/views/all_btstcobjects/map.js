function(doc){
	if (doc.eClass == 'http://btsCorpusModel/1.0#//BTSTCObject'){
		emit(null, doc);
	}
}