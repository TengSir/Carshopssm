package com.oracle.carshop.service;

import com.oracle.carshop.model.bean.User;
import org.springframework.stereotype.Component;


public interface UserService {
    public User  processLogin(User user);
}
