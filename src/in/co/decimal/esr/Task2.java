package in.co.decimal.esr;

class Task2 implements Runnable {

	@Override
	public void run() {
		System.out.print("\nTaks2 Started");
		// Task1
		for (int i = 201; i <= 299; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\nTaks2 Done");
	}

}