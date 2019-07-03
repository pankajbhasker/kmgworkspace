import java.util.HashMap;

class WeakHashMapDemo {
	public static void main(String[] args) {
		HashMap hm = new HashMap();

		Temp t = new Temp();

		hm.put(t, "durga");
		System.out.println(hm);

		t = null;
		System.gc();
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(hm);
	}
}

class Temp {
	public String toString() {
		return "temp";
	}

	public void finalize() {
		System.out.println("finalized method called");
	}
}
