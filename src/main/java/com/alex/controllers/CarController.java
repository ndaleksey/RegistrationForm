package com.alex.controllers;

import com.alex.infrastructure.CarSearchCriteria;
import com.alex.models.Car;
import com.alex.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	public void generateCars(){
		carService.generateDummyCars();
	}

	@RequestMapping("/search")
	public List<Car> findCars(@ModelAttribute("CarSearchCriteria") CarSearchCriteria criteria){
		return carService.findCars(criteria);
	}
}
