package com.li.service;

import com.li.dao.UserDao;
import com.li.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public List<User> getAll() {
		return userDao.getAll();
	}

	@Override
	public User getUserById(int id) {
		return userDao.getUserById(id);
	}


}
