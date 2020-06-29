package com.example.parkingManagement.repository;

import com.example.parkingManagement.model.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by Koujianing
 * Date: 2020/6/28
 * Time: 17:52
 */
@Mapper
public interface DeptMapper {
	Dept selectByPrimaryKey(long deptno);
	List<Dept> selectDept();
	void insertDept(Dept dept);
	void updateDept(Dept dept);
	void deleteDept(long deptno);
}
