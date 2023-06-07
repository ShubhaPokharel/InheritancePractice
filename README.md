# InheritancePractice
 Inheritance is OOPS concept. OOPS = Object Oriented Principle.   
 
 
 Inheritance is the relationship between the child and parent class in java. To create the relationship we use extend keyword in the child class. 
The child class can access the parent's properties, but the parent cannot access the child's properties. 

Inheritance allows a class to share some properties or attributes from another class. It helps us not reuse the code multiple times. In other words, it helps us work without reinventing the wheel.

The class that is giving the properties is the Parent Class. Parent class is also called Super or Base class.

The class that is receiving the properties from the Parent class is Child Class. The Child is also called as Sub or Derived class.

It is possible to create the obect of both parent and child class. If we create the object of Parent class we can access the Parent's properties.

If we create the object of Child class, we can access its own properties and Parent's properties too because the child class extends the Parent class.

It is recommended to create the object of Child class. 



Benefits of Inheritance:

1 - We can reuse the code from super class to sub class. 

2- By reusing the code it makes it easier to write and maintain the code.

3- Objects of parent class can be treated as the object of child class.

4- We can add new features to the child class without modifying the existing properties / functionalities from parent class.


Types of Inheritance

***********************************************************************************************************************************************

   
   
   1) Single Inheritance: 
    
     It has one parent class and one child class. The child class extends the parent class.
     
     Ex:
     
     class A{}
     
     class B extends A{}
     
     
     2) Muti Level Inheritance:
       It has 3 genertions / levels. We have the parent class, child class and grand child class. 
     

    
   Ex: 
   
   class A{}
   
   class B extends A{}
   
   class C extends B{}
   
   Note: The grand child can access the Parent Class properties but we have to call the method of Parent class. 
   
   
   3) Heirarachical Inheritance:

     One parent class that has more than one child class.
     
     Ex:
     
     class A{}
     
     class B extends A{}
     
     class C extends A{}
     
     
     4) Multiple Inheritance:
     
     A child class that extends two parent class. 
     
     Java does not support Multiple Inheritance because one child class cannot extend two parent classes.
     
     One child class can only extend one parent class. 
     
     Ex: 
     
     class A{
     
     money();
     
     }
     
     class B{
     
     money();
     
     }
     
     class C extends A,B{}
     
     
     5) Hybrid Inheritance:
     
     Hybrid =   Heirarachical + Multiple
     
     Java does not support Hybrid Inheritance because it is a combination of Heirarachical and multiple Inheritance, where Java does not support Multiple Inheritance.
     
     In general Java has 5 types of Inheritance, but java only supports 3 of them. 
     
     
     
    ***********************************************How to prevent Inheritance in java?********************************************************
    
    If you use the final keyword in a Parent class, you stop the Inheritance. 
    
    It means a child class cannot extend the final class as a Parent class.
    
    
    Ex:
    
    final class A{}         
    
    class B extends A{}           // Invalid
    
    
    If you declare a varible as a final varible, no modifications are allowed. You cannot change the value of that final varible. 
    
    
    
    
    
    
