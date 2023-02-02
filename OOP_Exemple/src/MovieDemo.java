import java.util.*;
public class MovieDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Movie movie = new Movie();
		System.out.print("Input movie id       : ");
		String Movieid = scan.nextLine();
		System.out.print("Input movie name     : ");
		String Moviename = scan.nextLine();
		System.out.println();
		System.out.print("Input director name  : ");
		String Direcname = scan.nextLine();
		System.out.print("Input director email : ");
		String Direcemail = scan.nextLine();
		System.out.print("Input director gender: ");
		char Direcgender = scan.next().toLowerCase().charAt(0);
		while(!(Direcgender == 'f'||Direcgender == 'm')) {
			System.out.print("input director gender, again: ");
			Direcgender = scan.next().toLowerCase().charAt(0);
		}
		System.out.println();
		System.out.print("Input movie theather no. : ");
		int theatherno = scan.nextInt();
		while(theatherno <=0 || theatherno >15) {
			System.out.print("Please input 1 - 15 only : ");
			theatherno = scan.nextInt();
		}
		Theater theater = new Theater(Movieid,Moviename,new Director(Direcname,Direcemail,Direcgender),theatherno);
		System.out.println();
		System.out.println(theater);
	}
		
}
