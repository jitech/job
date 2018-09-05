package br.com.job.rest.service;

import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.job.dao.TestMongoDao;
import br.com.job.domain.Test;

@RestController
@RequestMapping(value = "/test")
public class TestRestService {

	@RequestMapping(value = "/load", method = RequestMethod.POST)
    public Test load(@RequestBody Test test) throws UnknownHostException {	
		return TestMongoDao.load(test.getCode());
    }
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
    public Test save(@RequestBody Test test) throws UnknownHostException {
        return TestMongoDao.save(test);
    }
}