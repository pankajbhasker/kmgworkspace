package com.bhasker.dgstack.coreprg;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTable1 {

	public static void main(String[] args) {

		Hashtable ht = new Hashtable();

		ht.put(101, "null");
		ht.put(102, "hussain");
		ht.put(103, "string");

		Set set = ht.entrySet();
		
		//System.out.println(set);

		Iterator itr = set.iterator();
		while (itr.hasNext()) {

			Object o = itr.next();
			Map.Entry me = (Map.Entry) o;
			// String s=(String) itr.next();
			Object key = me.getKey();
			Object value = me.getValue();

			System.out.println(key + "  " + value);
		}

	}

}
