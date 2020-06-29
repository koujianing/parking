package com.example.parkingManagement.service;

import com.example.parkingManagement.model.Record;
import com.sun.org.apache.regexp.internal.RE;

import java.util.List;

/**
 * Created by Koujianing
 * Date: 2020/6/10
 * Time: 20:34
 */
public interface RecordService {
	public Record getRecordById (long recordId);
	List<Record> listRecord (int page, int pageSize);
	public void postRecord (Record record);
	public void putRecord (Record record);
}
