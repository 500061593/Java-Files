package lab2;

abstract class Shape{  
abstract void draw();  
}  

class Rectangle extends Shape{  
void draw(){System.out.println("drawing rectangle");}  
}  
class Circle extends Shape{  
void draw(){System.out.println("drawing circle");}  
} 

class Triangle extends Shape{  
void draw(){System.out.println("drawing triangle");}  
}  
 
class output{  
public static void main(String args[]){  
Shape s=new Circle(); 
s.draw();  
}  
}  