package com.example.parkingManagement.service;

import com.example.parkingManagement.model.Test;

import java.util.List;

/**
 * Created by Koujianing
 * Date: 2020/6/28
 * Time: 14:08
 */
public interface TestService {
	public Test selectTestId(long id);
	public List<Test> listTest ();
	public void insertTest (Test test);
	public void updateTest(Test test);
	public void deleteTest(long  id);
}
