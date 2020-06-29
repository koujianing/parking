package com.example.parkingManagement.controller;

import com.example.parkingManagement.model.Emp;
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
 * Time: 9:14
 */
@Controller
@RequestMapping("/emp")
public class EmpController {
	@Autowired
	private EmpMapper empMapper;

	@RequestMapping("/show")
	public String show (HttpServletRequest request) {
		request.setAttribute("list", empMapper.selectEmp());
		return "showEmp";
	}

	@RequestMapping("/add")
	public String add (HttpServletRequest request) {
		request.setAttribute("router", "emp/save");
		return "addEmp";
	}

	@RequestMapping(value = "/update/{empno}", method = RequestMethod.GET)
	public String update (@PathVariable long empno, HttpServletRequest request) {
		request.setAttribute("data", empMapper.selectByPrimaryKey(empno));
		request.setAttribute("router", "emp/change");
		return "addEmp";
	}

	@RequestMapping(value = "/change", method = RequestMethod.POST)
	public String change (Emp emp, HttpServletRequest request) {
		empMapper.updateEmp(emp);
		request.setAttribute("operator", "更新");
		return "resultEmp";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save (Emp emp, HttpServletRequest request) throws Exception {
		empMapper.insertEmp(emp);
		request.setAttribute("operator", "保存");
		return "resultEmp";
	}

	@RequestMapping(value = "/remove/{empno}", method = RequestMethod.GET)
	public String remove (@PathVariable long empno, HttpServletRequest request) throws Exception {
		empMapper.deleteEmp(empno);
		request.setAttribute("operator", "删除");
		return "resultEmp";
	}


}
