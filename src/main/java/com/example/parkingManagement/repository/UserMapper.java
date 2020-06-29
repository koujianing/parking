package com.example.parkingManagement.repository;

import com.example.parkingManagement.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by Koujianing
 * Date: 2020/6/10
 * Time: 18:02
 */
@Mapper
public interface UserMapper {
	User selectByPrimaryKey (long id);
	List<User> selectUser();
	void insertUser(User user);
	void updateUser(User user);
}
