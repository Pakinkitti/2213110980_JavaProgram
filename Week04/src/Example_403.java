import javax.swing.*;
import java.util.*;
public class Example_403 {

	public static void main(String[] args) {
		/*
		Scanner scan = new Scanner (System.in);
		System.out.print("Input a sentence : ");
		String sentence = scan.nextLine();
		while(!sentence.endsWith("."));{
		System.out.print("Input a sentence, again: ");
		sentence = scan.nextLine();
		}
		System.out.println();
		int spaceofword = 0;
		for(int i = 0;i<sentence.length();i++) {
			if(sentence.charAt(i)==' ') {
				spaceofword++;
			}
		}
		System.out.println("This sentence has"+ spaceofword + "spacebar.");
		System.out.println("This sentence has"+ (spaceofword +1)+ "word.");*/
		String sentence =JOptionPane.showInputDialog("Input a sentence : ");
		while(!sentence.endsWith("."));{
			JOptionPane.showInputDialog("Input a sentence, again: ");
		}
		int spaceofword = 0;
		for(int i = 0;i<sentence.length();i++) {
			if(sentence.charAt(i)==' ') {
				spaceofword++;
			}
		}
		JOptionPane.showMessageDialog(null, "This sentence has"+ spaceofword + "spacebar."+"\nThis sentence has"+ (spaceofword +1)+ "word.");

	}

}
