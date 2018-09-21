package br.com.job.domain;

import java.util.Date;

import org.bson.types.ObjectId;

public class Domain {

	private ObjectId _id;
	private Date insertDate;

	public ObjectId get_id() {
		return _id;
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public Date getInsertDate() {
		return insertDate;
	}

	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}
}