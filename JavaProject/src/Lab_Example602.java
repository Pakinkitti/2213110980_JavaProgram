import javax.swing.*;
public class Lab_Example602 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] validValues = { 101, 108, 201, 213, 266, 304, 311, 409, 411, 412 };
		double[] price = { 0.89, 1.23, 3.50, 0.69, 5.79, 3.19, 0.99, 0.89, 1.26, 8.00 };
		double itemPrice = 0;
		boolean ValidItem = false;
		int itemorder = Integer.parseInt(JOptionPane.showInputDialog("Enter item number to order"));
		for(int i=0;i<validValues.length;i++) {
			if(itemorder == validValues[i]) {
				ValidItem = true;
				itemPrice = price[i];
			}
			
		}
		if(ValidItem) {
			System.out.println("Item"+itemorder+" is "+itemPrice);
		}
		else {
			System.out.println("Invalid Item");
		}
	}

}
