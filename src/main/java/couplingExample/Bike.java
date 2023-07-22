package couplingExample;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{
    /* Created By Vinay-Kumar-HT */

    @Override
    public void move(){
        System.out.println("Bike is moving !!!");
    }
}
