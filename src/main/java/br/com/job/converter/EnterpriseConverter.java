package br.com.job.converter;

import java.util.HashMap;
import java.util.Map;

import com.mongodb.DBObject;

import br.com.job.domain.Enterprise;

public class EnterpriseConverter {

	public static Map<Object, Object> converterToMap(Enterprise enterprise) {
        Map<Object, Object> mapPerson = new HashMap<Object, Object>();
        if(enterprise.getDocument() != null) {
        	mapPerson.put("document", enterprise.getDocument());
        }
        if(enterprise.getName() != null) {
        	mapPerson.put("name", enterprise.getName());
        }
        if(enterprise.getStatus() != null) {
        	mapPerson.put("status", enterprise.getStatus());
        }
  
        return mapPerson;
    }

    public static Enterprise converterToEnterprise(DBObject dbo) {  	
    	Enterprise enterprise = new Enterprise();
    	enterprise.setDocument(dbo.get("document").toString());
    	enterprise.setName(dbo.get("name").toString());
    	enterprise.setStatus(dbo.get("status").toString());
        return enterprise;
    }
}