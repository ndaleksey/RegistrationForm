package com.alex.controllers;


import com.alex.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Shishkov A.V. on 09.04.18.
 */
@Controller
public class UserController {
	private UserService userService;

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public ModelAndView printForm() {
		ModelAndView modelAndView = new ModelAndView("users");
		modelAndView.addObject("users", userService.getUsers());
		return modelAndView;
	}
}
