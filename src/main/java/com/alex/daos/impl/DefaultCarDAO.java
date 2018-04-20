package com.alex.daos.impl;

import com.alex.daos.CarDAO;
import com.alex.infrastructure.CarSearchCriteria;
import com.alex.models.Car;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * Created by Shishkov A.V. on 20.04.18.
 */
@Transactional
@Repository
public class DefaultCarDAO implements CarDAO {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public List<Car> getAllCars() {
		Session session = sessionFactory.getCurrentSession();

		return session.createQuery("from Car order by name").list();
	}

	@Override
	public List<Car> getCars(CarSearchCriteria criteria) {
		if (criteria == null) throw new IllegalArgumentException(System.getProperty("car.search.criteria_is_empty"));

		String name = criteria.getName();

		if (name.isEmpty())
			return getAllCars();

		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Car where name like :name");
		query.setParameter("name", name);

		return query.list();
	}

	@Override
	public void addCars(Car... cars) {
		if (cars.length == 0) return;

		Session session = sessionFactory.getCurrentSession();

		for (Car car : cars) {
			try {
				saveCarDetails(car);
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("Generation");

			session.save(car);
		}
	}

	private void saveCarDetails(Car car) throws IOException {
		if (car == null) return;

		File file = new File("/home/alexeyshishkov/Cars.txt");
		try (FileWriter fileWriter = new FileWriter(file, true)) {
			try (BufferedWriter writer = new BufferedWriter(fileWriter)) {
				writer.write(String.format("%1$s vin(%2$s) engine_vin(%3$s)", car.getName(), car.getVin(), car
						.getEngine()
						.getVin()));
				writer.newLine();
			}
		}
	}
}
