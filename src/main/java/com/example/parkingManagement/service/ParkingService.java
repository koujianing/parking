package com.example.parkingManagement.service;

import com.example.parkingManagement.model.Parking;

import java.util.List;

/**
 * Created by Koujianing
 * Date: 2020/6/10
 * Time: 20:27
 */
public interface ParkingService {
	public Parking getParkingById (long parkingId);
	public List<Parking> listParking (int page, int pageSize);
	public void postParking (Parking parking);
	public void putParking (Parking parking);
}
