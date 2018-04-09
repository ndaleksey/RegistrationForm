package com.alex.daos.impl;

import com.alex.daos.UserDAO;
import com.alex.models.User;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Shishkov A.V. on 09.04.18.
 */
public class DefaultUserDAO implements UserDAO {

	private List<User> users = new LinkedList<>(Arrays.asList(
			new User("Alex", 30, "Russia"),
			new User("Kent", 35, "USA"),
			new User("Mark", 20, "Israel"),
			new User("Hanna", 25, "Germany")));

	@Override
	public List<User> getUsers() {
		return users;
	}

	@Override
	public void addUser(User user) {
		users.add(user);
	}
}
