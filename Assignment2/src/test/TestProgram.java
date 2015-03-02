package test;
import java.util.Scanner;

import reverser.TextReverser;

public class TestProgram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Skriv inn tekst for å reversere.");
		String userInput = scanner.nextLine();
		
		TextReverser.reverse(userInput);
			
	}

}
