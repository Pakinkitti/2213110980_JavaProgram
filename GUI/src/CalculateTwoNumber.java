import java.awt.EventQueue;
import java.text.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;

public class CalculateTwoNumber extends JFrame {

	private JPanel contentPane;
	private JTextField Txtnumber1;
	private JTextField textFieldnum2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculateTwoNumber frame = new CalculateTwoNumber();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculateTwoNumber() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumber1 = new JLabel("Enter Number 1 : ");
		lblNumber1.setBounds(24, 0, 116, 36);
		contentPane.add(lblNumber1);
		
		Txtnumber1 = new JTextField();
		Txtnumber1.setBounds(118, 8, 135, 20);
		contentPane.add(Txtnumber1);
		Txtnumber1.setColumns(10);
		
		JLabel lblNumber2 = new JLabel("Enter Number 2 : ");
		lblNumber2.setBounds(24, 35, 140, 20);
		contentPane.add(lblNumber2);
		
		textFieldnum2 = new JTextField();
		textFieldnum2.setBounds(118, 39, 135, 20);
		contentPane.add(textFieldnum2);
		textFieldnum2.setColumns(10);
			
		JLabel lblOperator = new JLabel("Operator");
		lblOperator.setBounds(24, 74, 86, 14);
		contentPane.add(lblOperator);
		
		final JComboBox comboBoxOperator = new JComboBox();
		comboBoxOperator.setBounds(118, 70, 63, 22);
		comboBoxOperator.addItem("+");
		comboBoxOperator.addItem("-");
		comboBoxOperator.addItem("*");
		comboBoxOperator.addItem("/");
		contentPane.add(comboBoxOperator);
		
		JLabel lblHowtoshow = new JLabel("How to show digit");
		lblHowtoshow.setBounds(24, 99, 86, 22);
		contentPane.add(lblHowtoshow);
		
		final JRadioButton rdbtnoneDigit = new JRadioButton("1 Digit");
		rdbtnoneDigit.setBounds(118, 99, 109, 23);
		contentPane.add(rdbtnoneDigit);
		
		final JRadioButton rdbtntwoDigit = new JRadioButton("2 Digit");
		rdbtntwoDigit.setBounds(118, 119, 109, 23);
		contentPane.add(rdbtntwoDigit);
		
		
		ButtonGroup group =new ButtonGroup();
		group.add(rdbtnoneDigit);
		group.add(rdbtntwoDigit);
		final JLabel lblResult = new JLabel("Result");
		lblResult.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblResult.setBounds(325, 196, 63, 20);
		contentPane.add(lblResult);
		
		JLabel Option = new JLabel("Option To show");
		Option.setBounds(23, 148, 87, 14);
		contentPane.add(Option);
		
		final JCheckBox OptionBox = new JCheckBox("show result at DialogBox");
		OptionBox.setBounds(118, 145, 143, 23);
		contentPane.add(OptionBox);
		
		final JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1,num2,sum=0;
				String operator;
				if(e.getSource()==btnOk) {
				num1 = Double.parseDouble(Txtnumber1.getText());
				num2 = Double.parseDouble(textFieldnum2.getText());
				operator = (String)comboBoxOperator.getSelectedItem();
				if(operator.equals("+"))
					sum = num1+num2;
				if(operator.equals("-"))
					sum = num1-num2;
				if(operator.equals("*"))
					sum = num1*num2;
				if(operator.equals("/"))
					sum = num1/num2;
				DecimalFormat frmNumber = null;
				if(rdbtnoneDigit.isSelected()) {
					frmNumber = new DecimalFormat("#,###.0");
				}
				else if (rdbtntwoDigit.isSelected()){
					frmNumber = new DecimalFormat("#,###.00");
				}
				
				lblResult.setText(frmNumber.format(sum));
				}
				if(OptionBox.isSelected()) {
					JOptionPane.showMessageDialog(null,"Result is : "+ sum);
				}
			}
		});
		btnOk.setBounds(94, 227, 89, 23);
		contentPane.add(btnOk);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(228, 227, 89, 23);
		contentPane.add(btnExit);
		
		
		
		

	}
}
