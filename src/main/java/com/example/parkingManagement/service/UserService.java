package com.example.parkingManagement.service;

import com.example.parkingManagement.model.User;

import java.util.List;

/**
 * Created by Koujianing
 * Date: 2020/6/10
 * Time: 18:03
 */
public interface UserService {
	public User getUserById (long userId);
	List<User> listUser (int page, int pageSize);
	public void postUser (User user);
	public void putUser (User user);
}
