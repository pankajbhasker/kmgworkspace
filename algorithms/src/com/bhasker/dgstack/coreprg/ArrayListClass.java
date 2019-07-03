package com.bhasker.dgstack.coreprg;
import java.util.ArrayList;
import java.util.Collections;


public class ArrayListClass 
{

        public static void main(String[] args) 
        {
                ArrayList al=new ArrayList();
                al.add("hussain");
                al.add("100");
                al.add("chandra");
                al.add("101");
            /*    System.out.println();*/	
                System.out.println(Collections.binarySearch(al,"hussain"));
                Collections.reverse(al);
                System.out.println(al);
                

        }

}
