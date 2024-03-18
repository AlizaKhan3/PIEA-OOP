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

//Multilevel Inheritance Example (contains more than one class)

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


