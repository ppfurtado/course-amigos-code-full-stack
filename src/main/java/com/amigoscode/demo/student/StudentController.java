package com.amigoscode.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;


@RestController
@RequestMapping("student")
public class StudentController {

    @GetMapping
    public List<Student> getAllStudents(){
        return List.of(
          new Student(UUID.randomUUID(), "Pedro", "Nazare", "pedro.nazare@pdcase.com.br", Student.Gender.MALE),
          new Student(UUID.randomUUID(), "Michael", "Baia", "michael.baia@pdcase.com.br", Student.Gender.MALE),
          new Student(UUID.randomUUID(), "Rodrigo", "vasconcelos", "rodrigo.vasconcelos@pdcase.com.br", Student.Gender.MALE)
        );
    }
}
