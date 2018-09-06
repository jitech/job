package br.com.job.domain;

import java.io.Serializable;
import java.util.List;

public class User extends Domain implements Serializable{

	private static final long serialVersionUID = 1L;
	private String email;
	private String name;
	private String password;
	private Enterprise enterprise;
	private List<TestUser> tests;
	
	public User() {
		super();
	}

	public User(String email, String name, String password, Enterprise enterprise) {
		super();
		this.email = email;
		this.name = name;
		this.password = password;
		this.enterprise = enterprise;
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

	@Override
	public String toString() {
		return "User [email=" + email + ", name=" + name + ", password=" + password + ", enterprise=" + enterprise
				+ ", tests=" + tests + "]";
	}
}