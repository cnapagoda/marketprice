package com.chandana.spring.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

    @RequestMapping("/welcome.html")
    public ModelAndView welcomePage() {
        return new ModelAndView("welcome");
    }

    @RequestMapping("/")
    public ModelAndView landingPage() {
        return new ModelAndView("welcome");
    }



}
