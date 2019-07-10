package com.javaspringclub.service;

import java.util.List;
import com.javaspringclub.entity.User;

/**
 * This is a user Services
 * this is a second Comment on git 
 */
public interface UserService {
	public List<User> getAllUsers();
	public User getUserById(Long id);
	public boolean saveUser(User user);
	public boolean deleteUserById(Long id);

}
