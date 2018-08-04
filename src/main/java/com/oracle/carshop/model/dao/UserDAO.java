package com.oracle.carshop.model.dao;

import com.oracle.carshop.model.bean.User;

public interface UserDAO {

    public User  getInfoByUAndP(String username,String password);
}
