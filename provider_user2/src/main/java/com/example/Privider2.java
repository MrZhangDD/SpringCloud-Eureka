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
public class Privider2
{
    public static void main( String[] args )
    {
        SpringApplication.run(Privider2.class);
        System.out.println( "Provider 2!" );
    }
}
