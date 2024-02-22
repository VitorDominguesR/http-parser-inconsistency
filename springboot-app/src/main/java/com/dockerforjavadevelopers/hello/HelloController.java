package com.dockerforjavadevelopers.hello;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String notAdmin() {
        return "Hello World from SpringBoot\n";
    }
    @RequestMapping("/admin")
    public String index() {
        return "<h1>ADMIN Panel</h1>\n";
    }
    
}
