package com.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaHigh
{
    public static void main( String[] args )
    {
        new SpringApplicationBuilder(EurekaHigh.class).web(true).run(args);
        //SpringApplication.run(App.class);
    }

}
