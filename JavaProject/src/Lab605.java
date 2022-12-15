import javax.swing.*;

public class Lab605 {
	static int[] number = new int[5];

	public static void main(String[] args) {
		for (int i = 0; i < number.length; i++) {
			number[i] = Integer.parseInt(JOptionPane.showInputDialog("input number" + (i + 1) + " : "));

		}
		showEven(number);
		showOdd(number);

	}

	public static void showEven(int[] nums) {
		String showmassge = " ";
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				showmassge += nums[i] + " ";
			}
		}
		JOptionPane.showMessageDialog(null, "List of even number:\n" + showmassge);
	}

	public static void showOdd(int[] nums) {
		String showmassge = " ";
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 != 0) {
				showmassge += nums[i] + " ";
			}
		}
		JOptionPane.showMessageDialog(null, "List of even number:\n" + showmassge);

	}

}
