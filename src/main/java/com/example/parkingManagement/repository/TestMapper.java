package com.example.parkingManagement.repository;

import com.example.parkingManagement.model.Test;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by Koujianing
 * Date: 2020/6/28
 * Time: 13:32
 */
@Mapper
public interface TestMapper {
	public Test get(long id);
	public List<Test> getAll ();
	public void insert(Test test);
	public void update(Test test);
	public void delete(long id);
}
