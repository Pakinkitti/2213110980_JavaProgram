import javax.swing.*;
public class BookDemo2 {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("input author name: ");
		String email = JOptionPane.showInputDialog("input author e-mail: ");
		String title = JOptionPane.showInputDialog("input book title: ");
		int page = Integer.parseInt( JOptionPane.showInputDialog("input book page:"));
		int ConfirmPage = JOptionPane.showConfirmDialog(null,"is the page correct?","Confirm",JOptionPane.YES_NO_OPTION);
		Book1 book1 = new Book1(title,new Author1(name,email),page);
		if(ConfirmPage == 1) {
			page = Integer.parseInt( JOptionPane.showInputDialog("input book page,again:"));
			book1.setPage(page);
		}
		JOptionPane.showMessageDialog(null,"Book Title"+ title +"\nAuthor name :" + book1.getAuthor().getName()+"("+page+ "Page)"+ "\nAuthor e-mail:"+book1.getAuthor().getEmail());
		
	}

}
