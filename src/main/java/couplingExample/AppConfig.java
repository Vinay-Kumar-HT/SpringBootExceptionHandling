package couplingExample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "couplingExample")
public class AppConfig {
    /* Created By Vinay-Kumar-HT */

//    @Bean
//    public Car car(){
//        return new Car();
//    }
//
//    @Bean
//    public Bike bike(){
//        return new Bike();
//    }
//
//    @Bean
//    public Cycle cycle(){
//        return new Cycle();
//    }
//
//    @Bean
//    public Traveller traveller(){
//        return new Traveller(bike());
//    }

}
