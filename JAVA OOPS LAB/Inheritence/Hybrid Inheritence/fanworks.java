class device {
	void start() {
	System.out.println("device is starting");
	}
}

class light extends device {
	void glow() {
	System.out.println("light is glowing");
	}
}

class fan extends device {
	void spin() {
	System.out.println("fan is spinning");
	}
}

class smartfan extends fan {
	void control() {
	System.out.println("smartfan is controlled remotely");
	}
}

class main {
	public static void main(String[] args) {
	smartfan sf = new smartfan();
	light l=new light();
	sf.start();
	sf.spin();
	l.glow();
	sf.control();
	}
}
