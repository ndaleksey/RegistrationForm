package com.alex.facades;

import com.alex.models.User;

import java.util.List;

/**
 * Created by Shishkov A.V. on 09.04.18.
 */
public interface UserFacade {
	List<User> getUsers();

	void addUser(User user);
}
