package a;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Number of Entries:");
		int num = keyboard.nextInt();
		
		int[] entries = generateRandomEntries(num);
		DayCare dayCare = new DayCare(num, entries);
		dayCare.output();
		keyboard.close();
	}

	private static int[] generateRandomEntries(int num) {
		int[] entries = new int[num];
		for(int i = 0; i < num; i++)
		{
			entries[i] = (int)(Math.random() * 10000) + (-10000);
		}
		return entries;
	}

}
