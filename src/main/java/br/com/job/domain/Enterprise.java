package br.com.job.domain;

public class Enterprise {

	private String document;
	private String name;
	private String status;

	public Enterprise() {
		super();
	}

	public Enterprise(String document, String name, String status) {
		super();
		this.document = document;
		this.name = name;
		this.status = status;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}