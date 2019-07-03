package com.bhasker.dgstack.patterns;

public class InvSequenceTrianglePattern {

    public static void main(String args[]) {
        // \u000d System.out.println("kjkj  ajks");

        String s = 1 + "one" + 1 + 2 + "two" + 3 + "three" + 3 + 4 + "four" + 5;
        System.out.println(s); // 1one12two3three34four5

        int i = 10 + +11 - -12+ + 13 - - 14 + +15;
        System.out.println(i); // 75 ans

        String one= "Random";
        String two= "Random";
        if(one==two){
            System.out.println("====");
        }
        else{
            System.out.println("==not==");
        }

    }
}
