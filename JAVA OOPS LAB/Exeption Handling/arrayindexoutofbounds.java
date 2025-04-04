public class arrayindexoutofbounds {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};
		try {
			System.out.println("trying to access index 7: " + numbers[7]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("error: index 7 is out of bounds. valid index range is 0 to " + (numbers.length - 1));
		}
		System.out.println("array access attempt finished.");
	}
}
