package com.alex.daos;

import com.alex.models.User;
import com.alex.infrastructure.UserSearchCriteria;

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

	List<User> getUsers(UserSearchCriteria criteria);

	User getUserById(UUID userId);
}
