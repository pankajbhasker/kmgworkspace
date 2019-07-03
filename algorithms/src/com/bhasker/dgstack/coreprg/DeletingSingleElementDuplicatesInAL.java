package com.bhasker.dgstack.coreprg;
import java.util.ArrayList;
import java.util.Collections;

public class DeletingSingleElementDuplicatesInAL {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();

		al.add(101);
		al.add(102);
		al.add(101);
		al.add(103);
		al.add(101);
		al.add(104);

		/*
		 * ArrayList al1=new ArrayList();
		 * 
		 * Iterator itr=al.iterator();
		 * 
		 * while(itr.hasNext()) { Object o=itr.next();
		 * 
		 * if(al1.contains(o)) itr.remove(); else al1.add(o); }
		 */
		al.removeAll(Collections.singletonList(101));
		System.out.println(al);

	}

}
