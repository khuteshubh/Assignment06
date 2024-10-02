public class Engine {
	private String engineType;
	private int horsepower;
	private String manufacturer;

	public Engine(String engineType, int horsepower, String manufacturer) {
		this.engineType = engineType;
		this.horsepower = horsepower;
		this.manufacturer = manufacturer;
	}

	public void displayEngineDetails() {
		System.out.println("Engine Type: " + engineType);
		System.out.println("Horsepower: " + horsepower);
		System.out.println("Manufacturer: " + manufacturer);
	}

	public String getEngineType() {
		return engineType;
	}

	public int getHorsepower() {
		return horsepower;
	}

	public String getManufacturer() {
		return manufacturer;
	}
}
