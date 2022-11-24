import javax.swing.*;
import java.text.*;
public class Lab302 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("##.#");
		double weight = Double.parseDouble(JOptionPane.showInputDialog("Input Weight: "));
		double height = Double.parseDouble(JOptionPane.showInputDialog("Input Height: "));
		double bmi = weight/Math.pow(height/100, 2);
		String status;
		if(bmi >=30) {
			status = "Obesity";
		}
		else if(bmi <= 29.9&&bmi >=25){
			status = "Overweight";
		}
		else if(bmi <= 24.9&&bmi >=18.5) {
			status = "Normal-weight";
			}
		else {
			status = "Underweight";
		}
		JOptionPane.showMessageDialog(null, "BMI = "+frm.format(bmi)+"\nYou're "+status,"BMI",JOptionPane.WARNING_MESSAGE);

	}

}
