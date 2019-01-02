package com.example.cheesemvc.controllers;

import com.example.cheesemvc.models.Cheese;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;


@Controller
@RequestMapping("cheese")
public class CheeseController {
    static HashMap<String, Cheese> cheeseObjects = new HashMap<>();
    static HashMap<String, String> cheeses = new HashMap<>();


    // request path: /cheese
    @RequestMapping(value = "")
    public String index(Model model) {

        /* Display content of cheeseObjects using Iterator*/
        for (Cheese c:cheeseObjects.values()){
            cheeses.put(c.getName(), c.getDescription());
        }
        model.addAttribute("cheeses", cheeses);
        model.addAttribute("title", "My Cheeses");
        return "cheese/index";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddCheeseForm(Model model) {

        model.addAttribute("title", "Add Cheese");
        return "cheese/add";
    }
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddCheeseForm(@RequestParam String cheeseName, @RequestParam String cheeseDescription){
        String cheeseObjectName = cheeseName;
        Cheese cheeseobjectName = new Cheese(cheeseName, cheeseDescription);
        cheeseObjects.put(cheeseName, cheeseobjectName);

        // Redirect to /cheese
        return "redirect:";

    }

    @RequestMapping(value = "remove", method = RequestMethod.GET)
    public String displayRemoveCheeseForm(Model model) {
        model.addAttribute("cheeses", cheeses);
        model.addAttribute("title", "Remove Cheese");
        return "cheese/remove";
    }
    @RequestMapping(value = "remove", method = RequestMethod.POST)
    public String processRemoveCheeseFrom(@RequestParam ArrayList<String> cheeseCheckbox){
        for(String item : cheeseCheckbox) {
            cheeseObjects.remove(item);
            cheeses.remove(item);
        }

        // Redirect to /cheese
        return "redirect:";

    }
}
