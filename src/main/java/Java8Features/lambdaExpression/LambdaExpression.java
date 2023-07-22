package Java8Features.lambdaExpression;

interface Shape{
    public void draw();
}
interface Addable{
    public int operation(int a, int b);
}


public class LambdaExpression {
    /* Created By Vinay-Kumar-HT */
    public static void main(String[] args) {

        //Referencing to the object of class implementing Shape Interface
        Shape rectangle = () -> System.out.println("Rectangle is the shape.");
        rectangle.draw();

        Shape square = () -> System.out.println("Square is the shape.");
        square.draw();

        Shape circle = () -> System.out.println("Circle is the shape.");
        circle.draw();

        print(() -> System.out.println("Rectangle inside print"));
        print(() -> System.out.println("Square inside print"));
        print(() -> System.out.println("Circle inside print"));

        //Addable interface methods
        //Normal execution
        Addable add = (a,b) -> a+b;
        System.out.println(add.operation(10,20));

        Addable substraction = (a,b) -> a-b;
        System.out.println(20-10);
    }
    public static void print(Shape shape){
        shape.draw();
    }
}
