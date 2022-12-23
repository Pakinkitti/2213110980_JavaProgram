import java.util.*;

public class StudentScore {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("How many student in classroom : ");
		int size = scan.nextInt();
		System.out.println();
		Student[] std = new Student[size];
		for (int i = 0; i < std.length; i++) {
			std[i] = new Student();
			System.out.print("Input student name : ");
			std[i].setName(scan.next());
			System.out.print("Input student score : ");
			std[i].setScore(scan.nextInt());
			while (!std[i].checkscore()) {
				System.out.print("Input student score, again : ");
				std[i].setScore(scan.nextInt());
			}
			System.out.println();
			System.out.println("-------------------------------------");
		}
		for (Student STD : std) {
			if (STD.isPass()) {
				System.out.println(">> " + STD.getName() + "get grade " + STD.findGrade(STD.getScore()));
			}
		}
	}

}
