package com.yang.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yydsj
 * @date 2022/3/3 -21:41
 */
@RestController
public class helloController {
    @RequestMapping("/hello")
    public String hello(){
        int i=1;
        int a=i++;
        System.out.println(a);
        a=++i;
        System.out.println(a);
        return "你大爷的 SpringBoot";
    }
}
