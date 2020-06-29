package com.example.parkingManagement.repository;

import com.example.parkingManagement.model.Temporary;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by Koujianing
 * Date: 2020/6/10
 * Time: 20:09
 */
@Mapper
public interface TemporaryMapper {
	Temporary selectByPrimaryKey(Long id);
	List<Temporary> selectTemporary();
	void insertTemporary(Temporary temporary);
	void updateTemporary(Temporary temporary);
}
