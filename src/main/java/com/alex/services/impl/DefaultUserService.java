package com.alex.services.impl;

import com.alex.facades.UserFacade;
import com.alex.models.User;
import com.alex.services.UserService;
import org.springframework.beans.factory.annotation.Required;

import java.util.List;
import java.util.UUID;

/**
 * Created by Shishkov A.V. on 09.04.18.
 */
public class DefaultUserService implements UserService {
	private UserFacade userFacade;

	@Required
	public void setUserFacade(UserFacade userFacade) {
		this.userFacade = userFacade;
	}

	@Override
	public List<User> getUsers() {
		return userFacade.getUsers();
	}

	@Override
	public void addUser(User user) {
		userFacade.addUser(user);
	}

	@Override
	public void addUsers(List<User> users) {
		userFacade.addUsers(users);
	}

	@Override
	public void updateUser(User user) {
		userFacade.updateUser(user);
	}

	@Override
	public List<User> findUsersByName(String name) {
		return userFacade.findUsersByName(name);
	}

	@Override
	public User findUserById(UUID userId) {
		return userFacade.findUserById(userId);
	}
}
