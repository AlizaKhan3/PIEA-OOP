//Inheritance in Java --> Child inheriting properties from the parent class using "extends" keyword
// Inheritance --> In Inheritance the Child Classes (Sub Class) inherit the properties/attributes & behaviour from their (extends) Parent Class i.e(Base Class) while the child class holds their properties too. 

//Single Inheritance Example
class Animal{  
    void eat(){
       System.out.println("eating...");
    }  
}  
class Dog extends Animal{  
    void bark(){System.out.println("barking...");
    }  
}  

class TestInheritance{  
    public static void main(String args[]){  
    Dog d=new Dog();  
    d.bark();  
    d.eat();  
    }
} 

// --------------------------------------------------------------

//Multilevel Inheritance Example (contains more classes --> Chain of Inheritance)

class Teacher{                        //Base Class/Super Class
    public void speaking (){
        System.out.println("Teacher announced the marks of quiz!");
    }
}
//Single level class
class Students extends Teacher{       //Child class 1
    public void listening (){
        System.out.println("Not satisfied with marks");
    }
}
//multilevel class
class Parents extends Students{       //Child class 2
    public void reacting(){
        System.out.println("You need to work hard!");
    }
}

public class TestInheritance{
    public static void main (String args[]){
        Parents p = new Parents();
        p.speaking();
        p.listening();
        p.reacting();
    }
}

// --------------------------------------------------------------

//Hierarchical Inheritance Example (two or more classes inherits from the only Super class)
//Only Base/Super Class
class Stationary {
    public void AllThings() {
        System.out.println("Stationary rakhlo");
    }
}

class InkPen extends Stationary{
     public void Pen() {
        System.out.println("Pen: Use to write.");
    }
}

class Remover extends Stationary {
    public void Removes() {
        System.out.println("Remover: Use to re-write.");
    }
}

class Pencil extends Stationary {
    public void RoughWork() {
        System.out.println("Pencil: Use to do rough work");
    }
}

public class TestInheritance{
    public static void main (String args[]){
        Pencil p = new Pencil();
        p.AllThings();
        // p.Pen();        Gives an Error 
        // p.Removes();    Gives an Error 
        p.RoughWork();
    }
}
