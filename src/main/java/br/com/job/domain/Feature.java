package br.com.job.domain;

import java.util.List;

public class Feature {

	private String code;
	private String name;
	private List<Method> methods;
	
	public Feature() {
		super();
	}

	public Feature(String code, String name, List<Method> methods) {
		super();
		this.code = code;
		this.name = name;
		this.methods = methods;
	}

	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public List<Method> getMethods() {
		return methods;
	}
	
	public void setMethods(List<Method> methods) {
		this.methods = methods;
	}
}