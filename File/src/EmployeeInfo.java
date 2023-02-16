import java.util.*;
import java.io.*;
public class EmployeeInfo {


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner console = new Scanner ( System.in);
		String choice;
		System.out.print("Insert or Read data(form file): ");
		choice = console.next().toLowerCase();
		while(!choice.equals("insert")&&!choice.equals("read")) {
			System.out.print("Please Insert or Read data ? : ");
			choice = console.next().toLowerCase();
		}
		SaveandOpen File = new SaveandOpen();
		if(choice.equals("insert")) {
			File.insert();
		}
		else {
			System.out.print("\nEnter department: ");
			department = console.next();
			
		}
	}

}
