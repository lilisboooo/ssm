package com.li.controller;

import com.li.pojo.User;
import com.li.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
	@Autowired
	private  UserService userService;
	@RequestMapping("user/getAll")
	@ResponseBody
	public List<User> getAll(){
		return  userService.getAll();
	}
	@RequestMapping("user/id")
	@ResponseBody
	public User getUserByid(){
		return  userService.getUserById(1);
	}
}
