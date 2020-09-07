package cn.v5cn.drone.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/index")
    public Object index(){
        return "Hello Drone";
    }
}
