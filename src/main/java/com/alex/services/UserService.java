package com.alex.services;

import com.alex.models.User;
import com.alex.models.UserSearchCriteria;

import java.util.List;
import java.util.UUID;

/**
 * Created by Shishkov A.V. on 09.04.18.
 */
public interface UserService {
	List<User> getUsers();

	void addUser(User user);

	void addUsers(List<User> users);

	void updateUser(User user);

	List<User> findUsers(UserSearchCriteria criteria);

	User findUserById(UUID userId);
}
