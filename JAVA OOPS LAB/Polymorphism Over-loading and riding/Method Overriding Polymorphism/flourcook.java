import java.util.Scanner;

class flour {
	int flouramt;
	flour(int flouramt) {
		this.flouramt = flouramt;
	}
	void use() {
		System.out.println("I'm flour. I am used to make different kinds of food.");
	}
	int flourer() {
		return flouramt;
	}
}

class bread extends flour {
	bread(int flouramt) {
		super(flouramt);
	}
	void use() {
		if (flouramt < 3) {
			System.out.println("flour amount insufficient");
		} else {
			System.out.println("I'm bread. I need 3 cups of flour to make.");
			flouramt -= 3;
		}
	}
}

class cake extends flour {
	cake(int flouramt) {
		super(flouramt);
	}
	void use() {
		if (flouramt < 5) {
			System.out.println("flour amount insufficient");
		} else {
			System.out.println("I'm a cake. I need 5 cups of flour to make.");
			flouramt -= 5;
		}
	}
}

class pasta extends flour {
	pasta(int flouramt) {
		super(flouramt);
	}
	void use() {
		if (flouramt < 2) {
			System.out.println("flour amount insufficient");
		} else {
			System.out.println("I'm pasta. I need 2 cups of flour to make.");
			flouramt -= 2;
		}
	}
}

public class flourcook300 {
	public static void main(String[] args) {
		Scanner u = new Scanner(System.in);
		System.out.print("Enter amount of flour: ");
		int flouramt = u.nextInt();
		bread b = new bread(flouramt);
		cake c = new cake(flouramt);
		pasta p = new pasta(flouramt);
		b.use();
		System.out.println("Remaining flour after bread: " + b.flourer());
		c.use();
		System.out.println("Remaining flour after cake: " + c.flourer());
    	p.use();
		System.out.println("Remaining flour after pasta: " + p.flourer());
	}
}
