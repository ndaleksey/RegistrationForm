package com.alex.services.impl;

import com.alex.daos.UserDAO;
import com.alex.models.User;
import com.alex.models.UserSearchCriteria;
import com.alex.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;

/**
 * Created by Shishkov A.V. on 09.04.18.
 */
public class DefaultUserService implements UserService {
	@Autowired
	private UserDAO userDAO;
//	private UserFacade userFacade;

	/*@Required
	public void setUserFacade(UserFacade userFacade) {
		this.userFacade = userFacade;
	}*/

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
	public List<User> findUsers(UserSearchCriteria criteria) {
		return userDAO.getUsers(criteria);
	}

	@Override
	public User findUserById(UUID userId) {
		return userDAO.getUserById(userId);
	}
}
