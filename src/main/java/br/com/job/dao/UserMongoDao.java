package br.com.job.dao;

import br.com.job.domain.User;

public class UserMongoDao extends EntityDao{

	public UserMongoDao() {
		super(User.class);
	}
}