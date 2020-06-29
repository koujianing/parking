package com.example.parkingManagement.service;

import com.example.parkingManagement.model.Emp;

import java.util.List;

/**
 * Created by Koujianing
 * Date: 2020/6/28
 * Time: 17:58
 */
public interface EmpService {
	public Emp getEmpById (long empno);
	List<Emp> listEmp ();
	public void postEmp (Emp emp);
	public void putEmp (Emp emp);
	public void delEmp(long empno);
}
