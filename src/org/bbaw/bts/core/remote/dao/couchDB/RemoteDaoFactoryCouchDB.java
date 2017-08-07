package org.bbaw.bts.core.remote.dao.couchDB;

import org.bbaw.bts.core.remote.dao.RemoteBTSIDReservationObjectDao;
import org.bbaw.bts.core.remote.dao.RemoteBTSProjectDao;
import org.bbaw.bts.core.remote.dao.RemoteBTSUserDao;
import org.bbaw.bts.core.remote.dao.RemoteBTSUserGroupDao;
import org.bbaw.bts.core.remote.dao.RemoteDAOFactory;
import org.bbaw.bts.core.remote.dao.RemoteDBConnectionProvider;
import org.bbaw.bts.core.remote.dao.RemoteDBLeaseDao;
import org.bbaw.bts.core.remote.dao.RemoteDBManager;
import org.bbaw.bts.core.remote.dao.RemoteGeneralPurposeDao;
import org.bbaw.bts.core.remote.dao.couchDB.impl.RemoteBTSIDReservationObjectDaoImpl;
import org.bbaw.bts.core.remote.dao.couchDB.impl.RemoteBTSProjectDaoImpl;
import org.bbaw.bts.core.remote.dao.couchDB.impl.RemoteBTSUserDaoImpl;
import org.bbaw.bts.core.remote.dao.couchDB.impl.RemoteBTSUserGroupDaoImpl;
import org.bbaw.bts.core.remote.dao.couchDB.impl.RemoteDBConnectionProviderImpl;
import org.bbaw.bts.core.remote.dao.couchDB.impl.RemoteDBLeaseDaoImpl;
import org.bbaw.bts.core.remote.dao.couchDB.impl.RemoteDBManagerImpl;
import org.bbaw.bts.core.remote.dao.couchDB.impl.RemoteGeneralPurposeDaoImpl;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;

public class RemoteDaoFactoryCouchDB implements RemoteDAOFactory {

    @Override
    public String getFactoryName() {
        return "couchdb.daofactory";
    }

    @Override
    public String getFactoryDescription() {
        return "This (IEclipseContext context)ctory creates daos to access couchdb.";
    }

    @Override
    public <T> T createDao(Class<T> clazz, IEclipseContext context) {
        if (clazz == RemoteBTSProjectDao.class) {
            return (T) getBTSProjectDao(context);
        } else if (clazz == RemoteBTSUserDao.class) {
            return (T) getBTSUserDao(context);
        } else if (clazz == RemoteBTSUserGroupDao.class) {
            return (T) getBTSUserGroupDao(context);
        } else if (clazz == RemoteDBLeaseDao.class) {
            return (T) getDBLeaseDao(context);
        } else if (clazz == RemoteGeneralPurposeDao.class) {
            return (T) getGeneralPurposeDao(context);
        } else if (clazz == RemoteDBConnectionProvider.class) {
            return (T) getDBConnectionProvider(context);
        } else if (clazz == RemoteDBManager.class) {
            return (T) getDBManager(context);
        } else if (clazz == RemoteBTSIDReservationObjectDao.class) {
            return (T) getRemoteBTSIDReservationObjectDao(context);
        }
        return null;
    }

    private RemoteBTSIDReservationObjectDao getRemoteBTSIDReservationObjectDao(IEclipseContext context) {
        return ContextInjectionFactory.make(RemoteBTSIDReservationObjectDaoImpl.class, context);
    }

    private RemoteDBManager getDBManager(IEclipseContext context) {
        return ContextInjectionFactory.make(RemoteDBManagerImpl.class, context);
    }

    private RemoteDBConnectionProvider getDBConnectionProvider(IEclipseContext context) {
        return ContextInjectionFactory.make(RemoteDBConnectionProviderImpl.class, context);
    }

    private RemoteGeneralPurposeDao getGeneralPurposeDao(IEclipseContext context) {
        return ContextInjectionFactory.make(RemoteGeneralPurposeDaoImpl.class, context);

    }

    private RemoteDBLeaseDao getDBLeaseDao(IEclipseContext context) {
        return ContextInjectionFactory.make(RemoteDBLeaseDaoImpl.class, context);
    }

    private RemoteBTSProjectDao getBTSProjectDao(IEclipseContext context) {
        return ContextInjectionFactory.make(RemoteBTSProjectDaoImpl.class, context);
    }

    private RemoteBTSUserDao getBTSUserDao(IEclipseContext context) {
        return ContextInjectionFactory.make(RemoteBTSUserDaoImpl.class, context);
    }

    private RemoteBTSUserGroupDao getBTSUserGroupDao(IEclipseContext context) {
        return ContextInjectionFactory.make(RemoteBTSUserGroupDaoImpl.class, context);
    }
}
