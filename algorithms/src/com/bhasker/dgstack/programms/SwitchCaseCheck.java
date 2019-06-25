package com.bhasker.dgstack.programms;

public class SwitchCaseCheck {

    public static void main(String[] args) {

        String switchStr = "pankaj1";
        int switchNum = 4;
        switchIntCheck(switchNum);

        System.out.println("==================================================");

        switchStringCheck(switchStr);

    }

    public static void switchStringCheck(String str) {
        switch (str) {
            case "pankaj": {
                System.out.println("match found");
                break;
            }
            case "shyam": {
                System.out.println("match not found");
                break;
            }
            default: {
                System.out.println("default String case exec");
            }
        }
    }

    public static  void switchIntCheck(int num) {
        switch (num){
            case 1:
                System.out.println("match not found");
                break;
            case 4:
                System.out.println("match found");
                break;
            default:
                System.out.println("default Integer case exec");
        }
    }
}