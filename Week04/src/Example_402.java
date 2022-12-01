import javax.swing.*;

public class Example_402 {

	public static void main(String[] args) {
		String email = JOptionPane.showInputDialog("Input your email : ");
		while (email.startsWith("@") || email.contains(" ")) {
			email = JOptionPane.showInputDialog("Input your email, again : ");
		}
		email = email.toLowerCase();
		/*
		 * if(email.endsWith("@gmail.com")||email.endsWith("@hotmail.com"));{
		 * JOptionPane.showMessageDialog(null, "Your e-mail is "+email); } else {
		 * JOptionPane.showMessageDialog(
		 * null,"Your e-mail is not hotmail or gmail dot com"); } // TODO Auto-generated
		 * method stub
		 */
		boolean checkmail = email.endsWith("@gmail.com") || email.endsWith("@hotmail.com");
		JOptionPane.showMessageDialog(null,
				(checkmail) ? "Your e-mail is " + email : "Your e-mail is not hotmail or gmail dot com");

	}

}
