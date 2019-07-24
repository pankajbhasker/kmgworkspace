package com.bhasker.dgstack.java8;

import com.bhasker.dgstack.interfaces.Java8Interface;

public class Java8Intantiation implements Java8Interface {

    @Override
    public void getAllDetails(){
        System.out.println("Hi my company name is : " + Java8Interface.getCompanyName() + " Exp " + Java8Interface.getStudentExpo() );
    }

    public static void main(String args[]){
        Java8Intantiation obj = new Java8Intantiation();
                obj.getAllDetails();
            System.out.println(obj.getSchoolName() + " College Name" + obj.getCollegeName() );
    }

}
