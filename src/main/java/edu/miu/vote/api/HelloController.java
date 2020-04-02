package edu.miu.vote.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Hello social distancers";
    }

    @RequestMapping("/accessdenied")
    public String access() {
        return "Acces denied";
    }
}
