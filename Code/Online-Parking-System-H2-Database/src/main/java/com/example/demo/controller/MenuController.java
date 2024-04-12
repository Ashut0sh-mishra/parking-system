package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController

public class MenuController {
    
    @RequestMapping("/")
    public ModelAndView Menu() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("Menu");
        return mv;
    }
}
