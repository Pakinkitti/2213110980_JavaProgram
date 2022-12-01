import java.util.*;
public class Lab403 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Message : ");
		String Message = scan.nextLine();
		int a = 0;
		String checkmessage = Message.toLowerCase();
		 if(checkmessage.indexOf("nichi")>=0) {
			 a++;
			 
		 }
		 if(a == 0) {
			 System.out.println(Message);
		 }
		 else {
			 System.out.println("Nichi is a sentence");
		 }
	}

}
