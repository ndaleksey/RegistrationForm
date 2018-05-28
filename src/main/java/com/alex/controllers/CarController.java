package com.alex.controllers;

import com.alex.infrastructure.CarSearchCriteria;
import com.alex.models.Car;
import com.alex.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by Shishkov A.V. on 20.04.18.
 */
@Controller
@RequestMapping(value = "/cars")
public class CarController {

	@Autowired
	private CarService carService;

	@PostConstruct
	private void init() {
		carService.generateDummyCars();
	}

	@GetMapping(path = "/cars_list")
	public String getAllCars(Model model){
		List<Car> cars = carService.findCars(null);
		model.addAttribute("cars", cars);
		return "/cars/cars_list";
	}

	@PostMapping(path = "/cars_list")
	public void findCar(@ModelAttribute("carSearchCriteria") CarSearchCriteria criteria) {

	}
}
