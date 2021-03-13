package com.apply.back.Testing;


import com.example.demo2.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


@Autowired
Service2 service2;



    @PostMapping("/server")
    public void print(@RequestBody Person p){
        service2.test(p);


    }




}
