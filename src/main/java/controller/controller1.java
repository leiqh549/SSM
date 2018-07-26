package controller;

import entity.User;
import mapper.Usermapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/spring")
public class controller1 {
    @Autowired
    public Usermapper usermapper;
    @RequestMapping("/spring1")
    public String getsocial(User user1){
        List<User> L=usermapper.selectAll();
        if(L.contains(user1)){
            return "failure";
        }
        else return "success";
    }

}
