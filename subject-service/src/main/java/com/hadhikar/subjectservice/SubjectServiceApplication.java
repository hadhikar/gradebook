package com.hadhikar.subjectservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.*")
public class SubjectServiceApplication {
        public static void main(String[] args) {
            SpringApplication.run(SubjectServiceApplication.class, args);
        }
}
