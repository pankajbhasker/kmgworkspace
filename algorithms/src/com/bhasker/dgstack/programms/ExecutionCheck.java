package com.bhasker.dgstack.programms;

/*
If we want to execute any statements before even creation of objects at load time of class, we can use a static block of code in the class. Any statements inside this static block of code will get executed once at the time of loading the class even before creation of objects in the main method.
 */
public class ExecutionCheck  implements  Cloneable{

    private String name = "Pankaj";

    {
        System.out.println("Second initialize Block execute.");
    }
    public ExecutionCheck() {
        System.out.println("Default Constructor called.");
    }
    public ExecutionCheck(String msg) {
        System.out.println("Perimeterized constructor called.");
    }
    static {
        System.out.println(" First static block executed");
    }
    public void display(){
        System.out.println("display Method called");
    }
    public static void show() {
        System.out.println("static Show method called ");
    }
    public static void main(String args[]){
        ExecutionCheck obj=new ExecutionCheck(); // Constructor call depend on how /what (default or parameterized) we are initialize the object here default will call first.
        obj.show(); // method called depends on calling sequence
        obj.display();
        System.out.println("hashcode " + obj.hashCode() + " name " + obj.name);

        try{
            ExecutionCheck obj1 = (ExecutionCheck) obj.clone();
            obj1.show();
            System.out.println("clone hashcode " + obj1.hashCode()+ " name " + obj1.name);      }
        catch (CloneNotSupportedException e ){
            e.printStackTrace();

        }


    }
}
