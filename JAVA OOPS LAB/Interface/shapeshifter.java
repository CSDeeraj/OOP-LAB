import java.util.Random;

interface shape {
	void transform();
}

class circle implements shape {
	public void transform() {
		System.out.println("circle transforms into " + shapeshifter.getrandomshape());
	}
}

class square implements shape {
	public void transform() {
		System.out.println("square transforms into " + shapeshifter.getrandomshape());
	}
}

class triangle implements shape {
	public void transform() {
		System.out.println("triangle transforms into " + shapeshifter.getrandomshape());
	}
}

class shapeshifter {
	static String[] shapes = {"circle", "square", "triangle"};
	
	static String getrandomshape() {
		return shapes[new Random().nextInt(shapes.length)];
	}

	static void process(shape s) {
		s.transform();
	}
	
	public static void main(String[] args) {
		shape[] shapelist = {new circle(), new square(), new triangle()};
		for(int i = 0; i < 5; i++) {
			process(shapelist[new Random().nextInt(shapelist.length)]);
		}
	}
}
