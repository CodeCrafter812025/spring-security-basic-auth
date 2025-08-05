package com.example.springsecuritydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/public/hello")
    public String publicHello(){
        return "سلامت از مسیر عمومی";
    }

    @GetMapping("/user/hello")
    public String userHello(){
        return "سلام کاربر";
    }

    @GetMapping("/admin/hello")
    public String adminHello(){
        return "سلام ادمین";
    }

}
