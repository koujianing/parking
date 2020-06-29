package com.example.parkingManagement.model;

/**
 * Created by Koujianing
 * Date: 2020/6/10
 * Time: 18:39
 */
public class Temporary {
	private long temporaryParkingId= -1;
	private long temporaryICCard= -1;
	private String parkCardNumber = null;
	private String enterDate = null;
	private String outDate = null;
	private String parkingMoney = null;

	public Temporary(){
		super();
	}
	public Temporary mixinData(Temporary temporary){
		if(temporary.temporaryParkingId != -1){
			this.temporaryParkingId = temporary.temporaryParkingId;
		}
		if(temporary.temporaryICCard != -1)
		{
			this.temporaryICCard = temporary.temporaryICCard;
		}
		if(temporary.parkCardNumber != null){
			this.parkCardNumber = temporary.parkCardNumber;
		}
		if(temporary.enterDate != null){
			this.enterDate = temporary.enterDate;
		}
		if(temporary.outDate != null){
			this.outDate = temporary.outDate;
		}
		if(temporary.parkingMoney != null){
			this.parkingMoney = temporary.parkingMoney;
		}
		return this;
	}
	public long getTemporaryParkingId () {
		return temporaryParkingId;
	}

	public void setTemporaryParkingId (long temporaryParkingId) {
		this.temporaryParkingId = temporaryParkingId;
	}

	public long getTemporaryICCard () {
		return temporaryICCard;
	}

	public void setTemporaryICCard (long temporaryICCard) {
		this.temporaryICCard = temporaryICCard;
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

	public String getOutDate () {
		return outDate;
	}

	public void setOutDate (String outDate) {
		this.outDate = outDate;
	}

	public String getParkingMoney () {
		return parkingMoney;
	}

	public void setParkingMoney (String parkingMoney) {
		this.parkingMoney = parkingMoney;
	}

	@Override
	public String toString () {
		return "Temporary{" +
				"temporaryParkingId=" + temporaryParkingId +
				", temporaryICCard=" + temporaryICCard +
				", parkCardNumber='" + parkCardNumber + '\'' +
				", enterDate='" + enterDate + '\'' +
				", outDate='" + outDate + '\'' +
				", parkingMoney='" + parkingMoney + '\'' +
				'}';
	}
}
