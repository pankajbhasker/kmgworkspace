package com.bhasker.dgstack.java8;

import com.bhasker.dgstack.interfaces.Java8Interface;

public class Java8Example  implements Java8Interface {

    public void getAllDetails(){
        System.out.println(Java8Interface.getCompanyName() + " Exp :" + Java8Interface.getStudentExpo() );
    }
}
