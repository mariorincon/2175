import java.util.Scanner;

public class TelephoneDemo {

	public static void main(String[] args) {
		Telephone tel = new Telephone();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a telephone number:");
		String phone = input.nextLine();
		
		if(tel.isFormatted(phone)) {
			System.out.println("Unformatted: " + tel.unformat(phone));
		}
		else
			System.out.println("Formatted: " + tel.format(phone));

	}

}
