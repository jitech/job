package br.com.job.domain;

import java.io.Serializable;

public class Enterprise extends Domain implements Serializable{

	private static final long serialVersionUID = 1L;
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

	@Override
	public String toString() {
		return "Enterprise [document=" + document + ", name=" + name + ", status=" + status + "]";
	}
}