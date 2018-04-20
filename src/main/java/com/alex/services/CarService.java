package com.alex.services;

import com.alex.infrastructure.CarSearchCriteria;
import com.alex.models.Car;

import java.util.List;

/**
 * Created by Shishkov A.V. on 20.04.18.
 */
public interface CarService {
	List<Car> findCars(CarSearchCriteria criteria);

	List<Car> getAllCars();

	void importCars(Car... cars);

	void generateDummyCars();
}
