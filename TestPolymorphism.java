// Polymorphism in Java poly-->many & morphism-->different forms
// Polymorphism basically means that; in a same class having many different functions having diferent purposes but of same name is called Polymorphism or this kind of implementation 
// refers to "Over Loading".
//Types: 1) Compile type Polymorphism     2) Run time Polymorphism

// eg: code of Polymorphism
class Student {
    String name;
    int age;
    double SeatNumber;
    
    Student (){
        //no-arg constructor if not created then runs as default constructor
    }
    
    //Creating 3 functions of same name below (Implementing polymorphism)
    public void PrintInfo(String name){       
        System.out.println(name);
    }
    
    public void PrintInfo(double SeatNumber){
        System.out.println(SeatNumber);
    }
    
     public void PrintInfo(int age){
        System.out.println(age);
    }
    public void PrintInfo(String name, int age, double SeatNumber){
        System.out.println(name + age + SeatNumber);
    }
}

public class TestPolymorphism{
    public static void main (String args[]){
        Student s1 = new Student();                      //Created an object
        s1.name = "Aliza Khan";
        s1.age = 18;
        s1.SeatNumber = 6017;
        
        s1.PrintInfo("Students Data: Name --> " + s1.name + " ; Age --> " + s1.age + " ; Seat# --> " + s1.SeatNumber);
    }
}
