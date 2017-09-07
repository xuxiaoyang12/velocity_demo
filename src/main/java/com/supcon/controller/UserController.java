package com.supcon.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Mxia on 2017/7/13.
 */
@Controller
public class UserController {


    @RequestMapping("/")
    public String login(){
        return "redirect:user";
    }


    @RequestMapping("/user")
    public String input(ModelMap modelMap, Model model){
        model.addAttribute("address","长安");
        modelMap.put("name" ,"hello velocity");
        return "table2";


    }
}
