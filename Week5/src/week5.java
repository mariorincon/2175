import java.util.Scanner;
import javax.swing.JOptionPane;
import java.lang.*
;
public class week5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter String:");
		String text = input.nextLine();

		int count = 0;
		for(int i=0; i<text.length(); i++) {
			char c = text.charAt(i);
			if(c == ' '){
				count ++;
			}
		}
		System.out.println(count + " empty spaces in \"" + text + "\"");
		
		JOptionPane dialog = new JOptionPane();
		String text2 = dialog.showInputDialog("Enter a customer number in the form LLLNNNN");
		boolean validator = true;
		int validCounter = 0;
		
		for(int i=0; i<text2.length(); i++) {
			char c = text2.charAt(i);
			if(i < 3) {
				if(Character.isDigit(c)){
				validCounter ++;
				}else {
					validator = false;
				}
			}else if(Character.isLetter(c)){
					validCounter ++;
				}else {
					validator = false;
				}
				
		}
			if(validator)
				dialog.showMessageDialog(null, "That's a valid customer");
			else
				dialog.showMessageDialog(null, "Invalid customer");
			
			
	}

}
