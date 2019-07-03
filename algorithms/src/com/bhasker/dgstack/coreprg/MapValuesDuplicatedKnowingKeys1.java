package com.bhasker.dgstack.coreprg;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapValuesDuplicatedKnowingKeys1 {

	public static void main(String[] args) {

		Map m = new HashMap();

		m.put(101, "hussain");
		m.put(102, "chandra");
		m.put(103, "hussain");
		m.put(104, "xxx");
		m.put(105, "hussain");
		m.put(106, "hi");
		m.put(107, "hi");

		Map m1 = new HashMap();

		Set set = m.entrySet();

		Iterator itr = set.iterator();

		while (itr.hasNext()) {

			Map.Entry me = (Map.Entry) itr.next();

			Object key = me.getKey();
			Object value = me.getValue();
			if (m1.containsValue(value)) {
				itr.remove();
			} else
				m1.put(key, value);
		}
		
		Set set1 = m.entrySet();
		Iterator it = set1.iterator();

		while (it.hasNext()) {
			Map.Entry me1 = (Map.Entry) it.next();
			System.out.println("key is" + " " + me1.getKey() + " value is " + me1.getValue());
		}
	}

}
