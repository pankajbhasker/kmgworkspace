package com.bhasker.dgstack.coreprg;
import java.util.ArrayList;
import java.util.List;  
public class LamdaExpression{  

    public static void main(String[] args) {  
          
        List<String> list=new ArrayList<String>();  
        
        list.add("ankit");  
        list.add("mayank");  
        list.add("irfan");  
        list.add("jai");  
          
        list.forEach((j)->System.out.println(j));  
           
    }  
}