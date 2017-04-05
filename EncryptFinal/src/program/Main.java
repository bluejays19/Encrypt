package program;

import java.util.Scanner;


public class Main {
	
	private static Scanner scan;

	public static void main(String[] args){
		scan = new Scanner(System.in);
		System.out.println("Enter a phrase to encrypt and write");
		String phrase = scan.nextLine();
		
		DataWriter.write(Bitshifter.encrypt(phrase));
	}
}
