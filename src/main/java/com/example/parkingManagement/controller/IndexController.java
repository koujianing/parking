package com.example.parkingManagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Koujianing
 * Date: 2020/6/11
 * Time: 9:32
 */
@Controller
public class IndexController {
	@RequestMapping("/index")
	public String index() {

		return "index";
	}
}
