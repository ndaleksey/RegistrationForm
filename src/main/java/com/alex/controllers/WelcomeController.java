package com.alex.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Shishkov A.V. on 10.04.18.
 */
@Controller
public class WelcomeController {
	@RequestMapping(value = "/welcome")
	public String showWelcome() {
		return "welcome";
	}

	@RequestMapping(value = "/home")
	public String showHome() {
		return "welcome";
	}
}
