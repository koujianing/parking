package com.example.parkingManagement.model;

/**
 * Created by Koujianing
 * Date: 2020/6/10
 * Time: 18:29
 */
public class Parking {
	private long parkingId = -1;
	private String parkingNumber = null;
	private String parkingArea = null;
	private String parkingStatus = null;
	private String parkingRemark = null;

	public Parking(){
		super();
	}
	public Parking mixinData(Parking parking){
		if(parking.parkingId != -1){
			this.parkingId = parking.parkingId;
		}
		if(parking.parkingNumber != null){
			this.parkingNumber = parking.parkingNumber;
		}
		if(parking.parkingArea != null){
			this.parkingArea = parking.parkingArea;
		}
		if(parking.parkingStatus != null){
			this.parkingStatus = parking.parkingStatus;
		}
		if(parking.parkingRemark != null){
			this.parkingRemark = parking.parkingRemark;
		}
		return this;
	}
	public long getParkingId () {
		return parkingId;
	}

	public void setParkingId (long parkingId) {
		this.parkingId = parkingId;
	}

	public String getParkingNumber () {
		return parkingNumber;
	}

	public void setParkingNumber (String parkingNumber) {
		this.parkingNumber = parkingNumber;
	}

	public String getParkingArea () {
		return parkingArea;
	}

	public void setParkingArea (String parkingArea) {
		this.parkingArea = parkingArea;
	}

	public String getParkingStatus () {
		return parkingStatus;
	}

	public void setParkingStatus (String parkingStatus) {
		this.parkingStatus = parkingStatus;
	}

	public String getParkingRemark () {
		return parkingRemark;
	}

	public void setParkingRemark (String parkingRemark) {
		this.parkingRemark = parkingRemark;
	}

	@Override
	public String toString () {
		return "parking{" +
				"parkingId=" + parkingId +
				", parkingNumber='" + parkingNumber + '\'' +
				", parkingArea='" + parkingArea + '\'' +
				", parkingStatus='" + parkingStatus + '\'' +
				", parkingRemark='" + parkingRemark + '\'' +
				'}';
	}
}
