class Payment {
	void pay() {
		System.out.println("payment is done");
	}
}

class Card extends Payment {
	void pay() {
		System.out.println("paid using card");
	}
}

class Cash extends Payment {
	void pay() {
		System.out.println("paid using cash");
	}
}

class Main {
	public static void main(String[] args) {
		Card card = new Card();
		Cash cash = new Cash();
		card.pay();
		cash.pay();
	}
}
