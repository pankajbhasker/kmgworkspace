package com.bhasker.dgstack.collectionpro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListIntitialize {

    public static void main(String args[]){

        // Basic way
        ArrayList<String> arrListA =new ArrayList<String>();
        arrListA.add("pankaj");
        arrListA.add("Neha");

        System.out.println("Basic Initialize: "+ arrListA);

        /* Annonymus  class way*/
        ArrayList<String> arrListB =new ArrayList<String>(){
            {
                add("Sanjay");
                add("Sangeeta");
            }
        };
        System.out.println("Anonymus Intialize: " + arrListB);

        //  Initialize using asList method

        List<String> list = Arrays.asList("Anjay", "Nirmala"); // asList(new String[])
        ArrayList<String> arrListC =new ArrayList<String>(list);

        System.out.println("AsList Initialize: " + arrListC);



    }
}
