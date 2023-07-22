package couplingExample;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary //to give higher preference when multiple bean of same type
public class Cycle implements Vehicle{
    /* Created By Vinay-Kumar-HT */
    @Override
    public void move(){
        System.out.println("Cycle is moving !!!");
    }
}
