package com.alex.daos.impl;

import com.alex.daos.UserDAO;
import com.alex.models.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import javax.swing.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Shishkov A.V. on 09.04.18.
 */
public class DefaultUserDAO implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}



	@Override
	public List<User> getUsers() {
//		List<User> users = new LinkedList<>();
		Session session = sessionFactory.getCurrentSession();
		List<User> users = session.createQuery("from User").list();

		return users;
	}

	@Override
	public void addUser(User user) {
		Session session = sessionFactory.getCurrentSession();
		session.save(user);
	}

	@Override
	public void addUsers(List<User> users) {
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();

		for (User user : users) {

			session.createQuery("insert into User(id, name, age, country) values(user.)");
		}
		session.close();

	}
}
