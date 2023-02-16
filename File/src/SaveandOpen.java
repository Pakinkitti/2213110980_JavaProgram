import java.io.*;
import java.util.*;
public class SaveandOpen extends Employee{
	private String name;
	private String dept;
	public void insert() throws IOException {
		Scanner console = new Scanner(System.in);
		PrintStream ps = new PrintStream(new File("employee.txt"));
		String answer;
		do {
			super.header();
			System.out.print("Enter name: ");
			name = console.next();
			System.out.print("Enter department: ");
			dept = console.next();
			ps.println(name+"\t"+dept);
			System.out.print("Enter data again? ");
			answer = console.next();
		}while(answer.equalsIgnoreCase("y"));
	}
	public void read() {
		try {
			Scanner in = new Scanner(new File("employee.txt"));
			
			int i = 0;
			boolean check = false;
			super.header();
			while(dept.equalsIgnoreCase(super.getDept(dept))) {
				i++;
				System.out.print(i + " ( " + name);
				check = true;
			}
			if(check) {
				super.header();
				System.out.print("\nEmployee in department "+super.getDept()+"in file.");
				
			}
			
		}catch(IOException e) {
			System.out.print("\nSorry, file not found......");
		}
	}
	
}
