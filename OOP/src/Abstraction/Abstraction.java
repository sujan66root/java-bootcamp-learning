package Abstraction;


public class Abstraction {
    public static void main(String[] args) {
//        here shapeObject is the reference which holds the memory address of object of Rectangle
        Shape shapeObject = new Rectangle(4,5);
        int area = shapeObject.calculateArea();
        int perimeter = shapeObject.calculatePerimeter();
        System.out.println("The area of rectangle is:" + area);
        System.out.println("The area of perimeter is:" + perimeter);
    }
}
abstract class Shape{
//    abstract methods
    abstract int calculateArea();
    abstract int calculatePerimeter();
}
class Rectangle extends Shape{
    private int length;
    private int breadth;
    Rectangle(int l, int b){
        length = l;
        breadth = b;
    }

    @Override
    int calculateArea() {
        return length * breadth;
    }

    @Override
    int calculatePerimeter() {
        return 2 * (length+breadth);
    }
}
