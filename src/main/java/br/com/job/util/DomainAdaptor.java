package br.com.job.util;

import com.google.gson.Gson;
import com.mongodb.DBObject;
import com.mongodb.util.JSON;

public class DomainAdaptor {

	public static final DBObject toDBObject(Object object) {	    
	    return (DBObject) JSON.parse(new Gson().toJson(object));
	}
}
