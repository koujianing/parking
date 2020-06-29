package com.example.parkingManagement.service.Impl;

import com.example.parkingManagement.model.Emp;
import com.example.parkingManagement.repository.EmpMapper;
import com.example.parkingManagement.service.EmpService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Koujianing
 * Date: 2020/6/28
 * Time: 18:02
 */
@Service("empService")
public class EmpServiceImpl implements EmpService {
	@Resource
	private EmpMapper empMapper;
//	@Override
//	public List<Test> listTest(){
//		return testMapper.getAll();
//	}
	@Override
	public Emp getEmpById(long empno){
		return empMapper.selectByPrimaryKey(empno);
	}
	@Override
	public List<Emp> listEmp(){
		return empMapper.selectEmp();
	}
	@Override
	public void postEmp(Emp emp){
		empMapper.insertEmp(emp);
	}
	@Override
	public void putEmp(Emp emp){
		empMapper.updateEmp(emp);
	}
	@Override
	public void delEmp(long empno){
		empMapper.deleteEmp(empno);
	}

}
