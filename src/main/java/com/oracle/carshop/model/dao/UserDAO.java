package com.oracle.carshop.model.dao;

import com.oracle.carshop.model.bean.User;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public interface UserDAO {

     User  getInfoByUAndP(String username,String password);
     boolean registerUser(User user);
}
