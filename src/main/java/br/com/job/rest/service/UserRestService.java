package br.com.job.rest.service;

import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.job.dao.EnterpriseMongoDao;
import br.com.job.dao.UserMongoDao;
import br.com.job.domain.Enterprise;
import br.com.job.domain.User;

@RestController
@RequestMapping(value = "/user")
public class UserRestService {

	@RequestMapping(value = "/load", method = RequestMethod.POST)
    public User load(@RequestBody User user) throws UnknownHostException {	
        return UserMongoDao.load(user.getEmail());
    }
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
    public User save(@RequestBody User user) throws UnknownHostException {	
		Enterprise enterprise = new Enterprise("9999999", "UOL Diveo", "ACTIVE");	
		EnterpriseMongoDao.save(enterprise);	
		user.setName("Jonas Goulart Melo");
		user.setEnterprise(enterprise);		
        return UserMongoDao.save(user);
    }
}