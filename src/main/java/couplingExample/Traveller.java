package couplingExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Traveller {
    /* Created By Vinay-Kumar-HT */
    //Tightly coupled so introduce Interface here
    //Car car;

    Vehicle vehicle;

//   Example for qualifier annotation
//    @Autowired
//    public Traveller(@Qualifier("bike") Vehicle vehicle){
//        this.vehicle = vehicle;
//    }

    public Traveller(Vehicle vehicle){
            this.vehicle = vehicle;
    }

    public void move(){
        vehicle.move();
    }
}
