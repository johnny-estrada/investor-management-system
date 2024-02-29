package com.wellsfargo.counselor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.wellsfargo.counselor.entity.Advisor;
import com.wellsfargo.counselor.repository.AdvisorRepository;

import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Entrypoint {

    private static final Logger log = LoggerFactory.getLogger(Entrypoint.class);

    public static void main(String[] args) {
        SpringApplication.run(Entrypoint.class, args);
    }

    @Bean
    public CommandLineRunner demo(AdvisorRepository repository) {
        return args -> {
            // save a few advisors
            repository.save(new Advisor("Jack", "Bauer", "123 fir st", "555-555-5555", "jack@email"));
            repository.save(new Advisor("Jack", "Bauer", "123 fir st", "555-555-5555", "jack@email"));
            repository.save(new Advisor("Jack", "Bauer", "123 fir st", "555-555-5555", "jack@email"));
            repository.save(new Advisor("Jack", "Bauer", "123 fir st", "555-555-5555", "jack@email"));

            // fetch all customers
            log.info("Advisor found with findAll():");
            log.info("-------------------------------");
            repository.findAll().forEach(advisor -> log.info(advisor.toString()));
            log.info("");
        };

    }
}