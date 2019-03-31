package com.mybatiestext.service;

import com.mybatiestext.entity.User;

public interface  UserService {
    public User getUserById(int userId);

    boolean addUser(User record);
}
