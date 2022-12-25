package in.co.decimal.esrm;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Here We will use an approach called: extends Thread
class Task extends Thread {

	private int number;

	// Create an constructor:
	public Task(int number) {
		this.number = number;
	}

	// exact signature:
	@Override
	public void run() {
		System.out.print("\nTaks" + this.number + " Started");
		// Task1
		for (int i = this.number * 100; i <= this.number * 100 + 99; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\nTaks" + this.number + " Done");
	}
}

public class ExecutorServiceRunner {

	public static void main(String[] args) {
		// Now it would execute one thread at a time:
//		ExecutorService executorService = Executors.newSingleThreadExecutor();
		
		// Now it would execute multiple thread at a time:
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		executorService.execute(new Task(1));
		executorService.execute(new Task(2));
		executorService.execute(new Task(3));
		executorService.execute(new Task(4));
		executorService.execute(new Task(5));
		executorService.execute(new Task(6));
		executorService.execute(new Task(7));


		// now executorService is shutdown:
		executorService.shutdown();
	}
}
