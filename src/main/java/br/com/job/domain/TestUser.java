package br.com.job.domain;

public class TestUser {

	private User user;
	private Test test;
	private String status;
	
	public TestUser() {
		super();
	}
	
	public TestUser(User user, Test test, String status) {
		super();
		this.user = user;
		this.test = test;
		this.status = status;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
