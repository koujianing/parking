package com.example.parkingManagement.service;

import com.example.parkingManagement.model.Dept;

import java.util.List;

/**
 * Created by Koujianing
 * Date: 2020/6/28
 * Time: 17:58
 */
public interface DeptService {
	public Dept getDeptById (long deptno);
	List<Dept> listDept ();
	public void postDept (Dept dept);
	public void putDept (Dept dept);
	public void delDept(long deptno);
}
