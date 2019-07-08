package com.company.company.Controller;

import com.company.company.Service.Hello;
import com.company.company.Service.impl.HelloImpl;
import com.company.company.dto.Numbers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloImpl hello;

    @GetMapping(value = "/api/v1")
    public String getHello(){
      return  hello.getHello();
    }

    @PostMapping(value = "/mul")
    public int getmul(@RequestBody Numbers numbers){
        return hello.mul(numbers);
    }

    @PostMapping(value = "/api/mul")
    public int getadd(@RequestBody Numbers numbers){
        return hello.add(numbers);
    }
}
