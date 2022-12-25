package in.co.decimal.esrm;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask implements Callable<String> {

	private String name;

	// constructor:
	public CallableTask(String name) {
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return "Hello " + this.name;
	}

}
public class CallabeRunner {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		Future<String> welComeFuture = executorService.submit(new CallableTask2("in28Minutes"));

		System.out.println("\nnew CallableTask(\"in28Minutes\")");

		String welcomeMessage = welComeFuture.get();
		System.out.println("\n" + welcomeMessage);

		System.out.println("\nMain Completed");

		// after executation of thread we need to shutdown the thread.
		executorService.shutdown();

	}
}
