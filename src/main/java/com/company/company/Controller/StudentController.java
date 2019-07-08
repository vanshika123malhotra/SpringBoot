package com.company.company.Controller;

import com.company.company.Service.StudentDetails;
import com.company.company.dto.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StudentController {
    @Autowired
    StudentDetails studentDetails;
    @PostMapping (value = "/api/v1/name")
    public void getDetails(@RequestBody Student student ){
        studentDetails.details(student);
    }
}
