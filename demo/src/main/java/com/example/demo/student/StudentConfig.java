package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student Harun = new Student("Harun", "harun.hahsa.saodm", LocalDate.of(1999, Month.JANUARY,11));
            Student Bilal = new Student("Omer", "ssssss.hahsa.saodm", LocalDate.of(1999,Month.JANUARY,11));
            Student Omer = new Student("Omer", "vvvvv.hahsa.saodm", LocalDate.of(1999,Month.JANUARY,11));
            studentRepository.saveAll(List.of(Harun, Bilal, Omer));
        };
    }
}
