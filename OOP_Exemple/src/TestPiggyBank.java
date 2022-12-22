import java.util.*;

public class TestPiggyBank {
	static Scanner scan = new Scanner(System.in);
	static PiggyBank pb = new PiggyBank();

	public static void main(String[] args) {
		/*
		 * PiggyBank pb = new PiggyBank();
		 * 
		 * pb.setPiggyBank(500); System.out.println("Mooney Total : "+pb.getTotal());
		 * pb.addtwo(34); System.out.println("Add 2 Baht Money : "+34);
		 * System.out.println("Mooney Total : "+pb.getTotal()); pb.addtwo(13);
		 * System.out.println("Add 10 Baht Money : "+13);
		 * System.out.println("Mooney Total : "+pb.getTotal()); pb.addfive(100);
		 */
		SizeofPiggyBank();

	}

	public static void SizeofPiggyBank() {
		System.out.println("Money Total : " + pb.getTotal());
		System.out.print("Please degine size of PiggyBank : ");
		// int size = scan.nextInt();
		// pb.setPiggyBank(size);
		pb.setPiggyBank(scan.nextInt());
		System.out.println("Size of your PiggyBank : " + pb.getPiggyBank());
		inputcoin();
	}

	public static void inputcoin() {
		while(true){
		System.out.println("============================");
		System.out.println("Menu of PiggyBank");
		System.out.println("============================");
		System.out.println("[1] One baht.");
		System.out.println("[2] Two baht.");
		System.out.println("[3] Five baht.");
		System.out.println("[4] Ten baht.");
		System.out.println("[5] Exit");
		System.out.println("============================");
		System.out.print("Please select choice : ");
		int choice = scan.nextInt();
		if (choice == 1) {
			System.out.print("Insert 1 baht : ");
			pb.addOne(scan.nextInt());
			System.out.println("Money Total : " + pb.getTotal());
		}
		if (choice == 2) {
			System.out.print("Insert 2 baht : ");
			pb.addtwo(scan.nextInt());
			System.out.println("Money Total : " + pb.getTotal());
		}
		if (choice == 3) {
			System.out.print("Insert 5 baht : ");
			pb.addfive(scan.nextInt());
			System.out.println("Money Total : " + pb.getTotal());
		}
		if (choice == 4) {
			System.out.print("Insert 10 baht : ");
			pb.addten(scan.nextInt());
			System.out.println("Money Total : " + pb.getTotal());
		} else if (choice == 5) {
			System.out.println("bye bye");
			break;
		}
		}
	}
}
