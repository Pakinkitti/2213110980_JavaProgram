import javax.swing.*;

public class Lab_Example602_1 {
	static int[] validValues = { 101, 108, 201, 213, 266, 304, 311, 409, 411, 412 };
	static double[] price = { 0.89, 1.23, 3.50, 0.69, 5.79, 3.19, 0.99, 0.89, 1.26, 8.00 };
	static double itemPrice = 0;
	static boolean ValidItem = false;

	public static void main(String[] args) {
		inputItem();

	}

	public static void inputItem() {
		int itemorder = Integer.parseInt(JOptionPane.showInputDialog("Enter item number to order"));
		boolean chk = checkitem(itemorder);
		if(chk) {
			System.out.println("Item"+itemorder+" is "+itemPrice);
		}
		else {
			System.out.println("Invalid Item");
		}

	}

	public static boolean checkitem(int item) {
		for (int i = 0; i < validValues.length; i++) {
			if (item == validValues[i]) {
				ValidItem = true;
				itemPrice = price[i];
			}
		}
		return ValidItem;
	}
}
