package com.yys.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

  @RestController
@EnableAutoConfiguration
public class UserController {

    @RequestMapping(value="/user/{name}",method=RequestMethod.GET)
    @ResponseBody
    User getUserString(@PathVariable String name){
        return new User(name);
    }
    public static void main(String[] args) throws Exception {
        SpringApplication.run(UserController.class, args);
    }
}
