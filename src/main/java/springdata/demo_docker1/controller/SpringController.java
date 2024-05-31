package springdata.demo_docker1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {

    @GetMapping("/hello")
    public String getController(){
        return "Hello spring";
    }
}
