package br.com.job.rest.service;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.job.domain.Enterprise;

@RestController
@RequestMapping(value = "/enterprise")
public class EnterpriseRestService {

	@RequestMapping(value = "/load", method = RequestMethod.POST)
    public Enterprise load(@RequestBody Enterprise enterprise) {
        return enterprise;
    }
}