package br.com.job.domain;

public class Function {

	private String name;
	private Object[] parameters;
	
	public Function() {
		super();
	}

	public Function(String name, Object[] parameters) {
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