package c;

import java.util.Scanner;

public class Tester {
	public static void main(String[] args) throws InvalidInputException{
		System.out.println("Start Input");
		Scanner keyboard = new Scanner(System.in);
		int numChar = 0;
		try{
			numChar = Integer.parseInt(keyboard.nextLine());
		}
		catch(NumberFormatException e){
			getRekt();
		}

		String cipher = keyboard.nextLine();
		String msg = keyboard.nextLine();
		
		int y = 0;
		try{
			y = Integer.parseInt(keyboard.nextLine());
		}
		catch(NumberFormatException e){
			getRekt();
		}
		
		if(y != -1)
			getRekt();
		Encryption test = new Encryption(numChar, cipher, msg);		
		System.out.println(test.encrypt());
		keyboard.close();
	}
	
	public static void getRekt() throws InvalidInputException{
		throw new InvalidInputException();
	}
}
