//Inheritance in Java --> Child inheriting properties from the parent class using "extends" keyword
// Inheritance --> In Inheritance the Child Classes (Sub Class) inherit the properties/attributes & behaviour from their (extends) Parent Class i.e(Base Class) while the child class holds their properties too. 
class Shape{
    double length;
    double width;
    double area;
    double perimeter;
    public void Area(double length, double width){
        // double area = length * width;
        // return Area;
         System.out.println("Area");
    }
}

class Triangle extends Shape{
    public void Perimeter(double length, double width){
        // double perimeter = 2 * (length + width);
        // return Perimeter;
        protected double length = 1;
        protected double width = 2;
        System.out.println("perimeter");
    }
}

public class Inheritance{

    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.Perimeter();
        
    }
}
