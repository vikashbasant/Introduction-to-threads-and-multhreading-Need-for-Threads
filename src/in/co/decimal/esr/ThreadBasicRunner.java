package in.co.decimal.esr;

public class ThreadBasicRunner {

	public static void main(String[] args) throws InterruptedException {
		// Task1 - 101 to 199

		System.out.println("\nTask1 Kicked Off");
		Task1 task1 = new Task1();
		task1.setPriority(1);
		task1.start();

		// Task2 - 201 to 299

		System.out.println("\nTask2 Kicked Off");
		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);
		task2Thread.setPriority(10);
		task2Thread.start();
		System.out.print("\nTaks2 Done");

		// Task3 - 301 to 302

		// wait for task to complete:
		task1.join();
		task2Thread.join();

		System.out.println("\nTask3 Kicked Off");
		for (int i = 301; i <= 399; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\nTaks3 Done");
		System.out.print("\nMain Done");
	}
}
