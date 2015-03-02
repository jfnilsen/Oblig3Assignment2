package reverser;

public class TextReverser {
	static int numberOfCharacters = 0;
	public static void reverse(String text){
		System.out.print(text.charAt(text.length()-1));
		numberOfCharacters++;
		if(text.length() > 1){
			text = text.substring(0, text.length()-1);
			reverse(text);
		}else{
			System.out.println("\nAntall tegn: " + numberOfCharacters);
			numberOfCharacters = 0;
		}
		
	}
}
