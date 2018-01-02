package com.sagarandcompany.SpringSecurityExample.service;


import com.sagarandcompany.SpringSecurityExample.model.User;

public interface UserService {
    public User findUserByEmail(String email);

    public void saveUser(User user);
}
