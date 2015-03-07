package reverser;

public class TextReverser {
	static int numberOfCharacters = 0;
	
	public static void reverse(String text){
		System.out.print(text.charAt(text.length()-1));
		numberOfCharacters++;
		reverse(text, text.length()-1);
		
	}
	public static void reverse(String text, int last){
		if(last > 1){
			System.out.print(text.charAt(last-1));
			numberOfCharacters++;
			reverse(text, last-1);
		}else{
			System.out.println("\nAntall tegn: " + numberOfCharacters);
			numberOfCharacters = 0;
		}
	}
}

