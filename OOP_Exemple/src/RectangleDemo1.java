import javax.swing.*;
public class RectangleDemo1 {

	public static void main(String[] args) {
		double width = Double.parseDouble(JOptionPane.showInputDialog("Input Width "));
		double lenght = Double.parseDouble(JOptionPane.showInputDialog("Input Lenght "));
		String color = JOptionPane.showInputDialog("Input color ");
		// TODO Auto-generated method stub
		Rectangle rec = new Rectangle(width,lenght,color);
		JOptionPane.showMessageDialog(null, rec+"\nArea of Rectangle is "+rec.getArea());
		
	}

}
