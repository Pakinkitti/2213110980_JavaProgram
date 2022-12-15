import javax.swing.*;

public class Lab606 {
	public static void main(String[] args) {
		int[] number = { 25, 78, 41, 22, 36, 85, 37 };
		int indexofArray = Integer.parseInt(JOptionPane.showInputDialog("input index of array:"));
		while (checkIndex(number, indexofArray)) {
			indexofArray = Integer.parseInt(JOptionPane.showInputDialog("input index of array, again:"));
		}
		JOptionPane.showMessageDialog(null,
				"Current data, nums[" + indexofArray + "] is " + currentData(number, indexofArray) + "\n"
						+ ((indexofArray!=0 ? "Previos data,num[" + (indexofArray - 1) + "] is "
								+ prevData(number, indexofArray) + "\n" : "No previos data\n")
						+ (indexofArray != number.length-1
								? "Next data,num[" + (indexofArray + 1) + "]" + "is " + nextData(number, indexofArray)
								: "No next data")));
	}

	public static boolean checkIndex(int[] nums, int index) {
		return (index < 0 || index > (nums.length - 1)) ? true : false;

	}

	public static int currentData(int[] nums, int index) {
		return nums[index];
	}

	public static int prevData(int[] nums, int index) {
		return nums[index - 1];
	}

	public static int nextData(int[] nums, int index) {
		return nums[index + 1];
	}

}
