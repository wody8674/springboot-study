package com.wodyrang.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

/**
 * Spring boot Application Start!!
 */
@EnableAutoConfiguration
public class Application {

    /**
     * Spring boot Start Main Method.
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
