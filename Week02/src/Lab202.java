import java.util.Scanner;
public class Lab202 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input the number of minutes: ");
		int time =scan.nextInt();
		int day,year;
		day =time/60/24%365;
		year=time/60/24/365;
		System.out.print(time+" minutes is approximately "+year +" year and "+day+" days");

	}

}
