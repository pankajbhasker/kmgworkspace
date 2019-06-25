package com.bhasker.dgstack.programms;

/*
The object cloning is a way to create exact copy of an object. The clone() method of Object class is used to clone an object.

The java.lang.Cloneable interface must be implemented by the class whose object clone we want to create. If we don't implement Cloneable interface, clone() method generates CloneNotSupportedException.

The clone() method is defined in the Object class.
 */
public class CloneCheck implements Cloneable {

    private String name = "Pankaj";

    public static void main(String args[]) {
        CloneCheck obj = new CloneCheck();
        System.out.println("hashcode " + obj.hashCode() + " name " + obj.name);

        try {
            CloneCheck obj1 = (CloneCheck) obj.clone();
            System.out.println("clone hashcode " + obj1.hashCode() + " name " + obj1.name);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();

        }


    }
}
