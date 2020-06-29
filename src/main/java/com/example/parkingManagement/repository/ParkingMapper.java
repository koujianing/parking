package com.example.parkingManagement.repository;

import com.example.parkingManagement.model.Parking;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by Koujianing
 * Date: 2020/6/10
 * Time: 19:54
 */
@Mapper
public interface ParkingMapper {
//	User selectByPrimaryKey (long id);
//	List<User> selectUser();
//	void insertUser(User user);
//	void updateUser(User user);
	Parking selectByPrimaryKey(Long id);
	List<Parking> selectParking();
	void insertParking(Parking parking);
	void updateParking(Parking parking);
}
