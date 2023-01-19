import java.util.Scanner;

public class AuthorDemo1 {

	public static void main(String[] args) {
		Author author = new Author();
		Scanner scan = new Scanner(System.in);
		System.out.print("Input author name  : ");
		String name = scan.nextLine();
		System.out.print("Input author email   : ");
		String email = scan.nextLine();
		System.out.print("Input author gender : ");
		char gender = scan.next().charAt(0);
		author = new Author(name,email,gender);
		System.out.println();
		System.out.print(author.toString());
	}

}
