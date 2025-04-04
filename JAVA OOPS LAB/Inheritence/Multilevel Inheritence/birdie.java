class Animal {
	void eat() {
		System.out.println("Animal is eating.");
	}
}

class Bird extends Animal {
	void fly() {
		System.out.println("Bird is flying.");
	}
}

class Parrot extends Bird {
	void talk() {
		System.out.println("Parrot is talking!");
	}
}

public class birdie {
	public static void main(String[] args) {
		Parrot parrot = new Parrot();
		parrot.eat();  
		parrot.fly();  
		parrot.talk(); 
	}
}
