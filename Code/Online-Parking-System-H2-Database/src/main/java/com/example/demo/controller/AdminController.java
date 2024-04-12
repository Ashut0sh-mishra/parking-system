package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {

    @RequestMapping("/Admin_Home")
    public ModelAndView Admin_Home() {
        ModelAndView mv = new ModelAndView("Admin_View");
        return mv;
    }

    // Add other admin-related request mappings here
    
}
