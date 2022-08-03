
class Car{
	private int yearModel; 
	private String make; 
	private int speed; 
	
	public Car(int newYearModel, String newMake){
		yearModel = newYearModel;
		make = newMake;
		speed = 0;
	}
	
	public int getYearModel(){
		return yearModel;
	}


	public String getMake(){
		return make;
	}


	public int getSpeed(){
		return speed;
	}


	public void accelerate(){
		speed = speed + 5;
	}


	public void brake(){
		speed = speed - 5;
	}
} // end of Car class




class FuelGauge {
	private int fuel;
	private final int MAX = 15;


	public FuelGauge() {
		fuel = 0;
		}


	public FuelGauge(int fuel) {
		setFuel(fuel);
	}



	public int getFuel() {
		return fuel;
	}


	public void setFuel(int fuel) {
		if (fuel <= MAX) {
			this.fuel = fuel;
		} else {
			this.fuel = MAX;
			}
	}


	public void addFuel() {
		if (fuel < MAX) {
			fuel += 1;
		}
	}



	public void burnFuel() {
		if (fuel > 0) {
			fuel -= 1;
		}
	}



	public String toString() {
		return "Fuel left: " + fuel + " Gallons";
	}

}




class Odometer {
	private int mileage;
	private FuelGauge fuelGauge;
	private int MAX = 999999; // max mileage
	private int fuel_economy = 22;

	
	public Odometer() {
		mileage = 0;
		fuelGauge = new FuelGauge();
	}

	public Odometer(int mileage, FuelGauge fuelGauge) {
		setMileage(mileage);
		this.fuelGauge = fuelGauge;
	}


	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		if (mileage <= MAX)
		this.mileage = mileage;
	}

	public void setFuelGauge(FuelGauge fuelGauge) {
		this.fuelGauge = fuelGauge;
	}

	public FuelGauge getFuelGauge() {
		return fuelGauge;
	}


	public void incrementMileage() {
		mileage += 1;
		if (mileage > MAX) {
			mileage = 0;
		}
		if (mileage % fuel_economy == 0) {
			fuelGauge.burnFuel();
		}
	}


	public String toString() {
		return "Mileage: " + mileage + " miles, " + fuelGauge;
	}

}



public class Test {

	public static void main(String[] args) {

		Car myCar = new Car(2013, "hyundai");
		System.out.println("Year model of the car: " + myCar.getYearModel());
		System.out.println("Make of the car: " + myCar.getMake());
		System.out.println();
	
		FuelGauge fuelGauge = new FuelGauge(15);

		Odometer odometer = new Odometer(0, fuelGauge);


		while (odometer.getFuelGauge().getFuel() > 0) {
			for(int i = 0; i < 3; i++){
				myCar.accelerate();
			}

			for(int i = 0; i < 2; i++){
				myCar.brake();
				System.out.println("Current speed of the car: " + myCar.getSpeed());
			}

			odometer.incrementMileage();

			System.out.println(odometer);
		}

		System.out.println("Car ran out of fuel at " + odometer.getMileage() + " miles");

	}

}