package com.chenshinan.liquibase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author shinan.chen
 * @date 2018/8/25
 */
@Component
public class StartUpRunner implements CommandLineRunner {

    @Autowired
    LiquibaseExecutor liquibaseExecutor;

    @Override
    public void run(String... args) throws Exception {
        try {
            liquibaseExecutor.execute();
        }catch (Exception e){
            throw new Exception(e);
        }
    }
}
