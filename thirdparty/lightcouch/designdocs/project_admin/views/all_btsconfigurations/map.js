function(doc){
	if (doc.eClass == 'http://btsmodel/1.0#//BTSConfiguration'){
		emit(doc._id, doc);
	}
}