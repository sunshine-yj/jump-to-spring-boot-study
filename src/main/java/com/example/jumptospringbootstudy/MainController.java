package com.example.jumptospringbootstudy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/jump")
    @ResponseBody
    public String index() {
//        System.out.println("index");
        return "index";
    }

    @GetMapping("/")
    public String root() {
        return "redirect:/question/list";
    }
}
