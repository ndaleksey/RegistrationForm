package com.alex.daos.impl;

import com.alex.daos.UserDAO;
import com.alex.models.User;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Shishkov A.V. on 09.04.18.
 */
public class DefaultUserDAO implements UserDAO {

	@Override
	public List<User> getUsers() {
		List<User> users = new LinkedList<>();
		users.add(new User("Alex", 30, "Russia"));
		users.add(new User("Kent", 35, "USA"));
		users.add(new User("Mark", 20, "Israel"));
		users.add(new User("Hanna", 25, "Germany"));
		return users;
	}
}
