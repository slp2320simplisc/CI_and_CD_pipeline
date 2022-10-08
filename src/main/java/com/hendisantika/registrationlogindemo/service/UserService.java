package com.hendisantika.registrationlogindemo.service;


import com.hendisantika.registrationlogindemo.model.User;


public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
