import java.util.Scanner;

public class AuthorDemo2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Author author = new Author();
		Author[] A = new Author[4];
		int count = 1;
		for(int i = 1;i<A.length;i++) {
			System.out.println("Informatoin Author "+i);
			Line();
			System.out.print("Input author name  : ");
			String name = scan.nextLine();
			System.out.print("Input author email   : ");
			String email = scan.nextLine();
			A[i] = new Author(name,email);
		}
			System.out.println();
			for(int i = 1; i < A.length;i++) {
				System.out.println(i+" "+a);
			}
		}
	public static void Line() {
		for(int i = 1 ; i<50;i++) {
			System.out.print("-");
		}
		System.out.println();
	}

}
