package com.company.company.Service.impl;

import com.company.company.Service.Hello;
import com.company.company.dto.Numbers;
import org.springframework.stereotype.Service;

@Service
public class HelloImpl implements Hello {
    @Override
    public String getHello() {
        return "Hi Useless";
    }

    @Override
    public int mul(Numbers numbers) {
       return numbers.getI()*numbers.getJ();
    }
    @Override
    public int add(Numbers numbers) {
        return numbers.getI()+numbers.getJ();
    }
}
