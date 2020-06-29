package com.example.parkingManagement.service;

import com.example.parkingManagement.model.IC_Card;

import javax.swing.*;
import java.util.List;

/**
 * Created by Koujianing
 * Date: 2020/6/10
 * Time: 20:12
 */
public interface ICCardService {
//	public User getUserById (long userId);
//	List<User> listUser (int page, int pageSize);
//	public void postUser(User user);
//	public void putUser(User user);
	public IC_Card getIcCardById (long icCardId);
	List<IC_Card> listIcCard (int page, int pageSize);
	public void postIcCard (IC_Card icCard);
	public void putIcCard (IC_Card icCard);
}
