package com.example.parkingManagement.model;

/**
 * Created by Koujianing
 * Date: 2020/6/28
 * Time: 13:28
 */
public class Test {
	private long id = -1;
	private String name;

	public Test (long id, String name) {
		this.id = id;
		this.name = name;
	}

	public long getId () {
		return id;
	}

	public void setId (long id) {
		this.id = id;
	}

	public String getName () {
		return name;
	}

	public void setName (String name) {
		this.name = name;
	}
}
