package com.example.cheesemvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CheeseController<controller> {
    @RequestMapping(value = "")
    @ResponseBody
    public String index() {
        return "My Cheese";
    }
}
