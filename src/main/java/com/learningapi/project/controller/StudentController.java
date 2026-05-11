package com.learningapi.project.controller;

import com.learningapi.project.dto.StudentDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StudentController {

    @GetMapping("/student")
    public StudentDto getStudent(){
        return new StudentDto( 4L, "Sanchi","sanchi123@gmail.com");
    }
}
