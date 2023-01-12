import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class TempConversion extends JFrame{
	private JLabel lblcelsius;
	private JLabel lblFahhrentheit;
	
	private JTextField tfcelsius;
	private JTextField tfFahhrentheit;
	private static final int WIDTH = 500;
	private static final int HEIGHT = 100;
	private static final double FTOC = 5.0/9.0;
	private static final double CTOF = 9.0/5.0;
	private static final int OFFSET = 32;
	
	private TempConversion(){
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(1,4));
		
		lblcelsius = new JLabel("Temp in Celsius : ",SwingConstants.RIGHT);
		lblFahhrentheit = new JLabel("Temp in Fahreheit : ",SwingConstants.RIGHT);
		tfcelsius = new JTextField(10);
		tfFahhrentheit = new JTextField(10);
		c.add(lblcelsius);c.add(tfcelsius);
		c.add(lblFahhrentheit);c.add(tfFahhrentheit);
		
		CelsHandler celsiusHandler = new CelsHandler();
		tfcelsius.addActionListener(celsiusHandler);
		FahHandler FahhrentHandler = new FahHandler();
		tfFahhrentheit.addActionListener(FahhrentHandler);
		
		setTitle("Area and Perimeter");
		setSize(WIDTH,HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	private class CelsHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			double celsius,fahrenheit;
			celsius = Double.parseDouble(tfcelsius.getText());
			fahrenheit = celsius * CTOF + OFFSET;
			tfFahhrentheit.setText(String.format("%.2f",fahrenheit));
			
		}
	}
		private class FahHandler implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				double celsius,fahrenheit;
				fahrenheit = Double.parseDouble(tfcelsius.getText());
				celsius = (fahrenheit - OFFSET)* FTOC;
				tfFahhrentheit.setText(String.format("%.2f",celsius));
				
			}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TempConversion prog = new TempConversion();
	}

}
