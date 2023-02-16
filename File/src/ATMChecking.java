import java.io.*;
import java.text.*;
public class ATMChecking extends ATMData{
	private int money;
	public ATMChecking(String account,String password,int money) {
		super(account,password);
		this.money = 0;
	}
	public boolean checkBookBank() throws IOException{
		BufferedReader read = new BufferedReader(new FileReader("ATMBookBank.txt"));
		String temp = "";
		String[] data = temp.split("\t");
		money = Integer.parseInt(data[2]);
		if(super.getID() != data[0]) {
			return true;
		}
		if(super.getPass() != data[1]) {
			return true;
		}
		
		return true;
	}//not finish
	public void show() throws IOException  {
		DecimalFormat frm = new DecimalFormat("#,###,###.00");
		if(checkBookBank()==true) {
			int money1000 = money / 1000;
			System.out.println("1000 = "+money1000);
			int money500 =(money % money1000)/5;
			System.out.println("500  = "+money500);
			int money100 = (money % money1000)%5;
			System.out.println("100  = "+money100);
			if(money > 0) {
			System.out.println("Your balance is "+frm.format(money)+"Baht.");
			}
			else {
				System.out.println("Sorry,tour id or password is wrong, or your amount not enough.");
			}
		}
	}
}
