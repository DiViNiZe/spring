package th.ac.kmutt.sit.MyFirstService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLOutput;
import java.util.ArrayList;

@RestController

public class UserController {

    ArrayList<User> users = new ArrayList();

    public UserController() {
        for (int i=0; i < 50 ; i++){
            users.add(new User(i+1,"Test"+(i+1)));
        }
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable(value = "id") int id) {
        return(findUser(users,id));
    }

    public User findUser(ArrayList<User> users, int id) {
        User user = new User();
        for(User u : users){
            if(u.getId()== id) user=u;
        }
        return user;
    }

    @GetMapping("/user")
    public ArrayList getAllUser(){
      return this.users;
    }

}
