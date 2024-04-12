package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ParkingController {

    @RequestMapping("/Parking_Cost")
    public ModelAndView Parking_Cost_View() {
        ModelAndView mv = new ModelAndView("SetParkCost");
        // Add necessary logic to fetch and display parking cost
        return mv;
    }

    // Add other parking-related request mappings here
    
}
