package com.example.parkingManagement.repository;

import com.example.parkingManagement.model.Emp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by Koujianing
 * Date: 2020/6/28
 * Time: 17:51
 */
@Mapper
public interface EmpMapper {
	Emp selectByPrimaryKey (long empno);

	List<Emp> selectEmp ();

	void insertEmp (Emp emp);

	void updateEmp (Emp emp);
	void deleteEmp (long empno);
}
