package com.example.parkingManagement.model;

import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by Koujianing
 * Date: 2020/6/10
 * Time: 18:32
 */
public class Record {
	private long recordId = -1;
	private long icCardId = -1;
	private String userName = null;
	private String parkCardNumber = null;
	private String enterDate = null;
	private String whetherOut = null;

	public Record(){
		super();
	}
	public Record mixinData(Record record){
		if(record.recordId != -1){
			this.recordId = record.recordId;
		}
		if(record.icCardId != -1){
			this.icCardId = record.icCardId;
		}
		if(record.userName != null)
		{
			this.userName = record.userName;
		}
		if(record.parkCardNumber != null)
		{
			this.parkCardNumber = record.parkCardNumber;
		}
		if(record.enterDate != null)
		{
			this.enterDate = record.enterDate;
		}
		if(record.whetherOut != null)
		{
			this.whetherOut = record.whetherOut;
		}

		return this;
	}
	public long getRecordId () {
		return recordId;
	}

	public void setRecordId (long recordId) {
		this.recordId = recordId;
	}

	public long getIcCardId () {
		return icCardId;
	}

	public void setIcCardId (long icCardId) {
		this.icCardId = icCardId;
	}

	public String getUserName () {
		return userName;
	}

	public void setUserName (String userName) {
		this.userName = userName;
	}

	public String getParkCardNumber () {
		return parkCardNumber;
	}

	public void setParkCardNumber (String parkCardNumber) {
		this.parkCardNumber = parkCardNumber;
	}

	public String getEnterDate () {
		return enterDate;
	}

	public void setEnterDate (String enterDate) {
		this.enterDate = enterDate;
	}

	public String getWhetherOut () {
		return whetherOut;
	}

	public void setWhetherOut (String whetherOut) {
		this.whetherOut = whetherOut;
	}

	@Override
	public String toString () {
		return "Record{" +
				"recordId=" + recordId +
				", icCardId=" + icCardId +
				", userName='" + userName + '\'' +
				", parkCardNumber='" + parkCardNumber + '\'' +
				", enterDate='" + enterDate + '\'' +
				", whetherOut='" + whetherOut + '\'' +
				'}';
	}
}
