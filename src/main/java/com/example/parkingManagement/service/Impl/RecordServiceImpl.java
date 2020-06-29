package com.example.parkingManagement.service.Impl;

import com.example.parkingManagement.model.Record;
import com.example.parkingManagement.repository.RecordMapper;
import com.example.parkingManagement.service.RecordService;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Koujianing
 * Date: 2020/6/10
 * Time: 22:02
 */
@Service("recordService")
public class RecordServiceImpl implements RecordService {
	@Resource
	private RecordMapper recordMapper;
	@Override
	public Record getRecordById(long id){
		return recordMapper.selectByPrimaryKey(id);
	}
	@Override
	public List<Record> listRecord(int page,int pageSize){
		List<Record> result = null;
		try {
			PageHelper.startPage(page,pageSize);
			PageHelper.orderBy("parkingId ASC");
			result = recordMapper.selectRecord();
		}catch (Exception e){
			e.printStackTrace();
		}
		return result;
	}
	@Override
	public void postRecord(Record record){
		recordMapper.inertRecord(record);
	}
	@Override
	public void putRecord(Record record){
		recordMapper.updateRecord(record);
	}

}
