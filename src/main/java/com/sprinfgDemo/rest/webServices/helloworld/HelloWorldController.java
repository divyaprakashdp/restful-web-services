package com.sprinfgDemo.rest.webServices.helloworld;

import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HelloWorldController {

    @GetMapping(path = "/hello-world")
    public String helloWorld(){
//        return "Hello World";
        throw new RuntimeException("Something went wrong");
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World!!!");
    }

    @GetMapping(path = "/hello-world/path-variable/{user}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String user){
        return new HelloWorldBean(String.format("Hello World-->, %s", user));
    }
}
