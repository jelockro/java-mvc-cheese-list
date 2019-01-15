package com.example.cheesemvc.controllers;

import com.example.cheesemvc.models.Cheese;
import com.example.cheesemvc.models.CheeseData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@Controller
@RequestMapping("cheese")
public class CheeseController {


    // request path: /cheese
    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("cheeses", CheeseData.getAll());
        model.addAttribute("title", "My Cheeses");
        return "cheese/index";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddCheeseForm(Model model) {
        model.addAttribute(new Cheese());
        model.addAttribute("title", "Add Cheese");
        return "cheese/add";
    }
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddCheeseForm(@ModelAttribute @Valid Cheese newCheese, Errors errors, Model model){
        if (errors.hasErrors()) {
            System.out.println(errors.getErrorCount());
            model.addAttribute("title", "Add Cheese");
            return "cheese/add";
        } else {
            CheeseData.add(newCheese);
            // Redirect to /cheese
            return "redirect:";
        }


    }

    @RequestMapping(value = "remove", method = RequestMethod.GET)
    public String displayRemoveCheeseForm(Model model) {
        model.addAttribute("cheeses", CheeseData.getAll());
        model.addAttribute("title", "Remove Cheese");
        return "cheese/remove";
    }
    @RequestMapping(value = "remove", method = RequestMethod.POST)
    public String processRemoveCheeseFrom(@RequestParam int[] cheeseIDs){
        for(int cheeseId : cheeseIDs) {
            CheeseData.remove(cheeseId);
        }

        // Redirect to /cheese
        return "redirect:";

    }
    @RequestMapping(value = "edit/{id}", method = RequestMethod.GET)
    public String displayEditForm(Model model, @PathVariable("id") int cheeseId) {
        model.addAttribute("cheese", CheeseData.getByID(cheeseId));
        return "cheese/edit";

    }

    @RequestMapping(value = "edit", method = RequestMethod.POST)
    public String processEditForm(int cheeseId, String name, String description) {
        return "redirect:";
    }

}
