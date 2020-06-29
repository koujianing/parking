package com.example.parkingManagement.controller;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import com.example.parkingManagement.model.User;
import com.example.parkingManagement.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 用户控制器类
 */
@Controller
//@RestController
@EnableAutoConfiguration
@RequestMapping("/user")
public class UserController {
	// 依赖注入
//	@Autowired
	@Resource
	private UserService userService;

	@RequestMapping(value = "{id}", method = RequestMethod.GET, produces = "application/json")
	public User getUser (@PathVariable long id) throws Exception {
		User user = this.userService.getUserById(id);
		return user;
	}

	@RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
	public PageInfo<User> listUser (
			@RequestParam(value = "page", required = false, defaultValue = "1") int page,
			@RequestParam(value = "page-size", required = false, defaultValue = "5") int pageSize) {
		List<User> result = userService.listUser(page, pageSize);
		//PageInfo包装结果，返回更多的分页相关信息
		PageInfo<User> pi = new PageInfo<User>(result);
		return pi;
	}
	@RequestMapping(value = "", method = RequestMethod.POST, produces = "application/json")
	public void postUser (User user) throws Exception {
//		System.out.println("user post controller");
		this.userService.postUser(user);
	}

	@RequestMapping(value = "{id}", method = RequestMethod.PUT, produces = "application/json")
	public void putUser (@PathVariable long id, User user) {
		User oldUser = this.userService.getUserById(id);
		user.setUserId(id);
		User newUser = oldUser.mixinData(user);
		this.userService.putUser(newUser);
	}

	@RequestMapping(value = "{id}", method = RequestMethod.DELETE, produces = "application/json")
	public void deleteUser (@PathVariable long id, User user) {
		User oldUser = this.userService.getUserById(id);
		User user1 = new User();
		user1.setUserId(id);
		User newUser = oldUser.mixinData(user);
		this.userService.putUser(newUser);
	}
	/**
	 * 用户登录
	 */
//	@RequestMapping(value = "/login.action", method = RequestMethod.POST)
//	public String login(String usercode,String password, Model model,
//                                                          HttpSession session) {
//		// 通过账号和密码查询用户
//		User user = userService.findUser(usercode, password);
//		if(user != null){
//			// 将用户对象添加到Session
//			session.setAttribute("USER_SESSION", user);
//			// 跳转到主页面
////			return "customer";
//			return "redirect:customer/list.action";
//		}
//		model.addAttribute("msg", "账号或密码错误，请重新输入！");
//         // 返回到登录页面
//		return "login";
//	}

	/**
	 * 模拟其他类中跳转到客户管理页面的方法
	 */
	@RequestMapping(value = "/toCustomer.action")
	public String toCustomer() {
	    return "customer";
	}

	/**
	 * 退出登录
	 */
	@RequestMapping(value = "/logout.action")
	public String logout(HttpSession session) {
	    // 清除Session
	    session.invalidate();
	    // 重定向到登录页面的跳转方法
	    return "redirect:login.action";
	}
	/**
	 * 向用户登陆页面跳转
	 */
	@RequestMapping(value = "/login.action", method = RequestMethod.GET)
	public String toLogin() {
	    return "login";
	}


}
