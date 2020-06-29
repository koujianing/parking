package com.example.parkingManagement.controller;

import com.example.parkingManagement.model.Test;
import com.example.parkingManagement.repository.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Koujianing
 * Date: 2020/6/28
 * Time: 13:33
 */
@Controller
@RequestMapping("/test")
public class TestController {
	@Autowired
	private TestMapper testMapper;

	@RequestMapping("/show")
	public String show (HttpServletRequest request) {
		request.setAttribute("list", testMapper.getAll());
		return "showTest";
	}

	@RequestMapping("/add")
	public String add (HttpServletRequest request) {
//		testMapper.insert(test);
//		return "forward:show.do";
		request.setAttribute("router", "test/save");
		return "add";
	}

	@RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
	public String update (@PathVariable long id, HttpServletRequest request) {
//		testMapper.insert(test);
//		return "forward:show.do";
		request.setAttribute("data", testMapper.get(id));
		request.setAttribute("router", "test/change");
		return "add";
	}

	@RequestMapping(value = "/change", method = RequestMethod.POST)
	public String change (Test test, HttpServletRequest request) {
		testMapper.update(test);
//		System.out.println(test);
		request.setAttribute("operator", "更新");
//		return "forward:show.do";
		return "result";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save (Test test, HttpServletRequest request) throws Exception {
		testMapper.insert(test);
//		System.out.println(test);
		request.setAttribute("operator", "保存");
//		return "forward:show.do";
		return "result";
	}

	@RequestMapping(value = "/remove/{id}", method = RequestMethod.GET)
	public String remove (@PathVariable long id, HttpServletRequest request) throws Exception {
		testMapper.delete(id);
//		System.out.println(test);
		request.setAttribute("operator", "删除");
//		return "forward:show.do";
		return "result";
	}

}
