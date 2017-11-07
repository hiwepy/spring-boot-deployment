package com.github.vindell.deployment.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String sayWorld() {
        return "Hello App .";
    }
    
}
