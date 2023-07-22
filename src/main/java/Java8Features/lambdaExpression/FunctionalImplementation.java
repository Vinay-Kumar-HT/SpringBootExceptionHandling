package Java8Features.lambdaExpression;

import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalImplementation {
    /* Created By Vinay-Kumar-HT */
    public static void main(String[] args) {

        //Runnable
        Runnable runnable = () -> System.out.println("Runnable is called");

        Thread thread = new Thread(runnable);
        thread.start();

        //Predicate
        Predicate<String> predicate1 = (input) -> input.startsWith("S");
        Predicate<String> predicate2 = (input) -> input.endsWith("h");

        System.out.println(predicate1.test("Somesh"));
        System.out.println(predicate1.and(predicate2).test("Somrah"));
        System.out.println(predicate1.or(predicate2).test("Somrah"));

        //Functional
        Function<String,Integer> function1 = (input) -> input.length();
        Function<Integer,Integer> function2 = (input) -> input+10;
        System.out.println(function1.apply("ShriRam"));
        System.out.println(function1.andThen(function2).apply("JaiRam"));

        //Consumer
        Consumer<String> consumer1 = (input) -> System.out.println(input);
        Consumer<String> consumer2 = (input) -> System.out.println(input+" Suresh");
        consumer1.accept("Ramesh ");
        consumer2.andThen(consumer2).accept("Ramesh");

        //Supplier
        Supplier<LocalDate> supplier = () -> LocalDate.now();
        System.out.println(supplier.get());


    }
}
