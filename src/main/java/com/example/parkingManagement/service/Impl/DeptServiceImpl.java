package com.example.parkingManagement.service.Impl;

import com.example.parkingManagement.model.Dept;
import com.example.parkingManagement.repository.DeptMapper;
import com.example.parkingManagement.service.DeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Koujianing
 * Date: 2020/6/28
 * Time: 18:02
 */
@Service("deptService")
public class DeptServiceImpl implements DeptService {
	@Resource
	private DeptMapper deptMapper;
	@Override
	public Dept getDeptById(long deptno){
		return deptMapper.selectByPrimaryKey(deptno);
	}
	@Override
	public List<Dept> listDept(){
		return deptMapper.selectDept();
	}
	@Override
	public void postDept(Dept dept){
		deptMapper.insertDept(dept);
	}
	@Override
	public void putDept(Dept dept){
		deptMapper.updateDept(dept);
	}
	@Override
	public void delDept(long deptno){
		deptMapper.deleteDept(deptno);
	}

}
