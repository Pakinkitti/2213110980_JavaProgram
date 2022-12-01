import java.util.*;
public class Lab401 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Full Name: ");
		String fullname = scan.nextLine();
		if (!fullname.contains(" ")) {
			System.out.println("Incorrect Name");
			
		}
		else {
			int check = fullname.indexOf(" ");
		String firstname = fullname.substring(0,check).toUpperCase();
		String lastname = fullname.substring(check,fullname.length()).toLowerCase();
		System.out.println("First Nmae: "+firstname);
		System.out.println("Last Nmae: "+lastname.trim());
		}

	}
}

