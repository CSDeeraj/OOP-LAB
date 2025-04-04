import java.util.Scanner;

class student {
	private String name;
	private int age;
	private double grade;

	public student(String name, int age, double grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

	public String getname() {
		return name;
	}

	public int getage() {
		return age;
	}

	public double getgrade() {
		return grade;
	}

	public void studentinfo() {
		System.out.println("student name: " + getname());
		System.out.println("student age: " + getage());
		System.out.println("student exam score: " + getgrade());
	}
}

public class studentapp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("enter student name: ");
		String name = scanner.nextLine();

		System.out.print("enter student age: ");
		int age = scanner.nextInt();

		System.out.print("enter student exam score: ");
		double grade = scanner.nextDouble();
		scanner.nextLine();

		student stu = new student(name, age, grade);

		System.out.print("do you want to see the student details? (yes/no): ");
		String choice = scanner.nextLine().toLowerCase();

		if (choice.equals("yes")) {
			System.out.println("\nstudent details:");
			stu.studentinfo();
		} else {
			System.out.println("okay, details not shown.");
		}

		scanner.close();
	}
}
