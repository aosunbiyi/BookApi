package com.adlogic.BookApi.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
      return  args -> {
          Student fred=  new Student("Fred Mill",
                    "fred.mill@gmil.com", LocalDate.of(1998,
                    Month.JANUARY,6),21);

          Student king=  new Student("King James",
                    "king.james@gmil.com", LocalDate.of(1981,
                    Month.MAY,12),25);

          studentRepository.saveAll(
                  List.of(fred, king)
          );


        };


    }
}
