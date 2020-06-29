package com.example.parkingManagement.controller;

import com.example.parkingManagement.model.Dept;
import com.example.parkingManagement.model.Emp;
import com.example.parkingManagement.repository.DeptMapper;
import com.example.parkingManagement.repository.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Koujianing
 * Date: 2020/6/29
 * Time: 11:00
 */
@Controller
@RequestMapping("/dept")
public class DeptController {
	@Autowired
	private DeptMapper deptMapper;

	@RequestMapping("/show")
	public String show (HttpServletRequest request) {
		request.setAttribute("list", deptMapper.selectDept());
		return "showDept";
	}

	@RequestMapping("/add")
	public String add (HttpServletRequest request) {
		request.setAttribute("router", "dept/save");
		return "aDept";
	}

	@RequestMapping(value = "/update/{deptno}", method = RequestMethod.GET)
	public String update (@PathVariable long deptno, HttpServletRequest request) {
//	testMapper.insert(test);
//	return "forward:show.do";
		request.setAttribute("data", deptMapper.selectByPrimaryKey(deptno));
		request.setAttribute("router", "dept/change");
		return "aDept";
	}

	@RequestMapping(value = "/change", method = RequestMethod.POST)
	public String change (Dept dept, HttpServletRequest request) {
		deptMapper.updateDept(dept);
//	System.out.println(test);
		request.setAttribute("operator", "更新");
//	return "forward:show.do";
		return "resultDept";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save (Dept dept, HttpServletRequest request) throws Exception {
		deptMapper.insertDept(dept);
//	System.out.println(test);
		request.setAttribute("operator", "保存");
//	return "forward:show.do";
		return "resultDept";
	}

	@RequestMapping(value = "/remove/{deptno}", method = RequestMethod.GET)
	public String remove (@PathVariable long deptno, HttpServletRequest request) throws Exception {
		deptMapper.deleteDept(deptno);
		request.setAttribute("operator", "删除");
		return "resultDept";
	}
}
