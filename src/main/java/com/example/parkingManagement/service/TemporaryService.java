package com.example.parkingManagement.service;

import com.example.parkingManagement.model.Temporary;

import java.util.List;

/**
 * Created by Koujianing
 * Date: 2020/6/10
 * Time: 20:36
 */
public interface TemporaryService {
	public Temporary getTemporaryById (long temporaryParkingId);
	List<Temporary> listTemporary (int page, int pageSize);
	public void postTemporary (Temporary temporary);
	public void putTemporary (Temporary temporary);
}
