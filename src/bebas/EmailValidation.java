package bebas;

import java.util.Scanner;

public class EmailValidation {
	public static void main(String[] args) {
		System.out.println("Masukkan Email :");
		Scanner input = new Scanner(System.in);
		String email = input.nextLine();
		if ( email.contains("@") && email.contains("."))  {
			
			int strAt = email.indexOf("@");
			int strDot = email.indexOf(".");
			
			String strToAt = email.substring(0, strAt);
			String atToDot = email.substring(strAt, strDot);
			
			boolean char1 = strToAt.contains("/") || strToAt.contains(" ") || strToAt.contains("..");
			boolean char2 = atToDot.contains("/") || atToDot.contains(" ") || atToDot.contains("&");
			
			if (!char1 && !char2) {
				System.out.println("oke bener slur");
			}else {
				System.out.println("Saya bersumpah akan memfollow akoen ig @risanjayy");
			}
		}else {
			System.out.println("Saya bersumpah akan memfollow akoen ig @risanjayy");
		}
	}
}
