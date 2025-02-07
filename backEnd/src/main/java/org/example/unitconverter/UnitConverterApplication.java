package org.example.unitconverter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"webApi.controllers", "business.conceretes"})
public class UnitConverterApplication {

    public static void main(String[] args) {
        SpringApplication.run(UnitConverterApplication.class, args);
    }

}
