package br.com.job.domain;

import java.util.List;

public class Test {

	private String code;
	private String name;
	private String describe;
	private List<Feature> features;
	
	public Test() {
		super();
	}

	public Test(String code, String name, String describe, List<Feature> features) {
		super();
		this.code = code;
		this.name = name;
		this.describe = describe;
		this.features = features;
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
	
	public String getDescribe() {
		return describe;
	}
	
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	
	public List<Feature> getFeatures() {
		return features;
	}
	
	public void setFeatures(List<Feature> features) {
		this.features = features;
	}

	@Override
	public String toString() {
		return "Test [code=" + code + ", name=" + name + ", describe=" + describe + ", features=" + features + "]";
	}
}
