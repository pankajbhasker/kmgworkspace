package com.bhasker.dgstack;


import java.util.Scanner;

public class LookAndSay {

    public static String lookandsay(String number){
        StringBuilder result= new StringBuilder();

        char repeat= number.charAt(0);
        number= number.substring(1) + " ";
        int times= 1;

        for(char actual: number.toCharArray()){
            if(actual != repeat){
                result.append(times + "" + repeat);
                times= 1;
                repeat= actual;
            }else{
                times+= 1;
            }
        }
        return result.toString();
    }

    public static void main(String[] args){

        System.out.println("Enter the Input Value > ");
        Scanner inputString  = new Scanner(System.in);
        String num= inputString.nextLine();
        System.out.println("Enter the Number of Interation Value > ");
        Scanner inputItr= new Scanner(System.in);
        int iteration = inputItr.nextInt();
        StringBuilder sb= new StringBuilder("");
        for (int i=1;i<=iteration;i++) {
            System.out.println(num);
            num = lookandsay(num);
            sb.append(num +  " ");
        }
        System.out.println(sb);
    }

}

/**
 Output
 11
 21
 1211
 111221
 312211

 */
