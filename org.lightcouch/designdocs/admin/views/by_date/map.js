function(doc){
	if (doc.eClass == 'http://btsmodel/1.0#//BTSProject' && doc.state == 'active'){
		emit(null, doc);
  }
}