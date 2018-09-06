package br.com.job.dao;

import com.mongodb.DBCollection;

import br.com.job.domain.TestUser;
import br.com.job.util.DomainAdaptor;
import br.com.job.util.MongoUtil;

public class TestUserMongoDao {

	public static TestUser save(TestUser testUser) {
		
		try {
				DBCollection collection = MongoUtil.loadDB().getCollection("testUser");
				collection.insert(DomainAdaptor.toDBObject(testUser));
				return testUser;
			
		}catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}
}