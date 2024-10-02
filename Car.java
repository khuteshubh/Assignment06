public class Car {
	private String model;
	private Engine engine;
	private boolean isRunning;

	public Car(String model, Engine engine) {
		this.model = model;
		this.engine = engine;
		this.isRunning = false;
	}

	public void startCar() {
		if (!isRunning) {
			isRunning = true;
			System.out.println(model + " is starting...");
		} else {
			System.out.println(model + " is already running.");
		}
	}

	public void stopCar() {
		if (isRunning) {
			isRunning = false;
			System.out.println(model + " is stopping...");
		} else {
			System.out.println(model + " is already stopped.");
		}
	}

	public void displayEngineDetails() {
		System.out.println("Car Model: " + model);
		engine.displayEngineDetails();
	}
}
