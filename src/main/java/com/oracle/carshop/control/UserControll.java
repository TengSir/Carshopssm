package com.oracle.carshop.control;

import com.oracle.carshop.model.bean.User;
import com.oracle.carshop.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserControll {
    private UserService userSerice;

    public UserService getUserSerice() {
        return userSerice;
    }

    public void setUserSerice(UserService userSerice) {
        this.userSerice = userSerice;
    }

    @RequestMapping("/login")    //http://domanin/user/login
    public String  processLogin(@ModelAttribute("user") User  user){
        System.out.println(user);
        User u=userSerice.processLogin(user);
        if(u==null)
        {
            return "login";
        }else
        {
            return "index";
        }

    }
}
