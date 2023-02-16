import java.io.*;
import java.util.*;
import java.text.*;

public class ATMBanking {
	public static void main (String[] args) throws IOException{
		Scanner Console =new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat("0-000-000-00-0");
		Scanner read = new Scanner(new File("ATMBookBank.txt"));
		String temp = "";
		String[] data = temp.split("\t");
		
		System.out.print("Enter account number : ");
		String account = Console.next();
		if(account != data[0]) {
			System.out.println("Input wrong type, Enter account number : ");
			account = Console.next();
		}
		
	}
}
