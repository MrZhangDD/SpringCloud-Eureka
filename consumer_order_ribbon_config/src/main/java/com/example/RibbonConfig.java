package com.example;

import com.example.springCloud.ExcludeCommonScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.client.RestTemplate;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "PROVIDER-USER",configuration = TestConfig.class)/*启用ribbon并且对PROVIDER-USER负载均衡*/
/*ribbon加载在其他包中需要手动扫描排除*/
@ComponentScan(excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,value = ExcludeCommonScan.class)})

public class RibbonConfig
{
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
    public static void main( String[] args )
    {
        SpringApplication.run(RibbonConfig.class);
        System.out.println( "ribbon!" );
    }
}
