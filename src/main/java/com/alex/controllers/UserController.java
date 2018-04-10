package com.alex.controllers;


import com.alex.models.User;
import com.alex.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Shishkov A.V. on 09.04.18.
 */
@Controller
@RequestMapping(value = "/users")
public class UserController {
	private UserService userService;

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView printForm() {
		ModelAndView modelAndView = new ModelAndView("users");
		modelAndView.addObject("users", userService.getUsers());
		return modelAndView;
	}

	@RequestMapping(value = "/newUser", method = RequestMethod.GET)
	public String showUserForm(ModelMap modelMap) {
		User user = new User();
		modelMap.addAttribute("user", user);

		return "newUser";
	}

	/*@RequestMapping(value = "/newUser", method = RequestMethod.GET)
	public String showUserForm(@ModelAttribute(name = "user") User user) {
		return "newUser";
	}*/

	@RequestMapping(value = "/newUser", method = RequestMethod.POST)
	public String addNewUser(@ModelAttribute(name = "user") User user) {
		userService.addUser(user);
		return "redirect:/users";
	}
}
