package br.com.job.domain;

import java.util.List;

public class User {

	private String email;
	private String name;
	private String password;
	private Enterprise enterprise;
	private List<TestUser> tests;
	
	public User() {
		super();
	}

	public User(String email, String name, String password, Enterprise enterprise, List<TestUser> tests) {
		super();
		this.email = email;
		this.name = name;
		this.password = password;
		this.enterprise = enterprise;
		this.tests = tests;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Enterprise getEnterprise() {
		return enterprise;
	}

	public void setEnterprise(Enterprise enterprise) {
		this.enterprise = enterprise;
	}

	public List<TestUser> getTests() {
		return tests;
	}

	public void setTests(List<TestUser> tests) {
		this.tests = tests;
	}
}