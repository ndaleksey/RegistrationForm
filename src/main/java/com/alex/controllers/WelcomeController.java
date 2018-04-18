package com.alex.controllers;

import com.alex.models.User;
import com.alex.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Shishkov A.V. on 10.04.18.
 */
@Controller
public class WelcomeController {
	@Autowired
	private UserService userService;

	private List<User> users = new LinkedList<>(Arrays.asList(
			new User("Alex", 30, "Russia"),
			new User("Kent", 35, "USA"),
			new User("Mark", 20, "Israel"),
			new User("Hanna", 25, "Germany")));

	@PostConstruct
	public void init() {
		userService.addUsers(users);
	}

	@RequestMapping(value = "/welcome")
	public String showWelcome() {
		return "users/search";
	}

	@RequestMapping(value = "/home")
	public String showHome() {
		return "users/search";
	}

	@RequestMapping(value = "/error")
	public String showError() {
		return "error";
	}
}
