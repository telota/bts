function(doc){
	if (doc.eClass == 'http://btsCorpusModel/1.0#//BTSThsEntry' && doc.state == 'terminated'){
		emit(doc._id, doc);
	}
}