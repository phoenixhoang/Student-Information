package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student miriam = new Student(
                    "Miriam",
                    "miriam.jamal@gmail.com",
                    LocalDate.of(2000, JANUARY, 5)
            );

            Student dawn = new Student(
                    "Dawn",
                    "dawn.berlitz@out.com",
                    LocalDate.of(2000, Month.SEPTEMBER, 13)
            );

            repository.saveAll(
                    List.of(miriam, dawn)
            );
        };
    }
}
