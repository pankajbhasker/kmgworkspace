interface sayable {
	void say(String msg);
}

public class FunctionalInterface implements sayable {
	public void say(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		FunctionalInterface fie = new FunctionalInterface();
		fie.say("Hello there");
	}
}