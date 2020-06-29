package com.example.parkingManagement.model;

/**
 * Created by Koujianing
 * Date: 2020/6/10
 * Time: 18:08
 */
public class IC_Card {
	private long icCardId = -1;
	private String parkingNumber = null;
	private String userNickname = null;
	private String userSex = null;
	private String userAddress = null;
	private String parkCardNumber = null;

	public IC_Card(){
		super();
	}
	public IC_Card mixinData(IC_Card icCard){
		if(icCard.icCardId != -1){
			this.icCardId = icCard.icCardId;
		}
		if(icCard.parkingNumber != null){
			this.parkingNumber = icCard.parkingNumber;
		}
		if(icCard.userNickname != null){
			this.userNickname = icCard.userNickname;
		}
		if(icCard.userSex != null){
			this.userSex = icCard.userSex;
		}
		if(icCard.userAddress!= null){
			this.userAddress = icCard.userAddress;
		}
		if(icCard.parkCardNumber != null){
			this.parkCardNumber = icCard.parkCardNumber;
		}
		return this;
	}
	public long getIcCardId () {
		return icCardId;
	}

	public void setIcCardId (long icCardId) {
		this.icCardId = icCardId;
	}

	public String getParkingNumber () {
		return parkingNumber;
	}

	public void setParkingNumber (String parkingNumber) {
		this.parkingNumber = parkingNumber;
	}

	public String getUserNickname () {
		return userNickname;
	}

	public void setUserNickname (String userNickname) {
		this.userNickname = userNickname;
	}

	public String getUserSex () {
		return userSex;
	}

	public void setUserSex (String userSex) {
		this.userSex = userSex;
	}

	public String getUserAddress () {
		return userAddress;
	}

	public void setUserAddress (String userAddress) {
		this.userAddress = userAddress;
	}

	public String getParkCardNumber () {
		return parkCardNumber;
	}

	public void setParkCardNumber (String parkCardNumber) {
		this.parkCardNumber = parkCardNumber;
	}

	@Override
	public String toString () {
		return "IC_Card{" +
				"icCardId=" + icCardId +
				", parkingNumber=" + parkingNumber +
				", userNickname='" + userNickname + '\'' +
				", userSex='" + userSex + '\'' +
				", userAddress='" + userAddress + '\'' +
				", parkCardNumber='" + parkCardNumber + '\'' +
				'}';
	}
}
