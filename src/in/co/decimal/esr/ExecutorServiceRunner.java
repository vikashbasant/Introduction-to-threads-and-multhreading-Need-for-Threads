package in.co.decimal.esr;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceRunner {

	public static void main(String[] args) {
		// Now it would execute one thread at a time:
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		executorService.execute(new Task1());
		executorService.execute(new Thread(new Task2()));

		// Task3:
		System.out.println("\nTask3 Kicked Off");
		for (int i = 301; i <= 399; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\nTaks3 Done");
		System.out.print("\nMain Done");

		// now executorService is shutdown:
		executorService.shutdown();
	}
}
