package in.co.decimal.esrm;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask1 implements Callable<String> {

	private String name;

	// constructor:
	public CallableTask1(String name) {
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return "Hello " + this.name;
	}

}

public class MultipleCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(3);

		List<CallableTask1> tasks = List.of(new CallableTask1("in28Minutes"), new CallableTask1("vikky"),
				new CallableTask1("Basant"));

		List<Future<String>> result = executorService.invokeAll(tasks);

		for (Future<String> smallResult : result) {
			System.out.println(smallResult.get());
		}
		executorService.shutdown();
	}
}
