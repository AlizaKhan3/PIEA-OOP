class SimpleCircle{ 
     double radius; 
  
     SimpleCircle(){            //Creating constructor 1 (No-Argument constructor) 
         radius = 1;            //Default value is set to 1 for radius; type already defined in class issliye yaha nhi likhi 
     } 
  
     SimpleCircle(double newradius){            //Creating constructor 2 (With Argument constructor) 
         radius = newradius; 
     } 
  
     public void SetNewRdius(double newradius){                 //Created function to set new radius for different sc's 
          radius = newradius; 
     } 
  
     //Making Functions OR Methods 
     public double getArea(){ 
         return (radius * radius * Math.PI); 
     } 
 }  //Class End (Includes props/attrributes, functions/Methods & Constructors) 
  
 public class TestSimpleCircle 
 { 
     public static void main(String[] args) {        
        SimpleCircle sc1 = new SimpleCircle();       //Object 1 (Default value of radius) 
        System.out.println("The area of the circle of radius " + sc1.radius + " is " + sc1.getArea()); 
  
        SimpleCircle sc2 = new SimpleCircle(25);     //Object 2 (Radius set to 25) 
        System.out.println("The area of theA circle of radius " + sc2.radius + " is " + sc2.getArea()); 
  
        SimpleCircle sc3 = new SimpleCircle(125);    //Object 3 (Radius set to 125) 
        System.out.println("The area of the circle of radius " + sc3.radius + " is " + sc3.getArea()); 
  
        SimpleCircle sc4 = new SimpleCircle(100);    //Object 4 (Radius set to 100) 
        System.out.println("The area of the circle of radius " + sc4.radius + " is " + sc4.getArea()); 
  
     } 
 }