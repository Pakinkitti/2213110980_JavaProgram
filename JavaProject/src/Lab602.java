import java.util.*;
public class Lab602 {
	static Scanner scr = new Scanner(System.in);
	static double sum=0;
	static double averagenumber = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] inputscore = new double[5];
		for(int i =0;i< inputscore.length;i++) {
			System.out.print("Input score of student "+(i+1)+ (" : "));
			inputscore[i] = scr.nextDouble();
			sum += inputscore[i];
		}
		System.out.println();
		averagenumber = sum/(inputscore.length);
		System.out.println("Average of "+ inputscore.length+" Student is "+averagenumber);
		for(int i=0;i <inputscore.length;i++) {
			if(inputscore[i]>averagenumber) {
				System.out.println("> Student "+ (i+1)+"("+inputscore[i]+")");
			}
		}
		

	}

}
