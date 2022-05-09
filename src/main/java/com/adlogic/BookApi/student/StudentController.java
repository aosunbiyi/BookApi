package com.adlogic.BookApi.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
    @GetMapping
    public List<Student> getStudents(){
        return List.of(
                new Student(1L,"Fred Mill","fred.mill@gmil.com", LocalDate.of(1998, Month.JANUARY,6),21),
                new Student(2L,"King James","king.james@gmil.com", LocalDate.of(1998, Month.JANUARY,6),21)
        );
    }
}
