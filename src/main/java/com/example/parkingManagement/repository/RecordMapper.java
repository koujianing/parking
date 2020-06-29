package com.example.parkingManagement.repository;

import com.example.parkingManagement.model.Record;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by Koujianing
 * Date: 2020/6/10
 * Time: 20:07
 */
@Mapper
public interface RecordMapper {
	Record selectByPrimaryKey(long id);
	List<Record> selectRecord();
	void inertRecord(Record record);
	void updateRecord(Record record);
}
