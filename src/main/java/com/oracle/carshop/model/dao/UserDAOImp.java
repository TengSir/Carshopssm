package com.oracle.carshop.model.dao;

import com.oracle.carshop.model.bean.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component("userDAO")
public class UserDAOImp extends BaseDAO implements UserDAO {
    public User getInfoByUAndP(String username, String password) {
        return  getSqlSession().getMapper(UserDAO.class).getInfoByUAndP(username,password);
    }

    public boolean registerUser(User user) {

     return  getSqlSession().getMapper(UserDAO.class).registerUser(user);

    }
}
