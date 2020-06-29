package com.example.parkingManagement.service.Impl;

import com.example.parkingManagement.model.Test;
import com.example.parkingManagement.repository.TestMapper;
import com.example.parkingManagement.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Koujianing
 * Date: 2020/6/28
 * Time: 14:10
 */
@Service("testService")
public class TestServiceImpl implements TestService {
	@Resource
	private TestMapper testMapper;

	@Override
	public Test selectTestId (long id) {
		return testMapper.get(id);
	}

	@Override
	public List<Test> listTest () {
		return testMapper.getAll();
	}

	@Override
	public void insertTest (Test test) {
		testMapper.insert(test);
	}

	@Override
	public void updateTest (Test test) {
		testMapper.update(test);
	}

	@Override
	public void deleteTest (long id) {
		testMapper.delete(id);
	}
}
