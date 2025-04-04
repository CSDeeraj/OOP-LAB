class Plant {
void grow() {
	System.out.println("The tree is grew taller, now it is a huge tree.");
	}

void water() {
	System.out.println("watering the plant...");
	}

}

class Tree extends Plant {
void grow() {
	System.out.println("The tree is grew taller, now it is a huge tree.");
	}
}

public class plantgrowth {
public static void main(String[] args) {
	Tree tree = new Tree();
	tree.water(); 
	tree.grow();  
	}
}
