package br.com.job.dao;

import com.mongodb.DBCollection;

import br.com.job.domain.Enterprise;
import br.com.job.util.DomainAdaptor;
import br.com.job.util.MongoUtil;

public class EnterpriseMongoDao {

	public static Enterprise save(Enterprise enterprise) {
		
		try {
				DBCollection collection = MongoUtil.loadDB().getCollection("enterprise");
				collection.insert(DomainAdaptor.toDBObject(enterprise));
				return enterprise;
			
		}catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}
}
