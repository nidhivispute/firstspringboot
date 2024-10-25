package com.nidhi.__min_demo.web;

//import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nidhi.__min_demo.domain.User;
import com.nidhi.__min_demo.service.UserService;

@RestController
@RequestMapping("/api/users")

public class UserController {

    private UserService userService;
    

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/getallusers")
    public String index (ModelMap model) {
        model.put("user", new User());
        model.put("users", userService.findALL());

        return "index";        
    }

    @PostMapping("")
    public String createUser (User user){
        userService.save(user);
        return "redirect:/";
    }

}
