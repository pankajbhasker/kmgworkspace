package com.bhasker.dgstack.lamdaex;

import java.util.ArrayList;
import java.util.List;

public class ListSteam {

   static  List<String> places = new ArrayList<String>();

    public static void main(String args[]){

        List<String> mylst = getPlaces();
        mylst.stream().filter((p)-> p.startsWith("Nepal")).map((p) -> p.toUpperCase()).sorted().forEach((p)-> System.out.println(p));
    }
    public static List getPlaces(){
        places.add("Nepal, Kathmandu");
        places.add("Nepal, Pokhara");
        places.add("India, Delhi");
        places.add("USA, New York");
        places.add("Africa, Nigeria");
        return places;
    }
}
