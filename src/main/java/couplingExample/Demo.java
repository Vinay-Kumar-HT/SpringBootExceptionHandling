package couplingExample;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Demo {
    /* Created By Vinay-Kumar-HT */
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        Car car = applicationContext.getBean(Car.class);
        car.move();

        Bike bike = applicationContext.getBean(Bike.class);
        bike.move();

        Vehicle vehicle = new Cycle();

        Traveller traveller = new Traveller(vehicle);
        traveller.move();

        traveller = applicationContext.getBean(Traveller.class);
        traveller.move();
    }
}
