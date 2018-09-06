package br.com.job.dao;

import java.util.Date;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;

import br.com.job.converter.DomainConverter;
import br.com.job.domain.Domain;
import br.com.job.util.MongoUtil;

public class EntityDao implements IDao {

    private DBCollection collection;    

    @SuppressWarnings("rawtypes")
	public EntityDao(Class persistentClass) {
        this.collection = MongoUtil.getInstance().getDB().getCollection(persistentClass.getSimpleName());
    }

    protected DBCollection getDbCollection() {
        return collection;
    }

	@Override
	public boolean save(Domain domain) {
		
		try {
				domain.setInsertDate(new Date());
				collection.save(new BasicDBObject(DomainConverter.converter(domain)));	
				return true;
				
		}catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean update(Domain oldDomain, Domain newDomain) {
		
		try {
				collection.update(new BasicDBObject(DomainConverter.converter(oldDomain)), new BasicDBObject(DomainConverter.converter(newDomain)));		
				return true;
			
		}catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean delete(Domain domain) {
		
		try {
				collection.remove(new BasicDBObject(DomainConverter.converter(domain)));	
				return true;
		
		}catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public Domain find(Domain domain) {
		DBObject obj = collection.findOne(new BasicDBObject(DomainConverter.converter(domain)));
		return DomainConverter.converter(obj, domain);
	}
}