package c;

import java.util.Scanner;

public class Tester {
	public static void main(String[] args){
		System.out.println("Start Input");
		Scanner keyboard = new Scanner(System.in);
		int numChar = Integer.parseInt(keyboard.nextLine());
		String cipher = keyboard.nextLine();
		String msg = keyboard.nextLine();
		keyboard.nextLine();
		
		Encryption test = new Encryption(numChar, cipher, msg);		
		System.out.println(test.encrypt());
		keyboard.close();
	}
}
