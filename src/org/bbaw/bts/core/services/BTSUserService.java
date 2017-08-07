/*
  This file is part of Berlin Text System.

  The software Berlin Text System serves as a client user interface for working with
  text corpus data. See: aaew.bbaw.de

  The software Berlin Text System was developed at the Berlin-Brandenburg Academy
  of Sciences and Humanities, Jägerstr. 22/23, D-10117 Berlin.
  www.bbaw.de

  Copyright (C) 2013-2014  Berlin-Brandenburg Academy
  of Sciences and Humanities

  The software Berlin Text System was developed by @author: Christoph Plutte.

  Berlin Text System is free software: you can redistribute it and/or modify
  it under the terms of the GNU Lesser General Public License as published by
  the Free Software Foundation, either version 3 of the License, or
  (at your option) any later version.

  Berlin Text System is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  GNU Lesser General Public License for more details.

  You should have received a copy of the GNU Lesser General Public License
  along with Berlin Text System.
  If not, see <http://www.gnu.org/licenses/lgpl-3.0.html>.
 */
package org.bbaw.bts.core.services;

import java.io.FileNotFoundException;
import java.util.List;

import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSUser;
import org.bbaw.bts.core.commons.filter.BTSFilter;
import org.eclipse.core.runtime.IProgressMonitor;

public interface BTSUserService extends GenericObjectService<BTSUser, String> {

    BTSUser createNewUser(String userName);

    boolean setAuthentication(String userName, String passWord);

    void setRememberedUser(BTSUser user);

    List<BTSUser> listAll(String objectState, String userName, String passWord);

    /**
     * Remove database user leaving the btsUser unmodified.
     * The idea is to remove login credentials and authentication options for the given user
     * but keeping information on the user and user-id.
     *
     * @param user user credentials to be removed from db.
     * @return true if successful.
     */
    boolean removeDatabaseUser(BTSUser user);

    List<BTSObject> getUserOrphans(List<BTSFilter> btsFilters, List<BTSObject> rootEntries, IProgressMonitor monitor);

    boolean authenticatedUserIsDBAdmin(String userName, String passWord);

    boolean isValidAuthentication(String userName, String passWord);

    boolean checkAndChangeDBAdminPassword(String userName, String newPassword);

    void makeUserLocalDBAdmin(String userName, String passWord) throws FileNotFoundException;
}
