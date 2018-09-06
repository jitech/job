package br.com.job.domain;

public class TestCase {

	private Object[] parameters;
	private Object expected;
	
	public Object[] getParameters() {
		return parameters;
	}
	
	public void setParameters(Object[] parameters) {
		this.parameters = parameters;
	}
	
	public Object getExpected() {
		return expected;
	}
	
	public void setExpected(Object expected) {
		this.expected = expected;
	}
}