package com.bhasker.dgstack.collectionpro;

import com.bhasker.dgstack.pojo.Person;

import java.util.*;

public class ArrayListTest {

    public static void main(String args[]) {

        ArrayList<String> arrList = new ArrayList<String>();

        // Add element return boolean

        arrList.add("Pankaj");
        arrList.add("Ajay");
        arrList.add("Shyam");
        arrList.add("Ram");
        arrList.add("Neha");
        arrList.add("Sagar");
        arrList.add("kaamu");
        arrList.add(3, "Chandan");

        System.out.println(arrList);

        // Add element on index return void
        arrList.add(2, "Sheetal");

        System.out.println("Updated List " + arrList);

        // Remove element from arrList
        arrList.remove("Kaamu");

        // Remove element from arrList Index wise
        arrList.remove(4);

        System.out.println("List after remove " + arrList);

        // Iterating ArrayList
        System.out.println("Iterating ArrayList using while");
        Iterator<String> it = arrList.iterator();
        while ( it.hasNext() ) {
            System.out.println(it.next());
        }

        // Iteration using foreach
        System.out.println("Iterating ArrayList using for Each");
        for (String str : arrList) {
            System.out.println(str);
        }

        // Search in List using indexOf and contains
        System.out.println("Search Element using contains indexOf.");

        int found = arrList.indexOf("Sheetal");
        if (found == -1) {
            System.out.println("Element  not found");
        } else {
            System.out.println("Element found at : " + found);
        }

        System.out.println("Search Element using contains method.");
        boolean isFound = arrList.contains("Sheetal");
        if (isFound) {
            System.out.println("Element found at : " + arrList.indexOf("Sheetal"));
        } else {
            System.out.println("Element  not found");
        }

        // Get List Size

        System.out.println("ArrayList Size : " + arrList != null || !arrList.isEmpty() ? arrList.size() : 0);

        // Clear arrList

        System.out.println(" Clearing / Empty ArrayList ");
        arrList.clear();
        System.out.println("ArrayList after clearing : " + arrList);

        // using Collections nCopies method

        ArrayList<String> arrCopiesList = new ArrayList<String>(Collections.nCopies(5, "Love"));
        System.out.println("Collections nCopies method : " + arrCopiesList);

        // ArrayList sorting

        System.out.println("Sorting String");

        sortCountryArrayList();


        System.out.println("Sorting Integer");
        sortMarksArrayList();

        System.out.println("Sorting Person List");
        sortedPersonList();

    }


    public static void sortCountryArrayList() {
        List<String> unSortList = Arrays.asList("India", "Pakistan", "China", "Sri Lanka", "Nepal", "Afganistan", "Myanmar");

        System.out.println("UnSorted List : " + unSortList);

        Collections.sort(unSortList);

        System.out.println("Sorted List : " + unSortList);

        Collections.sort(unSortList, Collections.reverseOrder());
        System.out.println("Descending Order : " + unSortList);

    }


    public static void sortMarksArrayList() {
        List<Integer> unSortList = Arrays.asList(56, 76, 98, 90, 75);

        System.out.println("UnSorted List : " + unSortList);

        Collections.sort(unSortList);

        System.out.println("Sorted List : " + unSortList);

        Collections.sort(unSortList, Collections.reverseOrder());
        System.out.println("Descending Order : " + unSortList);
    }

    public static void sortedPersonList() {


        ArrayList<Person> personArrayList = new ArrayList<Person>();


        Person person1 = new Person(1,"Pankaj", 20);
        Person person2 = new Person(2,"Neha", 20);
        Person person3 = new Person(3,"Ram", 21);
        Person person4 = new Person(4,"Bipul", 18);
        Person person5 = new Person(5,"Puja", 16);

        personArrayList.addAll(Arrays.asList(person1, person2, person3, person4, person5));

        System.out.println("Unsorted Person List : " + personArrayList);

        System.out.println("Using  AGE Comparator ");

        Collections.sort(personArrayList, Person.AGE_COMPARATOR);

        System.out.println(" Person List  sort by Age : ");
        for (Person person : personArrayList) {
            System.out.println(person.getAge());

        }

        System.out.println("Using  Name Comparator ");

        Collections.sort(personArrayList, Person.NAME_COMPARATOR);
        System.out.println(" Person List  sort by Name : ");
        for (Person person : personArrayList) {
            System.out.println(person.getName());

        }

        System.out.println("Using  Name Comparator Reverse order ");

        Collections.sort(personArrayList, Person.NAME_REV_COMPARATOR);
        System.out.println(" Person List  Reverse order sort by Name : ");
        for (Person person : personArrayList) {
            System.out.println(person.getName());

        }

        System.out.println("Using  Name Comparable ");

        Collections.sort(personArrayList, Person::compareTo);

        System.out.println(" Person List  sort by Name : ");
        for (Person person : personArrayList) {
            System.out.println(person.getName());

        }

        // Synchronize ArrayList

        Collections.synchronizedList(personArrayList);

        synchronized (personArrayList) {
            Iterator<Person> it = personArrayList.iterator();
            while ( it.hasNext() ) {
                System.out.println(it.next());

            }
        }

        // Swap two element in ArrayList

        Collections.swap(personArrayList, 1, 2);

        System.out.println("ArrayList after swap");

        for (Person person : personArrayList) {
            System.out.println(person.getName());

        }
    }

}
