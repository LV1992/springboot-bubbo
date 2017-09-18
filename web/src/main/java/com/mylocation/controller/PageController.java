package com.mylocation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lenovo on 2017/8/30.
 */
@Controller
public class PageController {

    @RequestMapping("/")
    public String page(){
        return "index";
    }

    @RequestMapping("/{path}")
    public String route(@PathVariable String path){
        return path;
    }

}
