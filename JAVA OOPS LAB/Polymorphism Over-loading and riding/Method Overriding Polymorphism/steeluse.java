import java.util.Scanner;

class steel {
	int steelamt;
	steel(int steelamt) {
		this.steelamt = steelamt;
	}
	void use() {
		System.out.println("I'm steel. I am used to make other useful materials.");
	}
	int steeler() {
		return steelamt;
	}
}

class chair extends steel {
	chair(int steelamt) {
		super(steelamt);
	}
	void use() {
		if (steelamt < 5) {
			System.out.println("steel amount insufficient");
		} else {
			System.out.println("I'm a Chair. I'm partially made out of steel. I need 5 kilos of steel to make.");
			steelamt -= 5;
		}
	}
}

class bottle extends steel {
	bottle(int steelamt) {
		super(steelamt);
	}
	void use() {
		if (steelamt < 1) {
			System.out.println("steel amount insufficient");
		} else {
			System.out.println("A small bottle, made from strong steel. I need 1 kilo of steel to make.");
			steelamt -= 1;
		}
	}
}

class carframe extends steel {
	carframe(int steelamt) {
		super(steelamt);
	}
	void use() {
		if (steelamt < 500) {
			System.out.println("steel amount insufficient");
		} else {
			System.out.println("A big car, made from steel. I need 500 kilos of steel to make.");
			steelamt -= 500;
		}
	}
}

public class steeluse {
	public static void main(String[] args) {
		Scanner u = new Scanner(System.in);
		System.out.print("Enter amount of steel: ");
		int steelamt = u.nextInt();
		chair c = new chair(steelamt);
		bottle b = new bottle(steelamt);
		carframe cf = new carframe(steelamt);
		c.use();
		System.out.println("Remaining steel after chair: " + c.steeler());
		b.use();
		System.out.println("Remaining steel after bottle: " + b.steeler());
		cf.use();
		System.out.println("Remaining steel after carframe: " + cf.steeler());
	}
}
