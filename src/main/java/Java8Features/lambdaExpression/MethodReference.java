package Java8Features.lambdaExpression;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.DoubleBinaryOperator;
import java.util.function.Function;

interface Printable{
    public void print(String msg);
}

public class MethodReference {
    /* Created By Vinay-Kumar-HT */

    public void display(String msg){
        msg = msg.toUpperCase();
        System.out.println(msg);
    }

    public static String print(String msg) {
        return msg;
    }

    public static int addition(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        //Method reference to static method
        //Normal
        Function<Integer, Double> function = (input) -> Math.sqrt(input);
        System.out.println(function.apply(10));

        Function<Integer,Double> functionMethod = Math::sqrt;
        System.out.println(functionMethod.apply(20));

        Function<String,String> classMethod = MethodReference::print;
        System.out.println(classMethod.apply("Class Method Reference"));

        BiFunction<Integer,Integer,Integer> biFunction = (a,b) -> MethodReference.addition(a,b);
        System.out.println(biFunction.apply(10,20));

        BiFunction<Integer,Integer,Integer> biFunctionReference = MethodReference::addition;
        System.out.println(biFunctionReference.apply(20,30));

        //Method reference to instance method of object
        MethodReference methodReference = new MethodReference();

        Printable printableNormal = (msg) -> methodReference.display(msg);
        printableNormal.print("Vinay");

        Printable printable = methodReference::display;
        printable.print("Method Reference By Instance Method");

        //Method reference to arbitrary method object
        Function<String,String> stringFunction = (String input) -> input.toUpperCase();
        System.out.println(stringFunction.apply("UPPERCASE"));

        Function<String,String> stringFunction1Ref = String::toLowerCase;
        System.out.println(stringFunction1Ref.apply("TOLOWERCASE"));

        var list = Arrays.asList("c","b","f","a");

        list.stream().sorted((s1,s2) -> s1.compareTo(s2))
                .forEach(System.out::print);

        list.stream().sorted(String::compareTo)
                .forEach(System.out::print);

        //Method reference to constructor of object
        var fruits = Arrays.asList("Apple","Orange","PineApple","Grapes");

        Function<List<String>, Set<String>> setFunction = (fruit) -> new HashSet<>(fruit);
        System.out.println(setFunction.apply(fruits));

        Function<List<String>,Set<String>> setFunction1New = HashSet::new;
        System.out.println(setFunction1New.apply(fruits));
    }
}
