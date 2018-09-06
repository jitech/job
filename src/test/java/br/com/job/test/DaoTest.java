package br.com.job.test;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.com.job.dao.EnterpriseMongoDao;
import br.com.job.dao.UserMongoDao;
import br.com.job.domain.Enterprise;
import br.com.job.domain.User;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DaoTest {
	
	@Test
	public void saveEnterprise() {
		Assert.assertTrue(new EnterpriseMongoDao().save(new Enterprise("123456789", "UOL Diveo", "ACTIVE")));
	}
	
	@Test
	public void saveUser() {
		
		Enterprise enterprise = (Enterprise) new EnterpriseMongoDao().find(new Enterprise("123456789", null, null));
		
		User user = new User("jgm.melo@gmail.com", "Jonas Goulart", "****", enterprise);
		
		Assert.assertTrue(new UserMongoDao().save(user));
	}
}