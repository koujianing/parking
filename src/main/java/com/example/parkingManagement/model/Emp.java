package com.example.parkingManagement.model;

/**
 * Created by Koujianing
 * Date: 2020/6/28
 * Time: 17:18
 */
public class Emp {
	// 找不到啊   不知道哪里有问题
	private long empno = -1;
	private String ename = null;
	private String sex = null;
	private String head = null;
	private long deptno = -1;

	public Emp (long empno, String ename, String sex, String head, long deptno) {
		this.empno = empno;
		this.ename = ename;
		this.sex = sex;
		this.head = head;
		this.deptno = deptno;
	}
	public Emp(){
		super();
	}
	public Emp mixinData(Emp emp){
		if(emp.empno != -1){
			this.empno = emp.empno;
		}
		if(emp.ename != null){
			this.ename = emp.ename;
		}
		if(emp.sex != null){
			this.sex = emp.sex;
		}
		if(emp.head != null){
			this.head = emp.head;
		}
		if(emp.deptno != -1){
			this.deptno = emp.deptno;
		}
		return this;
	}

	public long getEmpno () {
		return empno;
	}

	public void setEmpno (long empno) {
		this.empno = empno;
	}

	public String getEname () {
		return ename;
	}

	public void setEname (String ename) {
		this.ename = ename;
	}

	public String getSex () {
		return sex;
	}

	public void setSex (String sex) {
		this.sex = sex;
	}

	public String getHead () {
		return head;
	}

	public void setHead (String head) {
		this.head = head;
	}

	public long getDeptno () {
		return deptno;
	}

	public void setDeptno (long deptno) {
		this.deptno = deptno;
	}
}
