package com.bhasker.dgstack.coreprg;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;


public class UnmodifuableCollection1 {

        public static void main(String[] args) 
        {
                ArrayList al=new ArrayList();
              
                al.add("hussain");
                al.add("chan");
                al.add("ab");
                System.out.println(al);
                Collections.shuffle(al);
                System.out.println(al);
              
                /*al.add(101);
                al.add(102);
                al.add(103);
                al.add(104);*/
                
             /*   al.add("hussain");
                al.add("chan");
                al.add("ab");
                
                Collection c=Collections.unmodifiableCollection(al);
                ArrayList al1=(ArrayList)c;
                al1.add(105);
                Iterator itr=al1.iterator();
                while(itr.hasNext())
                {
                        System.out.println(itr.next());
                }
                        */
        }

}
