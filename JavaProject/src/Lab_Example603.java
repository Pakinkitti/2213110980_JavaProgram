import java.util.*;
public class Lab_Example603 {
	
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int number[] = new int[5];
		for(int i=0;i<number.length;) {
			System.out.print("Input number "+ (i+1)+" : ");
			number[i] = scr.nextInt(0);
		}
		System.out.println();
		System.out.println("Summation of position nuber is "+sumOfPos(number));
		

	}
	public static int sumOfPos(int[] nums) {
		int sum =0;
		for(int _num:nums) {
			sum += _num;
			
		}
		return sum;
	}

}
