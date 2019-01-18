package com.example.cheesemvc.controllers;

import com.example.cheesemvc.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;


@Controller
@RequestMapping("user")
public class UserController {

//    @RequestMapping(value = "", method=RequestMethod.GET)
//    public String index(Model model) {
//        return "user/add";
//
//    }

    // request path: /user
    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddUserForm(Model model) {
        model.addAttribute(new User());
        return "user/add";
    }
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String addUser(@ModelAttribute @Valid User user, String verify, Model model) {
        System.out.println(user.getPassword());
        if (verify.equals(user.getPassword())) {
            return "user/index";
        }
        else { return "user/add";}
    }

}
