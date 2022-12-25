package in.co.decimal.threads;

//Here We will used an approach called: extends Thread
public class Task1 extends Thread {
	// exact signature:
	@Override
	public void run() {
		System.out.print("\nTaks1 Started");
		// Task1
		for (int i = 101; i <= 199; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\nTaks1 Done");
	}
}
