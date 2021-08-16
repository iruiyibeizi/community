package com.nowcoder.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/alpha")
public class AlphaController {
    @RequestMapping("/hell0")
    @ResponseBody
    public String sayHello(){
        return "Hello springboot";
    }

}
