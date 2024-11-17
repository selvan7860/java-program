abstract class Shape {
    abstract void draw();
    abstract double area();
} 

class Circle extends Shape {
    private double radius;

    Circle(double radius){
        this.radius = radius;
    }
    void draw() {
        System.out.println("Drawing Circle");
    }
     double area() {
        return Math.PI * radius * radius;
     }
}

public class AbstractExample {
    public static void main(String[] args){
        Circle circle = new Circle(5);
        circle.draw();
        System.out.println("Area :" + circle.area());
    }
}