package br.com.job.dao;

import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;

import br.com.job.domain.Test;
import br.com.job.util.DomainAdaptor;
import br.com.job.util.MongoUtil;

public class TestMongoDao {

	public static Test save(Test test) {
		
		try {
				DBCollection collection = MongoUtil.loadDB().getCollection("test");
				collection.insert(DomainAdaptor.toDBObject(test));
				return test;
			
		}catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}
	
	public static Test load(String code) {
		
		try {
				DBCollection collection = MongoUtil.loadDB().getCollection("test");			
				BasicDBObject searchQuery = new BasicDBObject();
				searchQuery.put("code", code);			
				DBCursor cursor = collection.find(searchQuery);
				
				if(cursor.count() > 1 || cursor.count() == 0) {
					return null;			
				}else {
					return new Gson().fromJson(cursor.next().toString(), Test.class);					
				}
			
		}catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}
}