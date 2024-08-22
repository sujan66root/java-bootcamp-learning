/* 1. Create a class Employee with the following properties and methods:
Salary (property) (int); getSalary (method returning int);
name (property) (String); getName (method returning String); setName (method changing name) */
//2. Create a class cellphone with methods to print “ringing…”, “vibrating…”, etc.
//3. Create a class Square with a method to initialize its side, calculating area, perimeter etc.
//4. Create a class Rectangle & problem 3.


class Employee{
    int Salary;
    String name;
    public int getSalary(){
        return Salary;
    }
    public void setSalary(int s){
        Salary = s;
    }
    public String getName(){
        return name;
    }
    public void setName (String n){
        name = n;
    }
}
class Cellphone {
    public void ring(){
        System.out.println("ringing....");
    }
    public void vibrate(){
        System.out.println("vibrating....");
    }

}
class Square{
    float length;
    public float getArea (){
        return length * length;
    }
    public float getPerimeter(){
        return 4 * length;
    }
}
class Rectangle{
    float length;
    float breadth;
    public float getArea(){
        return length * breadth;
    }
}
public class ClassesObjectsPractice {
    public static void main(String[] args) {
//        problem 1
        Employee sujan = new Employee();
        sujan.setSalary(24400);
        sujan.setName("Sujan is Learning Java");
        System.out.println(sujan.getName());
        System.out.println(sujan.getSalary());
//        problem 2
        Cellphone cell = new Cellphone();
        cell.ring();
        cell.vibrate();
//        problem 3
        Square sq = new Square();
        sq.length = 4.4F;
        System.out.println("The area of Square is: "+ sq.getArea());
        System.out.println("The area of Perimeter is: "+sq.getPerimeter());
//        problem 4:
        Rectangle rect = new Rectangle();
        rect.length = 4;
        rect.breadth = 5;
        System.out.println("The area of Rectangle: "+ rect.getArea());
    }
}
