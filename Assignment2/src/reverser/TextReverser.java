package reverser;

public class TextReverser {
	
	public static void reverse(String text){
		System.out.print(text.charAt(text.length()-1));
		if(text.length() > 1){
			text = text.substring(0, text.length()-1);
			reverse(text);
		}
	}
}
