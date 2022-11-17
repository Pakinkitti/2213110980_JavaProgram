import javax.swing.*;
import java.text.*;
public class MusicWorldApp {

	static final double TAX_RATE = .0625;
	public static void main(String[] args) {
		DecimalFormat frm =new DecimalFormat("0.##");
		String cdId,cdTitle;
		int cdQuantity;
		double cdPrice;

		
		cdId = JOptionPane.showInputDialog("This program calculate the total cost of a CD order\nPlease enter the ID of the CD");
		cdTitle = JOptionPane.showInputDialog("Please enter the title of CD");
		cdPrice =Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of the CD in U.S.dollar"));
		cdQuantity = Integer.parseInt(JOptionPane.showInputDialog("Please enter the quantity to be purchased"));
		double cdSubtotal =cdPrice*cdQuantity;
		double cdTotal=cdSubtotal * (1 + TAX_RATE);
		JOptionPane.showMessageDialog(null, "Summary of the transaction:\n"+
		"\nCD ID: "+cdId+
		"\nCD Title: "+cdTitle+
		"\nCD Unit Price: $"+cdPrice+
		"\nCD Quantity: "+cdQuantity+
		"\n\nSubtotal: $"+cdSubtotal+
		"\nTax rate: "+frm.format(TAX_RATE * 100)+"%"
		+"\nTotal: $"+cdTotal+
		"\n\nEnd of Program");
		
		
		

	}

}
	