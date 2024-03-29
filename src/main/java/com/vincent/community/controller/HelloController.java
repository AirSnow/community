package com.vincent.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author tongzeping
 * @date 2019-06-04 15:19
 */
@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam(name="name")String name,Model model){
        model.addAttribute("name", name);
        return "hello";
    }
}
