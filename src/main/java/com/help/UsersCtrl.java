package com.help;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

// Controller annotation missing
@Controller
public class UsersCtrl {
    // GetMapping url did not have the correct path
    @GetMapping("/profile")
    @ResponseBody
    public String showProfile(){
        return "profile page placeholder";
    }
    //
    @PostMapping("/profile")
    @ResponseBody    // @RequestParam annotation is used here with the name of the expected form information
    public String getProfileInfo(@RequestParam("username") String username){
        System.out.println("username = " + username);
        return "profile page submission placeholder " + username;
    }

    @GetMapping("/users")
    @ResponseBody
    public List<String> showListOfUsers(){
        List<String> users = new ArrayList<>();
        // Addition to a list must happen before return statement
        users.add("Fer");
        users.add("Ryan");
        users.add("Sophie");
        return users;
    }

    @GetMapping("/forgotPassword")
    @ResponseBody // For a response @ResponseBody is necessary
    public String forgotPassword(){
        return "forgotPassword page placeholder";
    }

}
