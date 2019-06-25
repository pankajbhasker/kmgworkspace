package com.bhasker.dgstack.programms;

public class ClassForNameCheck {

    private void show() {
        System.out.println("Method called show");

    }

    public static void main(String arg[]) {

        try {
            ClassForNameCheck obj = (ClassForNameCheck) Class.forName("com.bhasker.dgstack.programms.ClassForNameCheck").newInstance();
            obj.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }


    }
}
