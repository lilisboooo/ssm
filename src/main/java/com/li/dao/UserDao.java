package com.li.dao;

import com.li.pojo.User;

import java.util.List;

public interface UserDao {
     List<User> getAll();
     User getUserById(int id);

}
