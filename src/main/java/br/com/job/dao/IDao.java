package br.com.job.dao;

import br.com.job.domain.Domain;

public interface IDao {

	boolean save(Domain domain);

	boolean update(Domain oldDomain, Domain newDomain);

	boolean delete(Domain domain);

    Domain find(Domain domain);
}