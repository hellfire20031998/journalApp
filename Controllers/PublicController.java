package com.hellFire.journalApp.Controllers;


import com.hellFire.journalApp.Service.UserService;
import com.hellFire.journalApp.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/public")
public class PublicController {
    @Autowired
    private UserService userService;

    @GetMapping("/health-check")
    public  String healthCheck(){
        return  "Ok";
    }

    @PostMapping("/create-user")
    public void createUser(@RequestBody User user){
            userService.saveNewUser(user);
//            System.out.println(user);

    }
}
