/*
* generated by Xtext
*/
package org.bbaw.bts.corpus.text.egy.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;

public class AbstractEgyDslJavaValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.bbaw.bts.corpus.text.egy.egyDsl.EgyDslPackage.eINSTANCE);
		return result;
	}

}
