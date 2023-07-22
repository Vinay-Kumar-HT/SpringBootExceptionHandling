package couplingExample;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
    /* Created By Vinay-Kumar-HT */
    @Override
    public void move(){
        System.out.println("Car is moving !!!");
    }
}
