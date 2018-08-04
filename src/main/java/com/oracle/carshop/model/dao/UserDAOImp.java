package com.oracle.carshop.model.dao;

import com.oracle.carshop.model.bean.User;
import org.springframework.stereotype.Component;

@Component("userDAO")
public class UserDAOImp extends BaseDAO implements UserDAO {
    public User getInfoByUAndP(String username, String password) {
       UserDAO  dao= getSession().getMapper(UserDAO.class);
        return  dao.getInfoByUAndP(username,password);
    }
}
