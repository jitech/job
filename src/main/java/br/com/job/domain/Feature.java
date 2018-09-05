package br.com.job.domain;

import java.util.List;

public class Feature {

	private String name;
	private List<Function> functions;
	
	public Feature() {
		super();
	}

	public Feature(String name, List<Function> functions) {
		super();
		this.name = name;
		this.functions = functions;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public List<Function> getFunctions() {
		return functions;
	}

	public void setFunctions(List<Function> functions) {
		this.functions = functions;
	}
}