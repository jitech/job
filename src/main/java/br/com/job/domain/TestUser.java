package br.com.job.domain;

import java.util.List;

public class TestUser {

	private Test test;
	private List<Feature> features;
	
	public TestUser() {
		super();
	}

	public TestUser(Test test, List<Feature> features) {
		super();
		this.test = test;
		this.features = features;
	}

	public Test getTest() {
		return test;
	}
	
	public void setTest(Test test) {
		this.test = test;
	}
	
	public List<Feature> getFeatures() {
		return features;
	}

	public void setFeatures(List<Feature> features) {
		this.features = features;
	}

	public class Feature{
		
		private Feature feature;
		private String status;
		
		public Feature getFeature() {
			return feature;
		}
		public void setFeature(Feature feature) {
			this.feature = feature;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
	}
}
