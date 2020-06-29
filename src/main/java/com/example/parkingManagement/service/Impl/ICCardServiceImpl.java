package com.example.parkingManagement.service.Impl;

import com.example.parkingManagement.model.IC_Card;
import com.example.parkingManagement.repository.ICCardMapper;
import com.example.parkingManagement.service.ICCardService;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Koujianing
 * Date: 2020/6/10
 * Time: 21:23
 */
@Service("ICCardService")
public class ICCardServiceImpl implements ICCardService {
	@Resource
	private ICCardMapper icCardMapper;
	@Override
	public IC_Card getIcCardById(long id){
		return icCardMapper.selectByPrimaryKey(id);
	}
	@Override
	public List<IC_Card> listIcCard(int page, int pageSize) {
		List<IC_Card> result = null;
		try {
			PageHelper.startPage(page,pageSize);
			PageHelper.orderBy("icCardId ASC ");
			result = icCardMapper.selectIcCard();
		}catch (Exception e){
			e.printStackTrace();
		}
		return result;
	}
	@Override
	public void postIcCard(IC_Card icCard){

		icCardMapper.insertIcCard(icCard);
	}
	@Override
	public void putIcCard(IC_Card icCard){

		icCardMapper.updateIcCard(icCard);
	}


}
