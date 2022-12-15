import java.util.*;
public class Lab603 {
	static Scanner scr = new Scanner(System.in);
	static int[] number = {78, 36, 58, 41, 25, 92 , 75};
	public static void main(String[] args) {
		System.out.print("input index of array : ");
		int indexofArray = scr.nextInt();
		while(indexofArray<0||indexofArray>number.length-1) {
			System.out.print("input index of array, again : ");
			indexofArray = scr.nextInt();
		}
		System.out.println();
		System.out.println("Value in current index is " + (number[indexofArray]));
		// System.out.print("Value in next index is " + (number[indexofArray+1]));
		// TODO Auto-generated method stub
		if(number.length-1==indexofArray) {
			System.out.println("Sorry, "+indexofArray + "is the last index in array.");
		}
		else {
			System.out.println("Value in next index is " + (number[indexofArray+1]));
		}

	}

}
