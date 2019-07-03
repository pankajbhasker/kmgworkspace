import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetComparator2 {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet(new MyComparator1());

		ts.add("chamhaa");
		ts.add("chandra");
		ts.add("abc");
		ts.add("a");
		ts.add("ab");

		System.out.println(ts);

		Iterator itr = ts.iterator();

		while (itr.hasNext()) {
			Object o = itr.next();
			System.out.println(o);
		}
	}

}

class MyComparator1 implements Comparator {
	public int compare(Object obj1, Object obj2) {
		String s1 = obj1.toString();
		String s2 = obj2.toString();

		int i1 = s1.length();
		int i2 = s2.length();

		if (i1 < i2)
			return -1;
		else if (i1 > i2)
			return +1;
		else
			return s1.compareTo(s2);
	}
}
