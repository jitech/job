package br.com.job.rest.service;

import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.job.dao.TestUserMongoDao;
import br.com.job.domain.TestUser;

@RestController
@RequestMapping(value = "/test-user")
public class TestUserRestService {

	@RequestMapping(value = "/save", method = RequestMethod.POST)
    public TestUser save(@RequestBody TestUser testUser) throws UnknownHostException {
        return TestUserMongoDao.save(testUser);
    }
}