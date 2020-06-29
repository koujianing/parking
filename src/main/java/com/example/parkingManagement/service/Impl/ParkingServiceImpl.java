package com.example.parkingManagement.service.Impl;

import com.example.parkingManagement.model.Parking;
import com.example.parkingManagement.repository.ParkingMapper;
import com.example.parkingManagement.service.ParkingService;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Koujianing
 * Date: 2020/6/10
 * Time: 21:54
 */
@Service("parkingService")
public class ParkingServiceImpl implements ParkingService {
	@Resource
	private ParkingMapper parkingMapper;
	@Override
	public Parking getParkingById(long parkingId){//getParkingById
		return parkingMapper.selectByPrimaryKey(parkingId);
	}
	@Override
	public List<Parking> listParking(int page,int pageSize){
		List<Parking> result = null;
		try {
			PageHelper.startPage(page,pageSize);
			PageHelper.orderBy("parkingId ASC ");
			result = parkingMapper.selectParking();
		}catch (Exception e){
			e.printStackTrace();
		}
		return result;
	}
	public void postParking(Parking parking){
		parkingMapper.insertParking(parking);
	}
	public void putParking(Parking parking){
		parkingMapper.updateParking(parking);
	}
}
