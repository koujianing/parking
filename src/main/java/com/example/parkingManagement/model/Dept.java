package com.example.parkingManagement.model;

/**
 * Created by Koujianing
 * Date: 2020/6/28
 * Time: 17:32
 */
public class Dept {
	private long deptno;
	private String dname;

	public Dept (long deptno, String dname) {
		this.deptno = deptno;
		this.dname = dname;
	}

	public long getDeptno () {
		return deptno;
	}

	public void setDeptno (long deptno) {
		this.deptno = deptno;
	}

	public String getDname () {
		return dname;
	}

	public void setDname (String dname) {
		this.dname = dname;
	}
}
