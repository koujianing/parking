package com.example.parkingManagement.service.Impl;

import com.example.parkingManagement.model.User;
import com.example.parkingManagement.repository.UserMapper;
import com.example.parkingManagement.service.UserService;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Koujianing
 * Date: 2020/6/10
 * Time: 18:06
 */
@Service("userService")
public class UserServiceImpl implements UserService {
	//注入mapper类
	@Resource
	private UserMapper userMapper;
	@Override
	public User getUserById(long userId) {
		return userMapper.selectByPrimaryKey(userId);
	}
	@Override
	public List<User> listUser(int page, int pageSize) {
		List<User> result = null;
		try {
			PageHelper.startPage(page,pageSize);
			PageHelper.orderBy("userId ASC ");
			result = userMapper.selectUser();
		}catch (Exception e){
			e.printStackTrace();
		}
		return result;
	}
	@Override
	public void postUser(User user){
		userMapper.insertUser(user);
	}
	@Override
	public void putUser(User user){
		userMapper.updateUser(user);
	}
}
