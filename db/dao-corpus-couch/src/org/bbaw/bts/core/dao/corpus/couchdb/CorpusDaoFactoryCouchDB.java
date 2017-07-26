package org.bbaw.bts.core.dao.corpus.couchdb;

import org.bbaw.bts.core.dao.DAOFactory;
import org.bbaw.bts.core.dao.corpus.BTSAbstractTextDao;
import org.bbaw.bts.core.dao.corpus.BTSAnnotationDao;
import org.bbaw.bts.core.dao.corpus.BTSImageDao;
import org.bbaw.bts.core.dao.corpus.BTSLemmaEntryDao;
import org.bbaw.bts.core.dao.corpus.BTSTCObjectDao;
import org.bbaw.bts.core.dao.corpus.BTSTextCorpusDao;
import org.bbaw.bts.core.dao.corpus.BTSTextDao;
import org.bbaw.bts.core.dao.corpus.BTSThsEntryDao;
import org.bbaw.bts.core.dao.corpus.CorpusObjectDao;
import org.bbaw.bts.core.dao.corpus.couchdb.impl.BTSAbstractTextDaoImpl;
import org.bbaw.bts.core.dao.corpus.couchdb.impl.BTSAnnotationDaoImpl;
import org.bbaw.bts.core.dao.corpus.couchdb.impl.BTSImageDaoImpl;
import org.bbaw.bts.core.dao.corpus.couchdb.impl.BTSLemmaEntryDaoImpl;
import org.bbaw.bts.core.dao.corpus.couchdb.impl.BTSTCObjectDaoImpl;
import org.bbaw.bts.core.dao.corpus.couchdb.impl.BTSTextCorpusDaoImpl;
import org.bbaw.bts.core.dao.corpus.couchdb.impl.BTSTextDaoImpl;
import org.bbaw.bts.core.dao.corpus.couchdb.impl.BTSThsEntryDaoImpl;
import org.bbaw.bts.core.dao.corpus.couchdb.impl.CorpusObjectDaoImpl;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;

public class CorpusDaoFactoryCouchDB implements DAOFactory {

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
        if (clazz == BTSAnnotationDao.class) {
            return (T) getBTSAnnotationDao(context);
        } else if (clazz == BTSImageDao.class) {
            return (T) getBTSImageDao(context);
        } else if (clazz == BTSLemmaEntryDao.class) {
            return (T) getBTSLemmaEntryDao(context);
        } else if (clazz == BTSTCObjectDao.class) {
            return (T) getBTSTCObjectDao(context);
        } else if (clazz == BTSTextCorpusDao.class) {
            return (T) getBTSTextCorpusDao(context);
        } else if (clazz == BTSTextDao.class) {
            return (T) getBTSTextDao(context);
        } else if (clazz == BTSThsEntryDao.class) {
            return (T) getBTSThsEntryDao(context);
        } else if (clazz == CorpusObjectDao.class) {
            return (T) getCorpusObjectDao(context);
        } else if (clazz == BTSAbstractTextDao.class) {
            return (T) getBTSAbstractTextDao(context);
        }
        return null;
    }


    private BTSAbstractTextDao getBTSAbstractTextDao(IEclipseContext context) {
        return ContextInjectionFactory.make(BTSAbstractTextDaoImpl.class, context);
    }

    private CorpusObjectDao getCorpusObjectDao(IEclipseContext context) {
        return ContextInjectionFactory.make(CorpusObjectDaoImpl.class, context);
    }

    private BTSThsEntryDao getBTSThsEntryDao(IEclipseContext context) {
        return ContextInjectionFactory.make(BTSThsEntryDaoImpl.class, context);
    }


    private BTSAnnotationDao getBTSAnnotationDao(IEclipseContext context) {
        return ContextInjectionFactory.make(BTSAnnotationDaoImpl.class, context);
    }


    private BTSImageDao getBTSImageDao(IEclipseContext context) {
        return ContextInjectionFactory.make(BTSImageDaoImpl.class, context);
    }

    private BTSLemmaEntryDao getBTSLemmaEntryDao(IEclipseContext context) {
        return ContextInjectionFactory.make(BTSLemmaEntryDaoImpl.class, context);
    }

    private BTSTCObjectDao getBTSTCObjectDao(IEclipseContext context) {
        return ContextInjectionFactory.make(BTSTCObjectDaoImpl.class, context);
    }

    private BTSTextCorpusDao getBTSTextCorpusDao(IEclipseContext context) {
        return ContextInjectionFactory.make(BTSTextCorpusDaoImpl.class, context);
    }

    private BTSTextDao getBTSTextDao(IEclipseContext context) {
        return ContextInjectionFactory.make(BTSTextDaoImpl.class, context);
    }

}
