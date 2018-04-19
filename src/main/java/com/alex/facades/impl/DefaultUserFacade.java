package com.alex.facades.impl;

import com.alex.daos.UserDAO;
import com.alex.facades.UserFacade;
import com.alex.models.User;
import org.springframework.beans.factory.annotation.Required;

import java.util.List;
import java.util.UUID;

/**
 * Created by Shishkov A.V. on 09.04.18.
 */
public class DefaultUserFacade implements UserFacade {

	private UserDAO userDAO;

	@Required
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public List<User> getUsers() {
		return userDAO.getUsers();
	}

	@Override
	public void addUser(User user) {
		userDAO.addUser(user);
	}

	@Override
	public void addUsers(List<User> users) {
		userDAO.addUsers(users);
	}

	@Override
	public void updateUser(User user) {
		userDAO.updateUser(user);
	}

	@Override
	public List<User> findUsersByName(String name) {
		throw new UnsupportedOperationException("Method is not working");
	}

	@Override
	public User findUserById(UUID userId) {
		return userDAO.getUserById(userId);
	}
}
