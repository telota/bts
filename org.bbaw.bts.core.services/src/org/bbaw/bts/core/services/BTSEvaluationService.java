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

import java.util.List;

import org.bbaw.bts.btsmodel.AdministrativDataObject;
import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.btsmodel.BTSProjectDBCollection;
import org.bbaw.bts.btsmodel.BTSUser;
import org.eclipse.emf.common.util.EList;

/**
 * The Interface BTSEvaluationService.
 *
 * @author Christoph Plutte
 */
public interface BTSEvaluationService {

    /**
     * Returns list of all objects from the given list that are visible to user and thus filtered in.
     *
     * @param <T>     the generic type
     * @param objects objects to filter.
     * @return list of visible objects
     */
    <T extends BTSDBBaseObject> List<T> filter(List<T> objects);

    /**
     * Returns true if given object is to be filtered in, false if filtered out.
     *
     * @param object object to filter.
     * @return true if filtered in.
     */
    boolean filter(Object object);

    /**
     * Compute selection.
     *
     * @param selection the selection
     */
    void computeSelection(Object selection);

    /**
     * Returns true if given object is currently not locked by database backend.
     * It starts a background process to acquire a lock for this object.
     *
     * @param object requested object.
     * @return true if locked, false if not.
     */
    boolean acquireLockOptimistic(Object object);

    /**
     * Tries to acquire a lock for the given object. If this is not successful
     * it returns false.
     * Pessimistic locking.
     *
     * @param object object to be locked.
     * @return true if locking successful
     */
    boolean acquireLockStrict(Object object);

    /**
     * Removes all previously acquired locks on this object.
     *
     * @param object object to be released.
     */
    void unlock(Object object);

    /**
     * returns highest user role the authenticated user holds in the given projectDBCollection.
     *
     * @param projectDBCollection requested dbCollection.
     * @return highest userrole in given context.
     */
    String highestRoleOfAuthenticatedUserInDBCollection(BTSProjectDBCollection projectDBCollection);

    /**
     * Returns true if authenticated user is member of given list or if a user group is a member in which
     * the user itself is a member.
     *
     * @param readerORUpdatersList list of readers or updaters containing usernames or group ids.
     * @return if user is member.
     */
    boolean authenticatedUserIsMember(List<String> readerORUpdatersList);

    /**
     * Authenticated user has lock.
     *
     * @param object the object
     * @return true, if successful
     */
    boolean authenticatedUserHasLock(Object object);

    /**
     * returns true if authenticated user is technically admin of database.
     *
     * @param remoteDBAdmin true to request if user is admin of remote database.
     * @return true if authenticated user is admin of database.
     */
    boolean authenticatedUserIsDBAdmin(boolean remoteDBAdmin);

    /**
     * Authenticated user may sync db coll.
     *
     * @param dbCollectionName the db collection name
     * @return true, if successful
     */
    boolean authenticatedUserMaySyncDBColl(String dbCollectionName);

    /**
     * returns highest user role the given user holds in the given projectDBCollection.
     *
     * @param projectDBCollection requested dbCollection.
     * @param user                given user
     * @return highest userrole in given context.
     */
    String highestRoleOfUserInDBCollection(BTSUser user,
                                           BTSProjectDBCollection projectDBCollection);

    boolean userIsMember(BTSUser user, List<String> updaters);

}
