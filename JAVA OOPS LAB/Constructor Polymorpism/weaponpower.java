class weapon {
	String name;
	int power;
	weapon() {
		name="fist";
		power=25;
	}
	weapon(String n) {
		name=n;
		power=50;
	}
	weapon(String n,int p) {
		name=n;
		power=p;
	}
	void show() {
		System.out.println("weapon:"+name+", weapon's power:"+power);
	}
}
class weaponpower {
	public static void main(String[] args) {
		weapon w1=new weapon();
		weapon w2=new weapon("longsword");
		weapon w3=new weapon("warhammer",250);
        weapon w4=new weapon("War Scythe",500);
		w1.show();
		w2.show();
		w3.show();
        w4.show();
	}
}
