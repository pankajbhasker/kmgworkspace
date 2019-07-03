package com.bhasker.dgstack.collectionpro;

import com.bhasker.dgstack.pojo.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class SerializePersonList {

    public static void main(String args[]) {


        // Serialize and Writing Person List
        serializePersonList();
        // Deserialize and Writing Person List
        deserializePersonList();

    }
    public static void serializePersonList(){
        ArrayList<Person> personArrayList = new ArrayList<Person>();
        Person person1 = new Person(1, "Pankaj", 20);
        Person person2 = new Person(2, "Neha", 20);
        Person person3 = new Person(3, "Ram", 21);
        Person person4 = new Person(4, "Bipul", 18);
        Person person5 = new Person(5, "Puja", 16);


        personArrayList.addAll(Arrays.asList(person1, person2, person3, person4, person5));
        try {
            FileOutputStream fos = new FileOutputStream("/Users/pkpankajk/IdeaProjects/algorithms/src/com/bhasker/dgstack/programms/test.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(personArrayList);
            System.out.println("Serialization done and object is writting in file Stream.");

        } catch (IOException | RuntimeException e) {
            e.printStackTrace();
        }
    }

    public static void deserializePersonList() {

        ArrayList<Person> arraylist = new ArrayList<Person>();

        try {

            FileInputStream fis = new FileInputStream("/Users/pkpankajk/IdeaProjects/algorithms/src/com/bhasker/dgstack/programms/test.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            arraylist = (ArrayList) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }
        for (Person person : arraylist) {
            System.out.println(person);
        }
    }
}

