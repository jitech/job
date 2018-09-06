package br.com.job.util;

import java.net.UnknownHostException;

import br.com.job.dao.EnterpriseMongoDao;
import br.com.job.domain.Enterprise;

public class Test {

	public static void main(String[] args) throws UnknownHostException {
		
		Enterprise enterprise = new Enterprise("123456789", "UOL Diveo s", "ACTIVE");
			
		EnterpriseMongoDao dao = new EnterpriseMongoDao();
		dao.save(enterprise);
		
		System.out.println(dao.find(enterprise));		
	}
}
