package com.oracle.carshop.service;

import com.oracle.carshop.model.bean.User;
import com.oracle.carshop.model.dao.SessionFactoryHelper;
import com.oracle.carshop.model.dao.UserDAO;
import org.springframework.stereotype.Component;

@Component("userSerice")
public class UserServiceImp implements UserService {
    private UserDAO  userDAO;

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public User processLogin(User user) {
        //server do other something
        //check ip      jiami  security
        User u= userDAO.getInfoByUAndP(user.getUsername(),user.getPassword());
        return u;
    }

    public boolean regiserUser(User user) {
        return userDAO.registerUser(user);
    }
}
