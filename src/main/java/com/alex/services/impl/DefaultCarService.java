package com.alex.services.impl;

import com.alex.daos.CarDAO;
import com.alex.infrastructure.CarSearchCriteria;
import com.alex.models.Car;
import com.alex.models.Engine;
import com.alex.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.awt.*;
import java.util.List;

/**
 * Created by Shishkov A.V. on 20.04.18.
 */
@Transactional
@Service
public class DefaultCarService implements CarService {
	@Autowired
	private CarDAO carDAO;

	/*@PostConstruct
	public void generateCars(){
		generateDummyCars();
	}*/

	public Car[] getDummyCars() {
		Car[] cars = new Car[]{
				new Car("Honda Civic", Color.blue, 2010, new Engine(200, 2.5), 1600, 900_000),
				new Car("Toyota Corolla", Color.white, 2016, new Engine(150, 2.0), 1600, 1_500_000),
				new Car("Hyundai Sonata", Color.black, 2015, new Engine(180, 2.4), 1500, 1_300_000),
				new Car("Skoda Octavia", Color.red, 2007, new Engine(102, 1.6), 1300, 300_000),
				new Car("Volkswagen Jetta", Color.gray, 2013, new Engine(180, 1.8), 1400, 800_000),
				new Car("Audi A4", Color.gray, 2015, new Engine(200, 2.0), 1600, 1_600_000),
		};
		return cars;
	}

	@Override
	public List<Car> findCars(CarSearchCriteria criteria) {
		return carDAO.getCars(criteria);
	}

	@Override
	public List<Car> getAllCars() {
		return carDAO.getAllCars();
	}

	@Override
	public void importCars(Car... cars) {
		carDAO.addCars(cars);
	}

	@Override
	public void generateDummyCars() {
		carDAO.addCars(getDummyCars());
	}
}