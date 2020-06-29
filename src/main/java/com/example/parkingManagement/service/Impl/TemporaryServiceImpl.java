package com.example.parkingManagement.service.Impl;

import com.example.parkingManagement.model.Record;
import com.example.parkingManagement.model.Temporary;
import com.example.parkingManagement.repository.TemporaryMapper;
import com.example.parkingManagement.service.TemporaryService;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Koujianing
 * Date: 2020/6/10
 * Time: 22:13
 */
@Service("temporaryService")
public class TemporaryServiceImpl implements TemporaryService {
	@Resource
	private TemporaryMapper temporaryMapper;
	@Override
	public Temporary getTemporaryById(long id){
		return temporaryMapper.selectByPrimaryKey(id);
	}
	@Override
	public List<Temporary> listTemporary(int page, int pageSize){
		List<Temporary> result = null;
		try {
			PageHelper.startPage(page,pageSize);
			PageHelper.orderBy("temporaryParkingId ASC");
			result = temporaryMapper.selectTemporary();
//			result = temporaryMapper.selectTemporary()
		}catch (Exception e){
			e.printStackTrace();
		}
		return result;
	}
	@Override
	public void postTemporary(Temporary temporary){
		temporaryMapper.insertTemporary(temporary);
	}
	@Override
	public void putTemporary(Temporary temporary){
		temporaryMapper.updateTemporary(temporary);
	}

}
