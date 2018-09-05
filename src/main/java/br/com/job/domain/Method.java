package br.com.job.domain;

public class Method {

	private String name;
	private Object[] parameters;
	
	public Method() {
		super();
	}

	public Method(String name, Object[] parameters) {
		super();
		this.name = name;
		this.parameters = parameters;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Object[] getParameters() {
		return parameters;
	}
	
	public void setParameters(Object[] parameters) {
		this.parameters = parameters;
	}
}