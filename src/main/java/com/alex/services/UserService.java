package com.alex.services;

import com.alex.models.User;

import java.util.List;

/**
 * Created by Shishkov A.V. on 09.04.18.
 */
public interface UserService {
	List<User> getUsers();

	void addUser(User user);

	void addUsers(List<User> users);

	void updateUser(User user);

	List<User> findUsersByName(String name);
}
