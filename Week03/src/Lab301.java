import javax.swing.*;
import java.text.*;

public class Lab301 {
	static final int priceperson = 299;

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		int numberofcustomer = Integer.parseInt(JOptionPane.showInputDialog("How many customer per bill"));
		double totalPrice = numberofcustomer * priceperson;
		int membercard;
		membercard = JOptionPane.showConfirmDialog(null,
				"'Total Price is" + frm.format(totalPrice) + " baht." + "\nDo you have member card?");
		if (membercard == 0) {
			totalPrice = totalPrice * 90 / 100;
			JOptionPane.showConfirmDialog(null, "'Total Price is" + frm.format(totalPrice) + " baht.");

		} else if (membercard == 0) {
			JOptionPane.showConfirmDialog(null, "'Total Price is" + frm.format(totalPrice) + " baht.");
		}
		do {
			membercard = JOptionPane.showConfirmDialog(null,
					"'Total Price is" + frm.format(totalPrice) + " baht." + "\nDo you have member card?");
		} while (membercard == 2);
	}

}
