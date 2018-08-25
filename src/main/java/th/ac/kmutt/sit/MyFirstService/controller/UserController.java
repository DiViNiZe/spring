package th.ac.kmutt.sit.MyFirstService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController

public class UserController {

    public UserController() {}

    @GetMapping("/user/1")
    public User getUser() {
        return new User(1,"Patric");
    }

    @GetMapping("/users")
    public ArrayList getAllUser(){
        ArrayList<User> users = new ArrayList();
       for (int i=0; i <100 ; i++){
            users.add(new User(i+1,"Test"+i));
       }
       return users;
    }

}
