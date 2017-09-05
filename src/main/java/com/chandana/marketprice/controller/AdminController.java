package com.chandana.marketprice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @RequestMapping("/welcome.html")
    public ModelAndView welcomePage() {
        return new ModelAndView("admin");
    }

    @RequestMapping("/")
    public ModelAndView landingPage() {
        return new ModelAndView("admin");
    }
}
