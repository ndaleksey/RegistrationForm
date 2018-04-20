package com.alex.controllers;


import com.alex.models.User;
import com.alex.infrastructure.UserSearchCriteria;
import com.alex.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Collection;
import java.util.UUID;

/**
 * Created by Shishkov A.V. on 09.04.18.
 */
@Controller
@RequestMapping(value = "/users")
public class UserController {
	@PersistenceContext
	private EntityManager entityManager;

	@Autowired
	private UserService userService;

	@ModelAttribute
	public UserSearchCriteria criteria() {
		return new UserSearchCriteria();
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

	@RequestMapping(value = "/editUser", method = RequestMethod.POST)
	public String handleInsertNewUser(HttpServletRequest request, HttpSession session) {
		return "redirect:/users";
	}

	@RequestMapping(value = "/newUser", method = RequestMethod.POST)
	public String addNewUser(@ModelAttribute(name = "user") User user) {
		userService.addUser(user);

		return "redirect:/users";
	}

	@RequestMapping(value = "/editUser", method = RequestMethod.GET)
	public String editUser(@SessionAttribute(value = "currentUser") User user, ModelMap modelMap) {
		modelMap.addAttribute("user", user);
		return "newUser";
	}

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public Collection<User> searchUsers(@ModelAttribute(name = "userSearchCriteria") UserSearchCriteria criteria) {
		return userService.findUsers(criteria);
	}

	@RequestMapping(value = "/detail/{userId}")
	public String showUserDetails(@PathVariable("userId") UUID userId, Model model) {
		User user = userService.findUserById(userId);
		model.addAttribute(user);
		return "users/detail";
	}
}
