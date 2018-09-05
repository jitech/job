package br.com.job.util;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

public class MongoUtil {

	public static DB loadDB() {
		
		try {
				MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
				DB database = mongoClient.getDB("job");	
				return database;
				
		}catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}	
}