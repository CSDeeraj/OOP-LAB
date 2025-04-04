class car {
	private boolean on;
	private double fuellvl;

	public car(double fuellvl) {
		this.on = false;
		this.fuellvl = fuellvl;
	}

	public boolean ison() {
		return on;
	}

	public double getfuel() {
		return fuellvl;
	}

	public void start() {
		if (fuellvl > 0) {
			on = true;
			System.out.println("engine on.");
		} else {
			System.out.println("no fuel.");
		}
	}

	public void stop() {
		on = false;
		System.out.println("engine off.");
	}

	public void refuel(double amt) {
		fuellvl += amt;
		System.out.println("refueled: " + fuellvl);
	}
}

public class carmain {
	public static void main(String[] args) {
		car mycar = new car(10.0); 

		mycar.start(); 
		mycar.refuel(20.0); 
		mycar.stop(); 
	}
}
