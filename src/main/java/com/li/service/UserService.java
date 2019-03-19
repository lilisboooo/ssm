package com.li.service;


import com.li.pojo.User;

import java.util.List;


public interface UserService {
	List<User> getAll();
	User getUserById(int id);

}
