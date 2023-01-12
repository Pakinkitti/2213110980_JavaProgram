import java.awt.*;
import javax.swing.*;
public class testgui extends JFrame{
	private static final int WIDTH = 400;
	private static final int HEIGHT = 300;
	private JLabel lblLenght,lblWidth,lblArea,lblPerimeter;
	private JTextField txtLenght,txtWidth,txtArea,txtPerimeter;
	public testgui() {
		setTitle("Area and Perimeter");
		setSize(WIDTH,HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		lblLenght = new JLabel("Enter the length : ",SwingConstants.RIGHT);
		lblWidth = new JLabel("Enter the Width : ",SwingConstants.RIGHT);
		lblArea = new JLabel("Enter the Area : ",SwingConstants.RIGHT);
		lblPerimeter = new JLabel("Enter the Perimeter : ",SwingConstants.RIGHT);
		//txtLenght = new JTextField("10");
		GridLayout L = new GridLayout(4,1);
		setLayout(L);
		add(lblLenght);
		add(lblWidth);
		add(lblArea);
		add(lblPerimeter);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testgui prog = new testgui();
	}

}
