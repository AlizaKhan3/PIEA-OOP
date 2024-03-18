// Encapsulation in Java is a process of wrapping code and data together into a single unit, for example, a capsule which is mixed of several medicines.

//A Java class which is a fully encapsulated class.  
//It has a private data member and getter and setter methods.  
// package com.javatpoint;  
class Student{  
//private data member  
private String name;  
//getter method for name  
public String getName(){  
return name;  
}  
//setter method for name  
public void setName(String name){  
this.name=name;
}  
}  

public class Main{  
public static void main(String[] args){  
//creating instance of the encapsulated class  
Student s=new Student();  
//setting value in the name member  
s.setName("vijay");  
//getting value of the name member  
System.out.println(s.getName());  
}  
}  
