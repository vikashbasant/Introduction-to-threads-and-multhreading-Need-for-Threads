package in.co.decimal.threads;


public class ThreadBasictRunner1 {

	public static void main(String[] args) {
		// Task1 - 101 to 199

		System.out.println("\nTask1 Kicked Off");
		Task1 task1 = new Task1();
		task1.start();

		// Task2 - 201 to 299

		System.out.println("\nTask2 Kicked Off");
		for (int i = 201; i <= 299; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\nTaks2 Done");

		// Task3 - 301 to 302



		System.out.println("\nTask3 Kicked Off");
		for (int i = 301; i <= 399; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\nTaks3 Done");
		System.out.print("\nMain Done");
	}
}
