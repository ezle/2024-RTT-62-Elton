package com.example.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @GetMapping("/")    //Globe is the menu for the url
    public ModelAndView index() {
        //  This function is for the home page of the website which is express as just a plain slash "/"
        ModelAndView response = new ModelAndView("index");

        response.addObject("message" , "Hello World!");

        return response;
    }

    @GetMapping("/another-page")
    public ModelAndView anotherPage() {
        // This page is for another page of the website which is express as "/page-url"
        ModelAndView response = new ModelAndView("another-page");

        return response;
    }
}
