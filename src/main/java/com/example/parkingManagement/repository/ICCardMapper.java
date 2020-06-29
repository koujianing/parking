package com.example.parkingManagement.repository;

import com.example.parkingManagement.model.IC_Card;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by Koujianing
 * Date: 2020/6/10
 * Time: 19:52
 */
@Mapper
public interface ICCardMapper {
	IC_Card selectByPrimaryKey (long id);

	List<IC_Card> selectIcCard ();

	void insertIcCard (IC_Card icCard);

	void updateIcCard (IC_Card icCard);
}
