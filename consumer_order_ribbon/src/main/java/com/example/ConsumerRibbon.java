package com.example;

import com.TestConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "PROVIDER-USER",configuration = TestConfig.class)/*启用ribbon并且对PROVIDER-USER负载均衡*/
public class ConsumerRibbon
{
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
    public static void main( String[] args )
    {
        SpringApplication.run(ConsumerRibbon.class);
        System.out.println( "ribbon!" );
    }
}
