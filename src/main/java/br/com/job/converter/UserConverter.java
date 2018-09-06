package br.com.job.converter;

import java.util.HashMap;
import java.util.Map;

import com.mongodb.DBObject;

import br.com.job.domain.Enterprise;
import br.com.job.domain.User;

public class UserConverter {

	public static Map<Object, Object> converterToMap(User user) {
        Map<Object, Object> map = new HashMap<Object, Object>();
        map.put("email", user.getEmail());
        map.put("name", user.getName());
        map.put("password", user.getPassword());
        map.put("enterprise", user.getEnterprise());
        return map;
    }

    public static User converterToUser(DBObject dbo) {  	
    	User user = new User();
    	user.setEmail(dbo.get("email").toString());
    	user.setName(dbo.get("name").toString());
    	user.setPassword(dbo.get("password").toString());
    	user.setEnterprise((Enterprise) dbo.get("enterprise"));
        return user;
    }
}