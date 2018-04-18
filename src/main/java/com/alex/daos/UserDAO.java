package com.alex.daos;

import com.alex.models.User;

import java.util.List;
import java.util.UUID;

/**
 * Created by Shishkov A.V. on 09.04.18.
 */
public interface UserDAO {
	List<User> getUsers();

	void addUser(User user);

	void addUsers(List<User> users);

	void updateUser(User user);

	List<User> getUsersByName(String name);

	User getUserById(UUID userId);
}
