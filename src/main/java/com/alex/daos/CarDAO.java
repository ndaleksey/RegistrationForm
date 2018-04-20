package com.alex.daos;

import com.alex.infrastructure.CarSearchCriteria;
import com.alex.models.Car;

import java.util.List;

/**
 * Created by Shishkov A.V. on 20.04.18.
 */
public interface CarDAO {
	List<Car> getAllCars();

	List<Car> getCars(CarSearchCriteria criteria);

	void addCars(Car... cars);
}
