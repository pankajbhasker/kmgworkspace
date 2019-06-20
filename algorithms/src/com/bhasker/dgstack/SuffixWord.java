package com.bhasker.dgstack;

import java.util.ArrayList;
import java.util.List;

public class SuffixWord {

private static  String str="Pankaj";


    public static void main(String[] args) {

        if(str!=null && str.length()>0){
            List<String> list =new ArrayList<String>();
            // write your code here
            for ( int i =0 ;i< str.length(); i ++) {

                String s = str.substring(i, str.length());

                list.add(s);

            }
            System.out.println("Given a string " + str);

            System.out.println(list);
        }
        else
            System.out.println("Given a string  Null or Empty");

    }
}
