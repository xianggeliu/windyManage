package com.windymanage.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dada")
public class HelloController {

    @Value("${cupSize}")
    private String size;

//    @RequestMapping(value = {"/hello" },method = RequestMethod.GET)
    @GetMapping(value = "hello")
    public String say(@RequestParam( value = "pp" , required = false , defaultValue = "我是牛") String pp){
        return "pp :" + pp;
    }

    @GetMapping(value = "hehe")
    public String testDemo(){
        return null;
    }
}
