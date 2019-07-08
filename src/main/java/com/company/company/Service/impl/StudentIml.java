package com.company.company.Service.impl;

import com.company.company.Service.StudentDetails;
import com.company.company.dto.Student;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
@Service
public class StudentIml implements StudentDetails {



    @Override
    public void details(Student student) {
        System.out.println(student.getName());
    }
}
