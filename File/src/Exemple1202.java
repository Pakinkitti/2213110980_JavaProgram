import java.io.*;
import java.util.*;

public class Exemple1202 {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.print("Input Section : ");
		int section = input.nextInt();
		Header(section);
		showListStudent(section);
		
		
	}
	public static void showListStudent(int sec)throws IOException{
		BufferedReader read = new BufferedReader(new FileReader("List107.txt"));
		String temp = "";
		while((temp = read.readLine())!= null) {
			String[] data = temp.split("\t");
			double midtermScore = Double.parseDouble(data[4]);
			double finaltermScore = Double.parseDouble(data[5]);
			String gradeResult = findResult(midtermScore,finaltermScore);
			if(Interger.parseInt(data[3])==sec) {
				System.out.println(data[0]+" "+data[2]+"\t"+midtermScore+"\t"+finaltermScore+"\t"+gradeResult);
			}
		}
	}
	public static String findResult (double mid, double fin) {
		double totalScore = mid+fin;
		if(totalScore <=40)return "Fail";
		else return "Pass";
	}
	public static void Header(int sec) {
		System.out.println("*****************************************************************************");
		System.out.println("\t\tList of Data for Section "+sec);
		System.out.println("*****************************************************************************");

	}

}
