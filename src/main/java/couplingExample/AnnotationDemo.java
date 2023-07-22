package couplingExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationDemo {
    /* Created By Vinay-Kumar-HT */
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        Car car = applicationContext.getBean(Car.class);
        car.move();

        Traveller traveller = applicationContext.getBean(Traveller.class);
        traveller.move();

    }
}
