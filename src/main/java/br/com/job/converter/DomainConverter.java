package br.com.job.converter;

import java.util.Map;

import com.mongodb.DBObject;

import br.com.job.domain.Domain;
import br.com.job.domain.Enterprise;
import br.com.job.domain.User;

public class DomainConverter {
	
	public static Map<Object, Object> converter(Domain domain) {
        
        if(domain.getClass().equals(Enterprise.class)) {
        	return EnterpriseConverter.converterToMap((Enterprise) domain);
        	
        }else if(domain.getClass().equals(User.class)) {
        	return UserConverter.converterToMap((User) domain);
        }
        
        return null;
    }

    public static Domain converter(DBObject dbo, Domain domain) {
    	
    	if(domain.getClass().equals(Enterprise.class)) {
        	return EnterpriseConverter.converterToEnterprise(dbo);
        	
        }else if(domain.getClass().equals(User.class)) {
        	return UserConverter.converterToUser(dbo);
        }
        
        return null;
    }
}
