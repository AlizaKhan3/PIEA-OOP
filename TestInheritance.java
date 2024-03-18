//Inheritance in Java --> Child inheriting properties from the parent class using "extends" keyword
// Inheritance --> In Inheritance the Child Classes (Sub Class) inherit the properties/attributes & behaviour from their (extends) Parent Class i.e(Base Class) while the child class holds their properties too. 

//Single Inheritance Example
class Animal{  
void eat(){System.out.println("eating...");}  
}  
class Dog extends Animal{  
void bark(){System.out.println("barking...");}  
}  
class TestInheritance{  
public static void main(String args[]){  
Dog d=new Dog();  
d.bark();  
d.eat();  
}} 

