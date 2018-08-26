package com.chenshinan.liquibase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration;

@SpringBootApplication(exclude = LiquibaseAutoConfiguration.class)
public class CsnLiquibaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(CsnLiquibaseApplication.class, args);
    }
}
