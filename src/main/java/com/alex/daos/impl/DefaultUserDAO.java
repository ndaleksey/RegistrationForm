package com.alex.daos.impl;

import com.alex.daos.UserDAO;
import com.alex.models.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Shishkov A.V. on 09.04.18.
 */
@Transactional
@Repository
public class DefaultUserDAO implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<User> getUsers() {
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

		for (User user : users) {
			session.save(user);
		}
	}

	@Override
	public void updateUser(User user) {
	}

	@Override
	public List<User> getUsersByName(String name) {
		String sql = "from User";
		boolean condition = name != null && !name.isEmpty();
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(sql + (condition ? " where name = :name" : ""));
		if (condition) query.setParameter("name", name);
		List<User> result = query.list();
		return result;
	}
}
