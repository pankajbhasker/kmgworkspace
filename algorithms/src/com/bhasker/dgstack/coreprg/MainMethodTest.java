class MainOverride {

	public static void main(String[] args) {
		System.out.println("I am from super");
	}
}

class MainOverride1 extends MainOverride {

	public static void main(String[] args) {

		System.out.println("I am from sub");

	}

}

class MainMethodTest {
	
	public static void main(String[] args) {

		MainOverride mainOverride = new MainOverride();
		mainOverride.main(args);

		/*
		 * MainOverride mainOverride1 = new MainOverride1(); mainOverride1.main(args);
		 */

		MainOverride1 mainOverride1 = new MainOverride1();
		mainOverride1.main(args);

	}

}