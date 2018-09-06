package br.com.job.util;

import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.Mongo;

public class MongoUtil {

	private static final String HOST = "localhost";
    private static final int PORT = 27017;
    private static final String DB_NAME = "job";
    private static MongoUtil uniqInstance;

    private Mongo mongo;
    private DB db;

    private MongoUtil() {}

    public static synchronized MongoUtil getInstance() {
        if (uniqInstance == null) {
            uniqInstance = new MongoUtil();
        }
        return uniqInstance;
    }

    public DB getDB() {
        if (mongo == null) {
            try {
                mongo = new Mongo(HOST, PORT);
                db = mongo.getDB(DB_NAME);
            } catch (UnknownHostException e) {
                e.printStackTrace();
            }
        }
        return db;
    }	
}