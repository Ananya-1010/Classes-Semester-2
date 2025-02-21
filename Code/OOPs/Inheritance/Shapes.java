/*Q1: Write a Java program to demonstrate inheritance using the following classes:
● Shape: This is the base class with a method draw(), which will be overridden in
its subclasses.
● Circle: This class should inherit from Shape and implement the draw() method
to print "Drawing a Circle".
● Rectangle: This class should inherit from Shape and implement the draw()
method to print "Drawing a Rectangle". Demonstrate polymorphism by calling the
draw() method from instances of both Circle and Rectangle using a reference of
type Shape */

public class Shapes {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        circle.draw();
        rectangle.draw();
    }
}
class Shape {
    public void draw() {
        System.out.println("Drawing a Shape");
    }
    }
class Circle extends Shape {
    public void draw() {
        System.out.println("Drawing a Circle");
    }
    }
class Rectangle extends Shape {
    public void draw() {
        System.out.println("Drawing a Rectangle");
        }
    }
