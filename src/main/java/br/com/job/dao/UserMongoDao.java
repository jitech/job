package br.com.job.dao;

import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;

import br.com.job.domain.User;
import br.com.job.util.DomainAdaptor;
import br.com.job.util.MongoUtil;

public class UserMongoDao {

	public static User save(User user) {
		
		try {
				DBCollection collection = MongoUtil.loadDB().getCollection("user");
				collection.insert(DomainAdaptor.toDBObject(user));
				return user;
			
		}catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}
	
	public static User load(String email) {
		
		try {
				DBCollection collection = MongoUtil.loadDB().getCollection("user");			
				BasicDBObject searchQuery = new BasicDBObject();
				searchQuery.put("email", email);			
				DBCursor cursor = collection.find(searchQuery);
				
				if(cursor.count() > 1 || cursor.count() == 0) {
					return null;			
				}else {
					return new Gson().fromJson(cursor.next().toString(), User.class);					
				}
			
		}catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}
}
