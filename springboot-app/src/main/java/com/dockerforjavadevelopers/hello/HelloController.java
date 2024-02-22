package com.dockerforjavadevelopers.hello;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    @RequestMapping("/not-admin")
    public String notAdmin() {
        return "Hello World\n";
    }
    @RequestMapping("/admin")
    public String index() {
        return "<h1>ADMIN</h1>\n";
    }
    
}
