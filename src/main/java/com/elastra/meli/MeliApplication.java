package com.elastra.meli;

import com.elastra.meli.Service.PlanetPositionService;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableBatchProcessing
public class MeliApplication {

    public static void main(String[] args) {
        SpringApplication.run(MeliApplication.class, args);
    }

}

