import javax.swing.*;

public class Lab503 {
	static int inputyear;

	public static void main(String[] args) {
		inputyear = Integer.parseInt(JOptionPane.showInputDialog("Input Year : "));
		// boolean chkYear = checkYear(inputyear);
		// System.out.println(chkYear);

		while (checkYear(inputyear)) {
			inputyear = Integer.parseInt(
					JOptionPane.showInputDialog("Please input year between 1000-3000" + "\nInput Year,again"));
		}
		if(isLeapYear(inputyear)) {
			JOptionPane.showMessageDialog(null, inputyear+"Is Leap year");
		}
		else {
			JOptionPane.showMessageDialog(null, inputyear+"Is not Leap year");
		}

	}// end of main() method

	public static boolean checkYear(int year) {
		if (inputyear < 1000 && inputyear > 3000)
			return true;
		else {
			return false;
		}
	}
	public static boolean isLeapYear(int year) {
		if((year %4==0)&& ((year%100!=0)||(year%400==0))) {
			return true;
			
		}
		else {
			return false;
		}
	}
}
