package com.chandana.marketprice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
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
