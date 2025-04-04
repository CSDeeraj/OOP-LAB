class Delivery {
	void deliver() {
	System.out.println("delivery is on the way");
	}
}

class Drone extends Delivery {
	void deliver() {
	System.out.println("delivered by drone");
	}
}

class Truck extends Delivery {
	void deliver() {
	System.out.println("delivered by truck");
	}
}

class Bike extends Delivery {
	void deliver() {
	System.out.println("delivered by bike");
	}
}

class Robot extends Delivery {
	void deliver() {
	System.out.println("delivered by robot");
	}
}

class Main {
	public static void main(String[] args) {
	Drone drone = new Drone();
	Truck truck = new Truck();
	Bike bike = new Bike();
	Robot robot = new Robot();
	drone.deliver();
	truck.deliver();
	bike.deliver();
	robot.deliver();
}
}
