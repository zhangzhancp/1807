package cn.tedu.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.tedu.ssm.pojo.User;
import cn.tedu.ssm.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping("/findAll")
	@ResponseBody
	public List<User> findAll(){
		return userService.findAll();
	}
	@RequestMapping("/get/{id}") //RESTful支持
	@ResponseBody
	public User get(@PathVariable Integer id) {
		return userService.get(id);
	}
	@RequestMapping("/add/{name}/{birthday}/{address}")
	public String add(User user) {
		try {
			userService.add(user);
			return "add success";
		} catch (Exception e) {
			e.printStackTrace();
			return "add Error";
		}
	}
	@RequestMapping("/update/{name}/{birthday}/{address}/{id}")
	public String update(User user) {
		
		try {
			userService.update(user);
			return "update success";
		} catch (Exception e) {
			e.printStackTrace();
			return "update error";
		}
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable Integer id) {
		try {
			userService.delete(id);
			return "delete success";
		} catch (Exception e) {
			e.printStackTrace();
			return "delete error";
		}
		
	}
}
