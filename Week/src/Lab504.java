import java.util.*;

public class Lab504 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your name , separated by a space.\n:");
		String fullname = scan.nextLine();
		String Firstname;
		int firstspace = fullname.indexOf(" ");
		String firstname = fullname.substring(0, firstspace);
		System.out.println(abbreviatName(fullname).toUpperCase()+firstname);

	}

	public static String abbreviatName(String fullname) {
		String Firstchar = "";
		for (int i = 0; i < fullname.length(); i++) {
			if (fullname.charAt(i) ==' ') {
				Firstchar += fullname.charAt(i+1);
				Firstchar = Firstchar+".";
				
			}
		}
		
		return Firstchar ;

	}
}
