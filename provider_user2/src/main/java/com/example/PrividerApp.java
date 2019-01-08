package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class PrividerApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(PrividerApp.class);
        System.out.println( "Provider 2!" );
    }
}
